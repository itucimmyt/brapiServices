package org.cimmyt.api.brapi.call;

import org.cimmyt.api.ApiResponse;

/**
 * Global format for any paged BrAPI call. Reduction to ApiTO was abandoned in favor of 
 * letting Swagger to do better bean inspection.
 * @author JAROJAS
 *
 * @param <T> the payload type in this response
 */
public class BrapiPagedResponse<T> implements ApiResponse<T>{

	private BrMetadata metadata;
	/**
	 * Contains the payload
	 */
	private BrResult<T> result;
	
	public BrapiPagedResponse() {
		metadata = new BrMetadata();
	}
	
	public BrMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(BrMetadata metadata) {
		this.metadata = metadata;
	}
	public  BrResult<T> getResult() {
		return result;
	}
	public void setResult(BrResult<T> result) {
		this.result = result;
	}
	
}
