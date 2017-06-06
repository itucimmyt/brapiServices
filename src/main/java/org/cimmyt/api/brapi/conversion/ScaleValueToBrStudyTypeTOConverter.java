package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrStudyTypeTO;
import org.cimmyt.model.ScaleValue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
/**
 * Converts {@link ScaleValue} to BrAPI-specific TO
 * @author JAROJAS
 *
 */
@Component
public class ScaleValueToBrStudyTypeTOConverter implements Converter<ScaleValue, BrStudyTypeTO> {

	@Override
	public BrStudyTypeTO convert(ScaleValue source) {
		BrStudyTypeTO target = new BrStudyTypeTO();

		target.setStudyTypeDbId(source.getId());
		target.setName(source.getValue());
		target.setDescription(source.getDescription());
		
		return target;
	}
}
