package org.cimmyt.service;

import java.util.List;

import org.cimmyt.model.Variable;

/**
 * Logic to manage {@link Variable}
 * 
 * @author RHTOLEDO
 * @version 1.0
 *
 */
public interface TraitService {
	
	/**
	 * (Should) return the trait related to specific study 
	 * @param studyId
	 * @return
	 */
	List<Variable> getTraitList(Integer studyId);

}
