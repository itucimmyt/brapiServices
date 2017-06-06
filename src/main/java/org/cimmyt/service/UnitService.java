package org.cimmyt.service;

import org.cimmyt.model.Units;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Logic to manage {@link Units}
 * @author RHTOLEDO
 *
 */

public interface UnitService {
	
	Page<Units> getGeneralUnits(Pageable page);

}
