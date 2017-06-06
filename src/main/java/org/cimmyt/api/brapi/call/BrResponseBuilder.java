package org.cimmyt.api.brapi.call;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

/**
 * Convenient class for dispatching any service response in BrAPI format.
 * @author JAROJAS
 *
 */
public class BrResponseBuilder {

private static BrResponseBuilder responseBuilder = new BrResponseBuilder();
	
	private BrResponseBuilder(){}

	/**
	 * Builder's entry point
	 * @param payload to add in the response
	 * @return intermediate {@link Response} for further configuration
	 */
	public static <T>BasicBuilder<T> forData(T payload){
		return responseBuilder.new BasicBuilder<T>(payload);
	}

	public static <T>PagedBuilder<T> forData(Page<T> payload){
		return responseBuilder.new PagedBuilder<T>(payload);
	}
	
	public static BrapiResponse<String> forError(String errorMessage){
	return responseBuilder.new BasicBuilder<String>("")
			.withStatusError(errorMessage)
			.build();
	}

	
	private class Builder<T> {
		protected BrMetadata meta;
		protected T payload;
		protected Page<T> payloadPage;
		
		private Builder(T payload){ 
			meta = new BrMetadata();
			meta.setStatus(new ArrayList<>());
			meta.setDataFiles(new ArrayList<>());
			this.payload = payload;
		}
		private Builder(Page<T> payloadPage){
			meta = new BrMetadata();
			meta.setStatus(new ArrayList<>());
			meta.setDataFiles(new ArrayList<>());
			this.payloadPage = payloadPage;
		}
		
		private void addStatusSuccess(){
			addStatus(BrStatus.SUCCESS);
		}
		private void addStatusError(){
			addStatus(BrStatus.ERROR);
		}
		private void addStatusError(String message){
			addStatus(new BrStatus(BrStatus.ERROR_CODE, message));
		}
		
		private void addStatus(BrStatus status){
			meta.getStatus().add(status);			
		}
		
		private void addDataFile(String dataFileUrl){
			meta.getDataFiles().add(dataFileUrl);
		}
		
		private void withNoPagination() {
			addPagination(new EmptyPage(Collections.emptyList()));
		}
		private void withPagination(Page<T> page) {
			addPagination(page);
		}
		
		private void addPagination(Page<?> page){
			meta.setPagination(
					new BrPagination(page.getSize(),
							page.getNumber(),
							page.getTotalElements(),
							page.getTotalPages()));
		}
		
		/**
		 * BrAPI requires total pages to be 0 for no-pagination metadata. Superclass defaults to 1
		 */
		class EmptyPage extends PageImpl<T>{
			private static final long serialVersionUID = 2L;

			public EmptyPage(List<T> content) {	super(content);	}

			/**
			 * Override to align with BrAPI spec
			 */
			@Override
			public int getTotalPages() { return 0; }
			
		}
		
	}
	
	public class BasicBuilder<T> extends BrResponseBuilder.Builder<T>{
			private BasicBuilder(T payload){
				super(payload);
				super.withNoPagination();
			}
		
			public BrapiResponse<T> build(){
				BrapiResponse<T> response = new BrapiResponse<T>();
				response.setMetadata(this.meta);
				response.setResult(this.payload);
			
				return response;
			}
			
			public BasicBuilder<T> withStatusSuccess(){
				super.addStatusSuccess();
				return this;
			}
			public BasicBuilder<T> withStatusError(){
				super.addStatusError();
				return this;
			}
			public BasicBuilder<T> withStatusError(String message){
				super.addStatusError(message);
				return this;
			}
			public BasicBuilder<T> withDataFile(String dataFileUrl){
				super.addDataFile(dataFileUrl);
				return this;
			}
			
			
	}

	public class PagedBuilder<T> extends BrResponseBuilder.Builder<T>{
		private PagedBuilder(Page<T> payloadPage){
			super(payloadPage);
			super.withPagination(payloadPage);
		}
		
		public BrapiPagedResponse<T> build() {
			BrapiPagedResponse<T> response = new BrapiPagedResponse<T>();
			response.setMetadata(this.meta);
			response.setResult(new BrResult<T>(this.payloadPage.getContent()));
			
			return response;
		}

		public PagedBuilder<T> withStatusSuccess(){
			super.addStatusSuccess();
			return this;
		}
		public PagedBuilder<T> withStatusError(){
			super.addStatusError();
			return this;
		}
		public PagedBuilder<T> withStatusError(String message){
			super.addStatusError(message);
			return this;
		}
		public PagedBuilder<T> withDataFile(String dataFileUrl){
			super.addDataFile(dataFileUrl);
			return this;
		}
	}
}
