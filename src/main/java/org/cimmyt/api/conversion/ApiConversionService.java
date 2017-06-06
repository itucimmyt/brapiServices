package org.cimmyt.api.conversion;

import java.util.List;

import org.cimmyt.api.ApiTO;
import org.springframework.data.domain.Page;

/**
 * Specialized Conversion Service for API's domain objects
 * @author JAROJAS
 *
 * @param <T>
 */
public interface ApiConversionService<T> {

	/**
	 * Converts a page of T instances to it's equivalent TO<T>
	 * @param page with the elements to convert
	 * @return a page with converted elements
	 */
	Page<ApiTO<T>> convert(Page<T> page);
	
	/**
	 * Concerts a list of T instances to it's equivalen TO<T>
	 * @param list
	 * @return a list with converted elements
	 */
	List<ApiTO<T>> convert(List<T> list);  

}