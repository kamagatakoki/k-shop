package com.example.sample.controller.maintenance;

import static com.example.sample.matchers.FieldErrorsMatchers.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import javax.servlet.Filter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.config.AppConfig;
import com.example.sample.config.DataSourceConfigTest;
import com.example.sample.config.WebMvcConfig;
import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.form.maintenance.GenreLgForm;
import com.example.sample.service.maintenance.GenreLgService;

import mockit.Expectations;

/**
 * クラスの説明：大ジャンル詳細コントローラーテスト
 * @author kamagata
 * @since 2018/03/04
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
public class GenreLgDetailControllerTest {

	@Autowired
	WebApplicationContext context;

	@Autowired
	private Filter resourceUrlEncodingFilter;

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
	 * メソッドの説明：初期表示(新規)
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testNewOpen() throws Exception {

		mockMvc.perform(get("/maintenance/genrelg/newedit")
				.param("new", "")
				.param("crud", "insert"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_newedit.jsp"))
				.andExpect(model().attributeExists("genreLgForm"));

	}

	/**
	 * メソッドの説明：初期表示(編集)
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testEditOpen() throws Exception {

		MvcResult mvcResult = mockMvc.perform(get("/maintenance/genrelg/newedit")
				.param("edit", "")
				.param("genreLgCd", "90")
				.param("crud", "update"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_newedit.jsp"))
				.andReturn();

		// modelの中身(genreLgForm)検証
		ModelMap modelMap = mvcResult.getModelAndView().getModelMap();
		Object object = modelMap.get("genreLgForm");
		assertThat(object, is(instanceOf(GenreLgForm.class)));
		GenreLgForm genreLgForm = (GenreLgForm) object;
		assertThat(genreLgForm.getGenreLgCd(), is("90"));
		assertThat(genreLgForm.getGenreLgNm(), is("テストジャンル１"));
		assertThat(genreLgForm.getDisplayOrder(), is(66));

	}

	/**
	 * メソッドの説明：入力チェック(新規)
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testRegistCheck() throws Exception {

		// **************** @Validatedを有効にするために、jsp-apiのバージョンを2.2に、tomcat-embed-elの依存性を追加 *******************

		GenreLgForm genreLgForm = new GenreLgForm();

		// 未入力エラー
		mockMvc.perform(post("/maintenance/genrelg/newedit").with(csrf())
				.param("regist", "")
				.param("crud", "insert")
				.flashAttr("genreLgForm", genreLgForm))
				// .andDo(print()) // リクエストとレスポンスをコンソール出力

				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgCd", "必須項目です。"))
				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgNm", "必須項目です。"))
				.andExpect(fieldError().hasFieldError("genreLgForm", "displayOrder", "必須項目です。"));

		// 文字数エラー(下限)
		genreLgForm.setGenreLgCd("0");
		genreLgForm.setGenreLgNm("");
		genreLgForm.setDisplayOrder(0);
		mockMvc.perform(post("/maintenance/genrelg/newedit").with(csrf())
				.param("regist", "")
				.param("crud", "insert")
				.flashAttr("genreLgForm", genreLgForm))
				// .andDo(print()) // リクエストとレスポンスをコンソール出力

				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgCd", "2文字で入力してください。"))
				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgNm", "1文字以上50文字以下にして下さい。"))
				.andExpect(fieldError().hasFieldError("genreLgForm", "displayOrder", "1以上を入力して下さい。"));

		// 文字数エラー(上限)
		genreLgForm.setGenreLgCd("123");
		genreLgForm.setGenreLgNm("123456789012345678901234567890123456789012345678901");
		genreLgForm.setDisplayOrder(100);
		mockMvc.perform(post("/maintenance/genrelg/newedit").with(csrf())
				.param("regist", "")
				.param("crud", "insert")
				.flashAttr("genreLgForm", genreLgForm))
				// .andDo(print()) // リクエストとレスポンスをコンソール出力

				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgCd", "2文字で入力してください。"))
				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgNm", "1文字以上50文字以下にして下さい。"))
				.andExpect(fieldError().hasFieldError("genreLgForm", "displayOrder", "99以下を入力して下さい。"));

		// 重複チェック
		genreLgForm.setGenreLgCd("90");
		genreLgForm.setGenreLgNm("テスト");
		genreLgForm.setDisplayOrder(1);
		mockMvc.perform(post("/maintenance/genrelg/newedit").with(csrf())
				.param("regist", "")
				.param("crud", "insert")
				.flashAttr("genreLgForm", genreLgForm))
				// .andDo(print()) // リクエストとレスポンスをコンソール出力

				.andExpect(fieldError().hasFieldError("genreLgForm", "genreLgCd", "重複しています。"));
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @since 2018/03/05
	 * @throws Exception e
	 */
	@WithUserDetails("auth@test.co.jp")
	@Test
	public void testInsertUpdate() throws Exception {

		GenreLgForm genreLgForm = new GenreLgForm();

		new Expectations() {

			GenreLgService genreLgService;

			{
				genreLgService.insert(new GenreLgEntity());
				times = 1;
			}
		};

		// 登録
		genreLgForm.setGenreLgCd("92");
		genreLgForm.setGenreLgNm("テストジャンル");
		genreLgForm.setDisplayOrder(10);
		mockMvc.perform(post("/maintenance/genrelg/newedit").with(csrf())
				.param("regist", "")
				.param("crud", "insert")
				.flashAttr("genreLgForm", genreLgForm))
				// .andDo(print()) // リクエストとレスポンスをコンソール出力

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("list"));

		// 登録検証
		MvcResult mvcResultInsert = mockMvc.perform(post("/maintenance/genrelg/list").with(csrf()) // Get以外の場合はcsrfトークンを含める
				.param("search", "")
				.param("searchGenreLgCd", "92"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", is(1)))
				.andReturn();

		ModelAndView modelAndView = mvcResultInsert.getModelAndView();
		ModelMap modelMap = modelAndView.getModelMap();
		@SuppressWarnings("unchecked")
		List<GenreLgEntity> genreLgEntities = (List<GenreLgEntity>) modelMap.get("items");
		assertThat(genreLgEntities.get(0).getGenreLgCd(), is("92"));
		assertThat(genreLgEntities.get(0).getGenreLgNm(), is("テストジャンル"));
		assertThat(genreLgEntities.get(0).getDisplayOrder(), is(10));

		// 更新
		genreLgForm.setGenreLgCd("92");
		genreLgForm.setGenreLgNm("修正：テストジャンル");
		genreLgForm.setDisplayOrder(11);
		mockMvc.perform(post("/maintenance/genrelg/newedit").with(csrf())
				.param("regist", "")
				.param("crud", "update")
				.flashAttr("genreLgForm", genreLgForm))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("list"));

		// 更新検証
		MvcResult mvcResultUpdate = mockMvc.perform(post("/maintenance/genrelg/list").with(csrf()) // Get以外の場合はcsrfトークンを含める
				.param("search", "")
				.param("searchGenreLgCd", "92"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", is(1)))
				.andReturn();

		modelAndView = mvcResultUpdate.getModelAndView();
		modelMap = modelAndView.getModelMap();
		@SuppressWarnings("unchecked")
		List<GenreLgEntity> genreLgEntitiesUpdate = (List<GenreLgEntity>) modelMap.get("items");
		assertThat(genreLgEntitiesUpdate.get(0).getGenreLgCd(), is("92"));
		assertThat(genreLgEntitiesUpdate.get(0).getGenreLgNm(), is("修正：テストジャンル"));
		assertThat(genreLgEntitiesUpdate.get(0).getDisplayOrder(), is(11));

	}

}
