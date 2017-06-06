package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrMethodTO;
import org.cimmyt.model.Method;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class MethodToBrMethodTOConverter implements Converter<Method, BrMethodTO>{

	@Override
	public BrMethodTO convert(Method source) {
		BrMethodTO target = new BrMethodTO();
		target.setDbId(source.getId().toString());
		target.setName(source.getName());
		target.setDescription(source.getDescription());
		target.setXref(source.getOntologyId());
		
		return target;
	}

}
