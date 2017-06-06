package org.cimmyt.model;

public class RestOperations {
	
	private String dalRestOperation;
	
	private RestOperations(String dalOp){
		this.dalRestOperation = dalOp;
	}
	

	public String getDalRestOperation() {
		return dalRestOperation;
	}

	public void setDalRestOperation(String dalRestOperation) {
		this.dalRestOperation = dalRestOperation;
	}
	
	
	public static RestOperations getInstanceMsg(String msg){
		return new RestOperations(msg);
	}	
	

}
