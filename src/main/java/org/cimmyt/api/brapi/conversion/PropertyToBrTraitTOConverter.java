package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrTraitTO;
import org.cimmyt.model.Property;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class PropertyToBrTraitTOConverter implements Converter<Property, BrTraitTO>{

	@Override
	public BrTraitTO convert(Property source) {
		BrTraitTO target = new BrTraitTO();
		
		target.setDbId(source.getId().toString());
		target.setName(source.getName());
		target.setMainAbbreviation(source.getAbbrev());
		target.setXref(source.getOntologyId());
		
		return target;
	}

}
