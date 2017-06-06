package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrTraitDetailTO;
import org.cimmyt.model.Property;
import org.cimmyt.model.Variable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class PropertyToBrTraitDetailTOConverter implements Converter<Property, BrTraitDetailTO>{

	@Override
	public BrTraitDetailTO convert(Property source) {
		BrTraitDetailTO target = new BrTraitDetailTO();
		target.setTraitDbId(source.getId().toString());
		target.setTraitId(source.getOntologyId());
		target.setName(source.getName());
		target.setDescription(source.getDescription());
		
		target.setObservationVariables( source.getVariables().stream()
			.map(Variable::getOntologyReference)
			.filter(v -> v!=null && !v.isEmpty())
			.toArray(String[]::new));
		
		return target;
	}

}
