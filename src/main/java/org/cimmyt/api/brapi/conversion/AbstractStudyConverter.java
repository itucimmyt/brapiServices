package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.AbstractBrStudyTO;
import org.cimmyt.model.Study;

/**
 * Contains common attribute conversion from {@link Study} instances to different 
 * BrAPI representations of them
 * @author JAROJAS
 *
 */
public abstract class AbstractStudyConverter {

	protected <T extends AbstractBrStudyTO> T baseConversion(Study source, T target) {

		target.setActive(true);
		target.setAdditionalInfo(null);
		target.setEndDate(null);		
		target.setStudyName(source.getName());
		
		target.setSeasons(new String[]{""+source.getSeasonId()}); //TODO make season relationship
		target.setStartDate(source.getYear().toString());
		target.setStudyDbId(source.getId());
		target.setStudyType(source.getPhaseId().toString());
		target.setTrialDbId(source.getId());
		target.setTrialName(source.getName());
		return target;
	}
	
	
}
