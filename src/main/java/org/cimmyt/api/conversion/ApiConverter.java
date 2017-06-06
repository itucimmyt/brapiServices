package org.cimmyt.api.conversion;

import org.cimmyt.api.ApiTO;
import org.springframework.core.convert.converter.Converter;

/**
 * <p>Simplification of signature for converters to be used in API-specific conversions.
 * Converters to be considered in API Conversion Service <strong>must</strong> implement this interface.</p>
 * <p>Implementations define HOW to convert a Model Entity to a particular format.</p>
 * @author JAROJAS
 *
 * @param <S>
 */
public interface  ApiConverter<S> extends Converter<S, ApiTO<S>>{

}
