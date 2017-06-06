package org.cimmyt.api.brapi.resource.impl;

import org.cimmyt.api.brapi.call.BrResponseBuilder;
import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.conversion.ProgramToBrProgramConverter;
import org.cimmyt.api.brapi.resource.BrProgramResource;
import org.cimmyt.api.brapi.to.BrProgramTO;
import org.cimmyt.model.Program;
import org.cimmyt.service.SystemCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Resource in BrAPI format for {@link Program} entity,
 * acconding to BrAPI V1 definition:
 * 
 * Parameters: programName   - optional
 *             abbrevitation - optional
 * 
 * Pagination: Yes
 * 
 * @author RHTOLEDO
 * @author JAROJAS
 * @version 1.0 
 */
@RestController
@RequestMapping(value="/programs",  method=RequestMethod.GET)
class BrProgramResourceImpl implements BrProgramResource {
	
	private ProgramToBrProgramConverter programConverter;
	private SystemCatalogService catalogService;
	
		
	@Autowired
	public BrProgramResourceImpl(ProgramToBrProgramConverter programConverter,
			SystemCatalogService catalogService){
		super();
		this.programConverter = programConverter;
		this.catalogService   = catalogService;
	}
	
	/* (non-Javadoc)
	 * @see org.cimmyt.api.brapi.resource.BrProgramResource#findAll(org.springframework.data.domain.Pageable)
	 */
	@Override
	@RequestMapping(method=RequestMethod.GET)
    public BrapiPagedResponse<BrProgramTO> findAll(
    	    		@PageableDefault(page=0,size=50) Pageable pageRequest){
		
    	Page<Program> page = catalogService.getPrograms(pageRequest);
    	
    	return BrResponseBuilder.forData(page.map(programConverter))
    			.withStatusSuccess()
    			.build();
    	
    } 
}
