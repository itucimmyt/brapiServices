package org.cimmyt.api.brapi.call;

/**
 * Models pagination section of a BrAPI response
 * @author JAROJAS
 *
 */
class BrPagination {

	private int pageSize;
	private int currentPage;
	private long totalCount;
	private int totalPages;
	
	public BrPagination(){}
	
	public BrPagination(int pageSize, int currentPage, long totalCount,
			int totalPages) {
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.totalPages = totalPages;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
}
