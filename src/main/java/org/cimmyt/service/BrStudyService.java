package org.cimmyt.service;

import java.util.Map;

import org.cimmyt.api.brapi.to.BrEntryTO;
import org.cimmyt.api.brapi.to.BrStudyDetailTO;
import org.cimmyt.api.brapi.to.BrStudyTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Interface defining methods to manipulate studies.
 * Aimied to be used in BrAPI calls
 * @author JAROJAS
 *
 */
public interface BrStudyService {

	Page<BrStudyTO> searchStudies(Pageable page, Map<String, String> searchCriteria);

	Page<BrEntryTO> findEntries(Pageable page, int studyId);
	
	BrStudyDetailTO findDetail(Integer studyId);
}
