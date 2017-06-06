package org.cimmyt.api.brapi.resource.impl;

import org.cimmyt.api.brapi.call.BrResponseBuilder;
import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.conversion.PlaceToBrLocationConverter;
import org.cimmyt.api.brapi.resource.BrLocationResource;
import org.cimmyt.api.brapi.to.BrLocationTO;
import org.cimmyt.model.Place;
import org.cimmyt.service.SystemCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Resource in BrAPI format for {@link Place} entity,
 * according to BrAPI V1 definition
 * 
 * @author RHTOLEDO
 * @author JAROJAS
 * @version 1.0
 */



@RestController
@RequestMapping(value="/locations",  method=RequestMethod.GET)
class BrLocationResourceImpl implements BrLocationResource{
	
	private SystemCatalogService        locationService;
	private PlaceToBrLocationConverter locationConverter;
	
	@Autowired
	public BrLocationResourceImpl(PlaceToBrLocationConverter locationConverter,
			                  SystemCatalogService locationService){
		super();
		this.locationConverter  = locationConverter;
		this.locationService = locationService;		
		
	}
	
	/* (non-Javadoc)
	 * @see org.cimmyt.api.brapi.resource.BrLocationResource#findAll(org.springframework.data.domain.Pageable)
	 */
	@Override
	@RequestMapping(method=RequestMethod.GET)
	public BrapiPagedResponse<BrLocationTO> findAll(
			  @PageableDefault(page=0,size=50) Pageable pageRequest){
		
		Page<Place> page = locationService.getLocations(pageRequest);		
		
    	return BrResponseBuilder.forData(page.map(locationConverter))
    			.withStatusSuccess()
    			.build();
		
	}	
}
