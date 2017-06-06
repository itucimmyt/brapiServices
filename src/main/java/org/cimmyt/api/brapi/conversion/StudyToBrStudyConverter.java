package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.model.Study;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
/**
 * Converts {@link Study} to BrAPI-specific TO
 * @author JAROJAS
 *
 */
@Component
public class StudyToBrStudyConverter extends AbstractStudyConverter implements Converter<Study, BrStudyTO> {

	@Override
	public BrStudyTO convert(Study source) {
		BrStudyTO target = baseConversion(source, new BrStudyTO());
		
		target.setLocationDbId(source.getPlace().getId());
		target.setLocationName(source.getPlace().getName());

		
		target.setProgramDbId(source.getProgramId());
		target.setProgramName(source.getProgramId().toString()); //TODO: make program relationship
		
		
		return target;
	}
}
