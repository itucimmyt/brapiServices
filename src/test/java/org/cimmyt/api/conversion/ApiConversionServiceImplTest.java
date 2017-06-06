package org.cimmyt.api.conversion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

import java.util.Arrays;
import java.util.List;

import org.cimmyt.api.ApiFormat;
import org.cimmyt.api.ApiTO;
import org.cimmyt.config.EndpointFormat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

@RunWith(BlockJUnit4ClassRunner.class)
public class ApiConversionServiceImplTest {

	private ApiConversionService<String> testObject = 
			new ApiConversionServiceImpl<>(Arrays.asList(new ApiConverterX(),new ApiConverterY()));
	
	
	@Before
	public void before() {
		setAllowExtractingPrivateFields(true);
	}
	
	@Test
	public void testConvertPageOfT() {
		EndpointFormat.setCurrent(ApiFormat.DAL);
		Page<String> tester = new PageImpl<>(Arrays.asList("A","B","C"), new PageRequest(1, 50), 200);
		Page<ApiTO<String>> result = testObject.convert(tester);
		
		assertThat(result.getContent())
			.extracting("val")
			.contains("DAL-A","DAL-B","DAL-C");
	}

	@Test
	public void testConvertListOfT() {
		EndpointFormat.setCurrent(ApiFormat.DAL);
			List<ApiTO<String>> result = testObject.convert(Arrays.asList("A","B","C"));
			
			assertThat(result)
				.extracting("val")
				.contains("DAL-A","DAL-B","DAL-C");

	}
	
	@Test
	public void testConvertListOfT2() {
		EndpointFormat.setCurrent(ApiFormat.BRAPI);
			List<ApiTO<String>> result = testObject.convert(Arrays.asList("A","B","C"));
			
			assertThat(result)
				.extracting("val")
				.contains("BR-A","BR-B","BR-C");

	}

	@ApiConversion(ApiFormat.DAL)
	private class ApiConverterX implements ApiConverter<String>{
		@Override
		public ApiTO<String> convert(String source) {
			return new MyTO("DAL-"+source);
		}
		
	}
	@ApiConversion(ApiFormat.BRAPI)
	private class ApiConverterY implements ApiConverter<String>{
		@Override
		public ApiTO<String> convert(String source) {
			return new MyTO("BR-"+source);
		}
		
	}
	
	private class MyTO implements ApiTO<String> {
		@SuppressWarnings("unused")
		String val;
		MyTO(String val) {
			this.val = val;
		}
	}

}
