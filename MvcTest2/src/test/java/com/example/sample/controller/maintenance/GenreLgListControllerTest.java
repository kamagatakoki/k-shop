package com.example.sample.controller.maintenance;

import static com.example.sample.matchers.GlobalErrorsMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.servlet.Filter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.example.sample.config.AppConfig;
import com.example.sample.config.DataSourceConfigTest;
import com.example.sample.config.WebMvcConfig;

/**
 * クラスの説明：大ジャンルサービステスト
 * @author kamagata
 * @since 2018/02/28
 */
@RunWith(SpringRunner.class)
@ContextHierarchy({
		@ContextConfiguration(classes = AppConfig.class),
		@ContextConfiguration(classes = DataSourceConfigTest.class),
		@ContextConfiguration(classes = WebMvcConfig.class)
})
@WebAppConfiguration
@Sql("/com/example/sample/data/maintenance/GenreLgTest.sql")
@Transactional
public class GenreLgListControllerTest {

	@Autowired
	WebApplicationContext context;

	@Autowired
	private Filter resourceUrlEncodingFilter;

	@Autowired
	MessageSource messageSource;

	MockMvc mockMvc;

	/**
	 * メソッドの説明：MVCモックにWebコンテキスト設定、サーブレットフィルタ追加
	 * @author kamagata
	 * @since 2018/03/04
	 */
	@Before
	public void setupMockMvc() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
				.addFilter(new CharacterEncodingFilter("UTF-8")) // エンコード
				.apply(springSecurity()) // SpringSecurity適用
				.addFilter(resourceUrlEncodingFilter) // 静的リソースURLをリゾルバーと連携
				.build();
	}

	/**
	 * メソッドの説明：メニュー画面表示
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@Test
	@WithAnonymousUser
	public void testMaintenanceMenu() throws Exception {

		mockMvc.perform(get("/maintenance"))
				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/maintenance_menu.jsp"));

	}

	/**
	 * メソッドの説明：一覧画面初期表示
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testList() throws Exception {

		mockMvc.perform(get("/maintenance/genrelg/list"))
				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", greaterThan(1)));

	}

	/**
	 * メソッドの説明：一覧画面初期表示(権限なし)
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("user@test.co.jp")
	@Test
	public void testListNoAuth() throws Exception {

		mockMvc.perform(get("/maintenance/genrelg/list"))
				.andExpect(status().isForbidden());

	}

	/**
	 * メソッドの説明：検索実行
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testListSearch() throws Exception {

		mockMvc.perform(post("/maintenance/genrelg/list").with(csrf()) // Get以外の場合はcsrfトークンを含める
				.param("search", "")
				.param("searchGenreLgCd", "90")
				.param("searchGenreLgNm", "ジャンル"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", is(1)));

	}

	/**
	 * メソッドの説明：新規ボタン押下
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testNew() throws Exception {

		mockMvc.perform(post("/maintenance/genrelg/list").with(csrf())
				.param("new", ""))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("newedit"));
	}

	/**
	 * メソッドの説明：編集ボタン押下
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testEdit() throws Exception {

		mockMvc.perform(get("/maintenance/genrelg/newedit").with(csrf())
				.param("edit", "")
				.param("genreLgCd", "90")
				.param("crud", "update"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_newedit.jsp"));
	}

	/**
	 * メソッドの説明：削除チェックNG(中ジャンルデータあり)
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testDeleteCheckNG() throws Exception {

		mockMvc.perform(post("/maintenance/genrelg/list").with(csrf())
				.param("delete", "")
				.param("genreLgCd", "90"))
				.andDo(print()) // リクエストとレスポンスをコンソール出力

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().hasErrors())
				.andExpect(globalErrors().hasGlobalError("genreLgForm",
						"下位ジャンルに紐づくデータがあります。", new String[] {}, messageSource));

	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testDelete() throws Exception {

		// 削除
		mockMvc.perform(post("/maintenance/genrelg/list").with(csrf())
				.param("delete", "")
				.param("genreLgCd", "91"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().hasNoErrors());

		// 削除確認
		mockMvc.perform(post("/maintenance/genrelg/list").with(csrf()) // Get以外の場合はcsrfトークンを含める
				.param("search", "")
				.param("searchGenreLgCd", "91"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", is(0)));

	}

}
