package org.cimmyt.service;

import java.util.List;

import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Interface defining methods to manipulate studies. More specifically, variables, observation units
 * like plots or subplots, and observations (measurements)
 * @author JAROJAS
 *
 */
public interface BrStudyPhenotypingService {

	List<BrVariableTO> findVariables(int studyId);
	
	Page<BrObservationUnitTO> findObservationUnits(Pageable page, int studyId, String observationLevel);
}
