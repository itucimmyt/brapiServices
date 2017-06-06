package org.cimmyt.api.brapi.call;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

import org.cimmyt.api.JavaBeanTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BrPaginationTest implements JavaBeanTest{

	private BrPagination testObject;
	
	
	@Before
	public void before(){
		setAllowExtractingPrivateFields(false);

		testObject = new BrPagination();
		testObject.setCurrentPage(1);
		testObject.setPageSize(5);
		testObject.setTotalCount(100);
		testObject.setTotalPages(20);
	}
	
	@Test
	@Override
	public void hasValidMutators() {
		assertThat(testObject)
			.extracting("currentPage","pageSize","totalCount","totalPages")
			.contains(1,5,100L,20);
	}

}
