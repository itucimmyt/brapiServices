package org.cimmyt.service;

import java.util.List;

import org.cimmyt.model.BreedingMethodVariable;
import org.cimmyt.model.Place;
import org.cimmyt.model.Program;
import org.cimmyt.model.RestOperations;
import org.cimmyt.model.SearchInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * This service contains all catalogs for KDX. 
 * @author RHTOLEDO
 * @version 1.0
 * 
 */

public interface SystemCatalogService {

	/**
	 * KDX uses this catalog as a SystemGroup data because
	 * the B4R database does not use this concept
	 * For DAL Implementation
	 * @return
	 */
	List<Program> getPrograms();
	
	/**
	 * For DAL get/operation service
	 * @return
	 */
	List<RestOperations> getOperations();
	
	/**
	 * For DAL search/_core/_nperpage/page/_num
	 */
	List<SearchInfo> getSearchInfo();
	
	/**
	 * For BrAPI Implementation
	 * @param page
	 * @return
	 */
	Page<Program> getPrograms(Pageable page);
	
	/**
	 * For BrAPI and DAL Implementation
	 * @param page
	 * @return
	 */
	Page<Place> getLocations(Pageable page);
	
	
    /**
     * For DAL list/breedingMethod
     * @return
     */
	List<BreedingMethodVariable> getBreedingMethod();
	
}
