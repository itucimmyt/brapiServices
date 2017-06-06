package org.cimmyt.api.brapi.call;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

import org.cimmyt.api.JavaBeanTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BrStatusTest implements JavaBeanTest{
	
	@Test
	@Override
	public void hasValidMutators() {
		setAllowExtractingPrivateFields(false);

		assertThat(BrStatus.ERROR)
			.hasFieldOrProperty("code")
			.hasFieldOrProperty("message");
		
		
	}

}
