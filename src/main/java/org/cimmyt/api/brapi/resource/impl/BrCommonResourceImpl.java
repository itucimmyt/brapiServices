package org.cimmyt.api.brapi.resource.impl;

import java.util.List;

import org.cimmyt.api.brapi.call.BrResponseBuilder;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.cimmyt.api.brapi.resource.BrCommonResource;
import org.cimmyt.api.brapi.to.BrBreedingMethodTO;
import org.cimmyt.service.BrCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author JAROJAS
 *
 */
@RestController
class BrCommonResourceImpl implements BrCommonResource {

	private BrCommonService commonService;
	
	@Autowired
	public BrCommonResourceImpl(BrCommonService commonService) {
		super();
		this.commonService = commonService;
	}


	@Override
	@GetMapping("breedingMethods")
	public BrapiResponse<List<BrBreedingMethodTO>> findBreedingMethods() {
		return BrResponseBuilder.forData(commonService.findBreedingMethods())
				.withStatusSuccess()
				.build();
	}

}
