package org.cimmyt.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * In previous versions, configured the EndpointHandler by thread and request accordingly to the API format requested.
 * Now is only a legacy method for logging BrAPI calls
 * @author JAROJAS
 *
 */
class EndpointHandler extends HandlerInterceptorAdapter {

	private static final Logger LOG = LoggerFactory.getLogger(EndpointHandler.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		LOG.info("Request received: {}", request.getRequestURI());
		
		return super.preHandle(request, response, handler);
	}
}
