package org.cimmyt.api.error;

import javax.servlet.http.HttpServletRequest;

import org.cimmyt.api.brapi.call.BrResponseBuilder;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handler for intercepting and processing (checked) exceptions thrown (and not managed) by BrAPI-controllers.
 * Specific subclasses of {@link Exception} can be grouped in different methods inside this class.
 * For example all Business Logic Exceptions can be returned with code 505, 
 * and all Validation Exceptions with code 400 <br/>
 * @author JAROJAS
 *
 */
@RestControllerAdvice(basePackages={"org.cimmyt.api.brapi.resource"})
public class BrapiErrorHandlerAdvice {

	/**
	 * Method to catch all exceptions extending {@link Exception}. Responds with code 500.
	 * Further specializations may come along with new features.
	 * @param request originating the exception
	 * @param handler controlling given request
	 * @param exception to be processed
	 * @return a {@link BrapiResponse response} with http status code 500 (Internal Server Error)
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public BrapiResponse<String> dispatchServerError(HttpServletRequest request, Object handler, Exception exception) {
		return BrResponseBuilder.forError(exception.getMessage());
	}
}
