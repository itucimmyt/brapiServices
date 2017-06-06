package org.cimmyt.service;

import java.util.List;

import org.cimmyt.api.brapi.to.BrBreedingMethodTO;
/**
 * 
 * @author JAROJAS
 *
 */
public interface BrCommonService {

	List<BrBreedingMethodTO>findBreedingMethods();
}
