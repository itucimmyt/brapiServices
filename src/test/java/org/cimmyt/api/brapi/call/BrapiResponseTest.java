package org.cimmyt.api.brapi.call;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

import org.cimmyt.api.JavaBeanTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BrapiResponseTest implements JavaBeanTest{

	BrapiResponse<Object> testObject;

	Object result = new Object();;
	BrMetadata metadata = new BrMetadata();

	@Before
	public void before() {
		setAllowExtractingPrivateFields(false);

		testObject = new BrapiResponse<>();
		testObject.setMetadata(metadata);
		testObject.setResult(result);
	}
	
	@Test
	@Override
	public void hasValidMutators() {
		assertThat(testObject)
			.extracting("metadata","result")
			.contains(metadata, result);
	}


}
