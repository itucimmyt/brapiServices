package org.cimmyt.api.brapi.call;

/**
 * Models status section of a BrAPI response as well as status codes and messages
 * @author JAROJAS
 *
 */
class BrStatus {

	private int code;
	private String message;
	static final int SUCCESS_CODE = 0;
	static final int ERROR_CODE = 1;
	
	static final BrStatus SUCCESS = new BrStatus(SUCCESS_CODE, "success");
	static final BrStatus ERROR = new BrStatus(ERROR_CODE, "server error");
	
	BrStatus(int code,String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode(){
		return code;
	}
	public String getMessage(){
		return message;
	}


}
