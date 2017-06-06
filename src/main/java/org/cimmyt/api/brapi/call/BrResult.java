package org.cimmyt.api.brapi.call;

import java.util.List;

/**
 * 
 * @author JAROJAS
 *
 * @param <T> the payload data type
 */
public class BrResult<T> {

	private List<T> data;

	public BrResult(List<T> data) {
		super();
		this.data = data;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
