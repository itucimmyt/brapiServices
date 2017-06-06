package org.cimmyt.api.error;

import javax.servlet.http.HttpServletRequest;

import org.cimmyt.api.brapi.call.BrResponseBuilder;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Returns a NOT_FOUND error message when the requested resource cannot be found in any Resource class 
 * for any BrAPI call, that is when a request cannot be mapped to a Resource's method.
 * @author JAROJAS
 *
 */
@RestController
class GlobalMappingErrorController extends AbstractErrorController {
	private static final String ERROR_MAPPING = "/error";

	public GlobalMappingErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
	}

	/**
	 * Tries to build a NOT_FOUND error message, with an empty body following BrAPI standard
	 * @param request that originated the NOT_FOUND error
	 * @return a NOT_FOUND response body format suitable for the request, or without body if the APIFormat cannot be inferred from request 
	 */
	@RequestMapping(value = "/error")
	public ResponseEntity<BrapiResponse<String>> error(HttpServletRequest request) {

		return new ResponseEntity<>(BrResponseBuilder.forData("")
				.withStatusError("mapping not found:"+ request.getRequestURI())
				.build(), HttpStatus.NOT_FOUND);
	}

	@Override
	public String getErrorPath() {
		return ERROR_MAPPING;
	}
}
