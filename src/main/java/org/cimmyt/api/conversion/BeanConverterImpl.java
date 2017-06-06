package org.cimmyt.api.conversion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;

/**
 * Convenient wrapper of Spring's ConversionService
 * @author JAROJAS
 *
 */
@Component
public class BeanConverterImpl implements BeanConverter {

	ConversionService conversionService;

	@Autowired
	public BeanConverterImpl(ConversionService conversionService) {
		super();
		this.conversionService = conversionService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S, T> List<T> convert(List<S> sourceList, Class<S> sourceType, Class<T> targetType) {
		return (List<T>) conversionService.convert(sourceList
				, TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(sourceType))
				, TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(targetType)));
	}

	@Override
	public <T> T convert(Object source, Class<T> targetType) {
		return conversionService.convert(source, targetType);
	}
	
}
