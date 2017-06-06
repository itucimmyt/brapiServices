package org.cimmyt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.SpringDataWebConfiguration;

/**
 * Spring Data Web Configuration. Currently contains only general minor fixes to comply with BrAPI specification
 * @author JAROJAS
 *
 */
@Configuration
public class WebConfiguration extends SpringDataWebConfiguration{

	@Value("${cimmyt.brapi.maxPageSize}")
	private int maxPageSize;
	
	@Override
	public PageableHandlerMethodArgumentResolver pageableResolver() {
		PageableHandlerMethodArgumentResolver brapiPageableResolver = new PageableHandlerMethodArgumentResolver();
		brapiPageableResolver.setSizeParameterName("pageSize");
		brapiPageableResolver.setMaxPageSize(maxPageSize);
		return brapiPageableResolver;
	}

}
