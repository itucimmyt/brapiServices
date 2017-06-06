package org.cimmyt.api.brapi.call;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

public class BrResponseBuilderTest {

	private String data = "testData";
	private Page<String> stubPage = new PageImpl<>(Collections.emptyList(), new PageRequest(1, 50), 100);
	private BrPagination stubPagination = new BrPagination(50, 1, 100, 2);
			
	@Test
	public void shouldBuildNoPagedSuccessResponse() {
		BrapiResponse<String> testObject = BrResponseBuilder.forData(data)
			.withStatusSuccess()
		.build();
		
		BrapiResponse<String> expected = new BrapiResponse<>();
		expected.setResult("testData");
		BrMetadata meta = new BrMetadata();
			meta.setStatus(Arrays.asList(BrStatus.SUCCESS));
			meta.setPagination(new BrPagination(0, 0, 0, 0));
		expected.setMetadata(meta);
		
		
		assertThat(testObject).isEqualToComparingFieldByFieldRecursively(expected);
	}
	
	@Test
	public void shouldBuildPagedSuccessResponse() {
		BrapiPagedResponse<String> testObject = BrResponseBuilder.forData(stubPage)
			.withStatusSuccess()
		.build();
		
		BrapiResponse<String> expected = new BrapiResponse<>();
		expected.setResult("testData");
	
		BrMetadata meta = new BrMetadata();
		meta.setStatus(Arrays.asList(BrStatus.SUCCESS));
		meta.setPagination(stubPagination);
		expected.setMetadata(meta);
				
		assertThat(testObject).isEqualToComparingFieldByFieldRecursively(expected);
	}

	@Test
	public void shouldBuildNoPagedErrorResponse() {
		BrapiResponse<String> testObject = BrResponseBuilder.forData(data)
			.withStatusError()
			.build();
		
		BrapiResponse<String> expected = new BrapiResponse<>();
		expected.setResult("testData");
		BrMetadata meta = new BrMetadata();
			meta.setStatus(Arrays.asList(BrStatus.ERROR));
			meta.setPagination(new BrPagination(0, 0, 0, 0));
		expected.setMetadata(meta);
		
		
		assertThat(testObject).isEqualToComparingFieldByFieldRecursively(expected);
	}
	
	@Test
	public void shouldBuildPagedErrorResponse() {
		BrapiPagedResponse<String> testObject = BrResponseBuilder.forData(stubPage)
			.withStatusError()
			.build();
		
		BrapiResponse<String> expected = new BrapiResponse<>();
		expected.setResult("testData");
	
		BrMetadata meta = new BrMetadata();
		meta.setStatus(Arrays.asList(BrStatus.ERROR));
		meta.setPagination(stubPagination);
		expected.setMetadata(meta);
				
		assertThat(testObject).isEqualToComparingFieldByFieldRecursively(expected);
	}

	
}
