package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrContactTO;
import org.cimmyt.api.brapi.to.BrStudyDetailTO;
import org.cimmyt.model.Place;
import org.cimmyt.model.Study;
import org.cimmyt.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
/**
 * Converts {@link Study} to BrAPI-specific TO
 * @author JAROJAS
 *
 */
@Component
public class StudyToBrStudyDetailTOConverter extends AbstractStudyConverter implements Converter<Study, BrStudyDetailTO> {

	private LocationRepository locationRepo;
	private PlaceToBrLocationConverter locationConverter;
	
	@Autowired
	public StudyToBrStudyDetailTOConverter(LocationRepository locationRepo
			,PlaceToBrLocationConverter locationConverter) {
		super();
		this.locationRepo = locationRepo;
		this.locationConverter = locationConverter;
	}

	@Override
	public BrStudyDetailTO convert(Study source) {
		BrStudyDetailTO target = baseConversion(source, new BrStudyDetailTO());
		
		Place place = locationRepo.findOne(source.getPlace().getId());
		target.setLocation(locationConverter.convert(place));
		
		target.setContacts(new BrContactTO[0]);
		
		return target;
	}
}
