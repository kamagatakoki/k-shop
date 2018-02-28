package com.example.sample.service.maintenance;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.example.sample.config.AppConfig;
import com.example.sample.config.DataSourceConfigTest;
import com.example.sample.config.WebMvcConfig;
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
public class GenreLgServiceTest {

	@Autowired
	WebApplicationContext context;

	MockMvc mockMvc;

	@Before
	public void setupMockMvc() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
				.addFilter(new CharacterEncodingFilter("UTF-8"))
				.build();
	}

	@Test
	public void testMaintenanceMenu() throws Exception {

		mockMvc.perform(get("/maintenance"))
				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/maintenance_menu.jsp"));

	}

	@Test
	public void testGenreLgList() throws Exception {

		mockMvc.perform(get("/maintenance/genrelg/list"))
				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", 13));

	}

	@Test
	public void testGenreLgListSearch() throws Exception {

		GenreLgForm genreLgForm = new GenreLgForm();
		genreLgForm.setGenreLgCd("01");

		mockMvc.perform(post("/maintenance/genrelg/list")
				.param("search", "")
				.param("searchGenreLgCd", "01"))

				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/views/maintenance/genrelg_list.jsp"))
				.andExpect(model().attribute("itemsSize", 1));

	}

}
