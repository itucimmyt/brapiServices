package org.cimmyt.api.brapi.conversion;

import static org.assertj.core.api.Assertions.assertThat;

import org.cimmyt.api.ApiFormat;
import org.cimmyt.api.ApiTO;
import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.api.conversion.ApiConversion;
import org.cimmyt.model.Study;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class StudyToBrStudyConverterTest {

	private StudyToBrStudyConverter testObject = new StudyToBrStudyConverter();
	private Study tester;
	private BrStudyTO result;
	
	@Test
	public void shouldBeBrapiConverter(){
		ApiConversion[] ann = testObject.getClass().getAnnotationsByType(ApiConversion.class);

		assertThat(ann).isNotNull();
		assertThat(ann[0].value()).isEqualTo(ApiFormat.BRAPI);
		
	}
	
	@Test
	public void shouldConvert() {
		tester = new Study();
		tester.setName("my name");
		tester.setTitle("my title");
		tester.setYear(2017);
		tester.setId(123);
		tester.setNumber(777);
		result = testObject.convert(tester);
		
		assertThat(result)
			.isInstanceOf(BrStudyTO.class);
		
		assertThat(result)
			.extracting("name","title","aYear")
			.contains("my name==>777","my title",2017);
	}
	
	@Test
	public void shouldConvertWithOnlyId() {
		tester = new Study();
		tester.setId(999);
		result = testObject.convert(tester);
		
		assertThat(result)
			.isInstanceOf(BrStudyTO.class);

		assertThat(result)
			.extracting("name","title","aYear")
			.contains(null,null,null);
	}
}
