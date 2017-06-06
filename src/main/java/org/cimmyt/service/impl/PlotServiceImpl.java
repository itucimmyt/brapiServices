package org.cimmyt.service.impl;


import java.util.List;

import org.cimmyt.model.Plot;
import org.cimmyt.model.PlotData;
import org.cimmyt.repository.PlotDataRepository;
import org.cimmyt.repository.PlotRepository;
import org.cimmyt.service.PlotService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author RHTOLEDO
 * @version 1.0
 */
@Service 
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class PlotServiceImpl implements PlotService{

	private PlotRepository plotRepository;
	private PlotDataRepository plotDataRepository;
	
	public PlotServiceImpl(PlotRepository plotRepository,
			               PlotDataRepository plotDataRepository){
		super();
		this.plotRepository = plotRepository;
		this.plotDataRepository = plotDataRepository;
	}
	
	@Override
	public Page<Plot> getPlotsByStudyId(Pageable page, Integer studyId) {
		Example<Plot> example = Example.of(new Plot(studyId)); 
		return plotRepository.findAll(example,page);
	}

	@Override
	public List<Plot> getPlotsByStudyId(Integer Id) {
		Example<Plot> example = Example.of(new Plot(Id));
		return plotRepository.findAll(example);
	}

	@Override
	public List<PlotData> getPlotDataById(Integer studyId) {
		Example<PlotData> example = Example.of(new PlotData(studyId));
		return plotDataRepository.findAll(example);
	}
	
}
