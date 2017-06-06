package org.cimmyt.service.impl;

import java.util.List;

import org.cimmyt.api.brapi.conversion.PlotToBrObservationUnitTOConverter;
import org.cimmyt.api.brapi.conversion.SubPlotToBrObservationUnitTOConverter;
import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.cimmyt.model.Plot;
import org.cimmyt.model.Subplot;
import org.cimmyt.repository.PlotDataRepository;
import org.cimmyt.repository.PlotRepository;
import org.cimmyt.repository.SubPlotRepository;
import org.cimmyt.service.BrOntologyService;
import org.cimmyt.service.BrStudyPhenotypingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author JAROJAS
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class StudyPhenotypingServiceImpl implements BrStudyPhenotypingService{

	private BrOntologyService ontologyService;
	private PlotDataRepository plotDataRepository;
	private PlotRepository plotRepository;
	private PlotToBrObservationUnitTOConverter plotConverter;
	private SubPlotRepository subplotRepository;
	private SubPlotToBrObservationUnitTOConverter subplotConverter;

	@Autowired
	public StudyPhenotypingServiceImpl(BrOntologyService ontologyService
			,PlotDataRepository plotDataRepository
			,PlotRepository plotRepository
			,PlotToBrObservationUnitTOConverter plotConverter
			,SubPlotRepository subplotRepository
			,SubPlotToBrObservationUnitTOConverter subplotConverter) {
		super();
		this.ontologyService = ontologyService;
		this.plotDataRepository = plotDataRepository;
		this.plotRepository = plotRepository;
		this.plotConverter = plotConverter;
		this.subplotRepository= subplotRepository;
		this.subplotConverter = subplotConverter;
	}

	@Override
	public List<BrVariableTO> findVariables(int studyId) {
		List<Integer> variableIds = plotDataRepository.findVariableIds(studyId);
		List<BrVariableTO> variables = ontologyService.findById(variableIds);
		
		return variables;
	}

	@Override
	public Page<BrObservationUnitTO> findObservationUnits(Pageable pageRequest, int studyId, String observationLevel) {
		Page<BrObservationUnitTO> observations = null;
		switch(observationLevel){
			case "plot":
				Page<Plot> plotPage = plotRepository.findByStudyId(pageRequest, studyId);
				//TODO check if direct extraction improves response time
//				plotDataRepository.findAll(plotPage.getContent().stream()
//						.map(p -> p.getId())
//						.collect(Collectors.toList()));
				observations = plotPage.map(plotConverter);
				break;
			case "subplot":
				Page<Subplot> subplotPage = subplotRepository.findByStudyId(pageRequest, studyId);
				observations = subplotPage.map(subplotConverter);
				break;
		}
		return observations;
	}

}