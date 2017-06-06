package org.cimmyt.api.brapi.call;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Models metadata section of a BrAPI response
 * @author JAROJAS
 *
 */
@JsonInclude(value=Include.NON_NULL)
class BrMetadata {

	private BrPagination pagination;
	private List<BrStatus> status;
	private List<String> dataFiles;
	
	public BrMetadata() {
	}
	
	public BrMetadata(BrPagination pagination, List<BrStatus> status) {
		this.pagination = pagination;
		this.status = status;
	}
	
	public BrPagination getPagination() {
		return pagination;
	}
	public void setPagination(BrPagination pagination) {
		this.pagination = pagination;
	}
	public List<BrStatus> getStatus() {
		return status;
	}
	public void setStatus(List<BrStatus> status) {
		this.status = status;
	}

	public List<String> getDataFiles() {
		return dataFiles;
	}

	public void setDataFiles(List<String> dataFiles) {
		this.dataFiles = dataFiles;
	}
}
