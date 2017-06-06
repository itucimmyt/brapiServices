package org.cimmyt.config;

import org.cimmyt.api.ApiFormat;

/**
 * Static Thread Local variable to identify the {@link ApiFormat} of the requested REST endpoint
 * @author JAROJAS
 *
 */
public class EndpointFormat {

	private static final ThreadLocal<ApiFormat> endpointLocal = new ThreadLocal<>();

	public static ApiFormat getCurrent() {
		return endpointLocal.get();
	}

	public static void setCurrent(ApiFormat apiFormat) {
		endpointLocal.set(apiFormat);
	}

}
