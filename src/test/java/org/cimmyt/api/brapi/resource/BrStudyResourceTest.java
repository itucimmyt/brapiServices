package org.cimmyt.api.brapi.resource;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.config.InteropApplication;
import org.cimmyt.service.BrStudyService;
import org.cimmyt.test.util.TestResource;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InteropApplication.class)
@AutoConfigureMockMvc
public class BrStudyResourceTest {

	@Autowired
	private MockMvc mvc;
	@MockBean
	BrStudyService studyService;
	@MockBean
	ConversionService studyConversionService;

	@Autowired
	private TestResource resource;

	private static Page<BrStudyTO> brapiTestStudies;

	@BeforeClass
	public static void beforeClass() {
		BrStudyTO s1 = new BrStudyTO();
		BrStudyTO s2 = new BrStudyTO();

		s1.setStartDate("1999");
		s1.setStudyName("a name1");
		s1.setLocationDbId(11);
		s2.setStartDate("2000");;
		s2.setStudyName("a name2");
		s2.setLocationDbId(22);
		brapiTestStudies = new PageImpl<>(Arrays.asList(s1, s2), new PageRequest(0, 2), 2);
	}

	@Mock
	Page<BrStudyTO> studyPageStub;

	@Before
	public void before() {
		given(studyService.searchStudies(any(),any())).willReturn(studyPageStub);
	}

	@Test
	public void shouldReturnStudies() throws Exception {
		given(studyConversionService.convert(studyPageStub.getContent().get(0),BrStudyTO.class)).willReturn(brapiTestStudies.getContent().get(0));

		mvc.perform(get("/brapi/study").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(resource.getJsonFile("brapiStudies")));

	}

}
