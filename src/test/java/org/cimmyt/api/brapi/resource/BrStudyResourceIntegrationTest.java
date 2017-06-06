package org.cimmyt.api.brapi.resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.cimmyt.config.InteropApplication;
import org.cimmyt.test.util.TestResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InteropApplication.class)
@AutoConfigureMockMvc
public class BrStudyResourceIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private TestResource resource;

	@Test
	public void shouldReturnStudiesWithDefaultPagination() throws Exception {
		mvc.perform(get("/brapi/study").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(resource.getJsonFile("brapiStudies-Integration")));

	}
	
	@Test
	public void shouldReturnStudiesWithCustomPagination() throws Exception {
		mvc.perform(get("/brapi/study?page=3&pageSize=5").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(resource.getJsonFile("brapiStudies-Integration2")));

	}
}
