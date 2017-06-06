package org.cimmyt.api.brapi.call;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

import java.util.ArrayList;
import java.util.List;

import org.cimmyt.api.JavaBeanTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BrMetadataTest implements JavaBeanTest {

	BrMetadata testObject;

	BrPagination pagination = new BrPagination();
	List<BrStatus> status = new ArrayList<>();

	@Before
	public void before() {
		setAllowExtractingPrivateFields(false);

		testObject = new BrMetadata();
		testObject.setPagination(pagination);
		testObject.setStatus(status);
	}
	
	@Test
	@Override
	public void hasValidMutators() {
		assertThat(testObject)
		.extracting("pagination","status")
			.contains(pagination, status);
	}

}
