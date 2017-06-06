package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrBreedingMethodTO;
import org.cimmyt.model.CrossMethod;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
/**
 * Converts {@link CrossMethod} to BrAPI-specific TO
 * @author JAROJAS
 *
 */
@Component
public class CrossMethodToBrBreedingMethodConverter implements Converter<CrossMethod, BrBreedingMethodTO> {

	@Override
	public BrBreedingMethodTO convert(CrossMethod source) {
		BrBreedingMethodTO target = new BrBreedingMethodTO();
		
		target.setAbbreviation(source.getAbbrev());
		target.setBreedingMethodDbId(source.getId());
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		
		return target;
	}

}
