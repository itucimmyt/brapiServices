package org.cimmyt.api.brapi.to;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

import org.cimmyt.api.JavaBeanTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class BrStudyTOTest implements JavaBeanTest{

	@Test
	@Override
	public void hasValidMutators() {
		setAllowExtractingPrivateFields(false);
		
		BrStudyTO testObject = new BrStudyTO();
		testObject.setStartDate("2017");
		testObject.setStudyName("a name");
		testObject.setLocationDbId(11);
		
		assertThat(testObject)
			.extracting("startDate","studyName","locationDbId")
			.contains("2017","a name",11);
	}

}
