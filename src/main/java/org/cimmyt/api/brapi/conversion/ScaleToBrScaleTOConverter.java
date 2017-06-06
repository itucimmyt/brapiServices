package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrScaleTO;
import org.cimmyt.model.Scale;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class ScaleToBrScaleTOConverter implements Converter<Scale, BrScaleTO>{

	@Override
	public BrScaleTO convert(Scale source) {
		BrScaleTO target = new BrScaleTO();
		
		target.setDbId(source.getId().toString());
		target.setName(source.getName());
		target.setClazz(source.getType());
		target.setXref(source.getOntologyId());
		
		
		return target;
	}

}
