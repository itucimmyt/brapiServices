package org.cimmyt.service;

import java.util.List;

import org.cimmyt.api.brapi.to.BrStudyTypeTO;
import org.cimmyt.model.ScaleValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Logic to manage {@link ScaleValue}
 * @author RHTOLEDO
 * @author jarojas
 *
 */

public interface ScaleValueService {
	
	/**
	 * Refer to {@link B4RValues} to see the scale_id to Study Type
	 * DAL Implementation
	 * @return
	 */
	List<ScaleValue> getStudyType();
	
	Page<BrStudyTypeTO> getStudyType(Pageable pageRequest);

}
