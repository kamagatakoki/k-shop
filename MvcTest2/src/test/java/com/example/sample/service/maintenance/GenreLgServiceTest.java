package com.example.sample.service.maintenance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.config.AppConfig;
import com.example.sample.config.DataSourceConfigTest;
import com.example.sample.config.WebMvcConfig;
import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.form.maintenance.GenreLgForm;

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
public class GenreLgServiceTest {

	@Autowired
	GenreLgService genrelgService;

	/**
	 * メソッドの説明：プライマリ検索
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@Test
	public void findGenreLgFindOne() throws Exception {

		GenreLgEntity genreLgEntity = genrelgService.findOne("90");
		assertThat(genreLgEntity.getGenreLgNm(), is("テストジャンル１"));
	}

	/**
	 * メソッドの説明：動的検索
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@Test
	public void findGenreLgCriteria1() throws Exception {

		GenreLgForm genreLgForm = new GenreLgForm();
		genreLgForm.setSearchGenreLgCd("90");

		List<GenreLgEntity> genreLgEntities = genrelgService.findGenreLgCriteria(genreLgForm);
		assertThat(genreLgEntities.size(), is(1));
		assertThat(genreLgEntities.get(0).getGenreLgNm(), is("テストジャンル１"));
		assertThat(genreLgEntities.get(0).getDisplayOrder(), is(66));
	}

	/**
	 * メソッドの説明：動的検索2
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	@Test
	public void findGenreLgCriteria2() throws Exception {

		GenreLgForm genreLgForm = new GenreLgForm();
		genreLgForm.setSearchGenreLgNm("ジャンル");

		List<GenreLgEntity> genreLgEntities = genrelgService.findGenreLgCriteria(genreLgForm);
		assertThat(genreLgEntities.size(), is(greaterThan(0)));
		assertThat(genreLgEntities.get(0).getGenreLgNm(), is("テストジャンル１"));
		assertThat(genreLgEntities.get(0).getDisplayOrder(), is(66));
		assertThat(genreLgEntities.get(1).getGenreLgNm(), is("テストジャンル２"));
		assertThat(genreLgEntities.get(1).getDisplayOrder(), is(77));
	}

	/**
	 * メソッドの説明：登録・更新・削除
	 * @author kamagata
	 * @since 2018/03/04
	 * @throws Exception e
	 */
	// @WithMockUser
	@WithUserDetails("test@test.co.jp")
	@Test
	public void insertUpdateDelete() throws Exception {

		//insert
		GenreLgEntity genreLgEntity = new GenreLgEntity();
		genreLgEntity.setGenreLgCd("92");
		genreLgEntity.setGenreLgNm("テストジャンル３");
		genreLgEntity.setDisplayOrder(88);

		genrelgService.insert(genreLgEntity);

		genreLgEntity = new GenreLgEntity();
		genreLgEntity = genrelgService.findOne("92");
		assertThat(genreLgEntity.getGenreLgNm(), is("テストジャンル３"));
		assertThat(genreLgEntity.getDisplayOrder(), is(88));

		// update
		genreLgEntity = new GenreLgEntity();
		genreLgEntity.setGenreLgCd("92");
		genreLgEntity.setGenreLgNm("修正：テストジャンル３");
		genreLgEntity.setDisplayOrder(99);

		genrelgService.update(genreLgEntity);

		genreLgEntity = new GenreLgEntity();
		genreLgEntity = genrelgService.findOne("92");
		assertThat(genreLgEntity.getGenreLgNm(), is("修正：テストジャンル３"));
		assertThat(genreLgEntity.getDisplayOrder(), is(99));

		// delete
		genrelgService.delete("92");
		genreLgEntity = new GenreLgEntity();
		genreLgEntity = genrelgService.findOne("92");
		assertNull(genreLgEntity);
	}

}
