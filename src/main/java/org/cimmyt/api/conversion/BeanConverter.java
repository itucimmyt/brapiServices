package org.cimmyt.api.conversion;

import java.util.List;

/**
 * 
 * @author JAROJAS
 *
 */
public interface BeanConverter {

	<S, T> List<T> convert(List<S> sourceList, Class<S> sourceType, Class<T> targetType);

	<T> T convert(Object source, Class<T> targetType);

}