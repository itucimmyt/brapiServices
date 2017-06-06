package org.cimmyt.service;

import java.util.List;

import org.cimmyt.model.Plot;
import org.cimmyt.model.PlotData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Logic to manage {@link Plot}
 * @author RHTOLEDO
 *
 */
public interface PlotService {
	
	/**
	 * Version with pagination functionality, KDX uses this to
	 * count how many plots are in the specific study
	 * @param page
	 * @param studyId
	 * @return
	 */
	Page<Plot> getPlotsByStudyId(Pageable page, Integer studyId);
	
	/**
	 * Version without pagination, KDX uses to get all plots
	 * from specific study
	 * @param studyId
	 * @return
	 */
	List<Plot> getPlotsByStudyId(Integer studyId);
	
	/**
	 * Get all the data collected in the field from specific
	 * study
	 * @param studyIdId
	 * @return
	 */
	List<PlotData> getPlotDataById(Integer studyId);

}
