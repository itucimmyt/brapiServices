package org.cimmyt.api.conversion;

import java.util.List;
import java.util.stream.Collectors;

import org.cimmyt.api.ApiTO;
import org.cimmyt.config.EndpointFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

/**
 * 
 * @author JAROJAS
 *
 * @param <T>
 */
public class ApiConversionServiceImpl<T> implements ApiConversionService<T> {

	
	private static final Logger LOG = LoggerFactory.getLogger(ApiConversionServiceImpl.class);

	/* Candidate converters for T instances*/
	private List<ApiConverter<T>> converters;
	
	@Autowired
	public ApiConversionServiceImpl(List<ApiConverter<T>> converters) {
		super();
		this.converters = converters;
	}

	/**
	 * Retrieves a converter suitable for the source endpoint.
	 * @return a converter for the current endpoint's format
	 */
	private ApiConverter<T> getConverter(){
		
		LOG.debug("Candidate Converters for {} call({}): {}"
				,EndpointFormat.getCurrent(), converters.size(), converters);

		return converters.stream()
				.filter( conv -> conv.getClass().getAnnotation(ApiConversion.class).value()
							.equals(EndpointFormat.getCurrent()))
				.findAny().get();
	}

	@Override
	public Page<ApiTO<T>> convert(Page<T> page) {
		return page.map(getConverter());
	}
	
	@Override
	public List<ApiTO<T>> convert(List<T> list) {
		
		return list.stream().map( study -> getConverter().convert(study)).collect(Collectors.toList());
	}
}
