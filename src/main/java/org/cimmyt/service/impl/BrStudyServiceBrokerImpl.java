package org.cimmyt.service.impl;

import java.util.List;
import java.util.Map;

import org.cimmyt.api.brapi.to.BrEntryTO;
import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.api.brapi.to.BrStudyDetailTO;
import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.cimmyt.service.BrStudyPhenotypingService;
import org.cimmyt.service.BrStudyService;
import org.cimmyt.service.BrStudyServiceBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author JAROJAS
 *
 */
@Service
class BrStudyServiceBrokerImpl implements BrStudyServiceBroker{

	private BrStudyService brStudyService;
	private BrStudyPhenotypingService brStudyPhenotypingService;

	@Autowired
	public BrStudyServiceBrokerImpl(BrStudyService brStudyService, BrStudyPhenotypingService brStudyPhenotypingService) {
		super();
		this.brStudyService = brStudyService;
		this.brStudyPhenotypingService = brStudyPhenotypingService;
	}

	@Override
	public List<BrVariableTO> findVariables(int studyId) {
		return brStudyPhenotypingService.findVariables(studyId);
	}

	@Override
	public Page<BrObservationUnitTO> findObservationUnits(Pageable page, int studyId, String observationLevel) {
		return brStudyPhenotypingService.findObservationUnits(page, studyId, observationLevel);
	}

	@Override
	public Page<BrStudyTO> searchStudies(Pageable page, Map<String, String> searchCriteria) {
		return brStudyService.searchStudies(page, searchCriteria);
	}

	@Override
	public Page<BrEntryTO> findEntries(Pageable page, int studyId) {
		return brStudyService.findEntries(page, studyId);
	}

	@Override
	public BrStudyDetailTO findDetail(Integer studyId) {
		return brStudyService.findDetail(studyId);
	}
	
	
	
}
