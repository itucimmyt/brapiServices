package org.cimmyt.api.brapi.resource.impl;

import static org.cimmyt.api.brapi.call.BrResponseBuilder.forData;

import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.cimmyt.api.brapi.resource.BrOntologyResource;
import org.cimmyt.api.brapi.to.BrTraitDetailTO;
import org.cimmyt.service.BrOntologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author JAROJAS
 *
 */
@RestController
public class BrOntologyResourceImpl implements BrOntologyResource {

	private BrOntologyService ontologyService;
	
	@Autowired
	public BrOntologyResourceImpl(BrOntologyService ontologyService) {
		super();
		this.ontologyService = ontologyService;
	}

	@Override
	@GetMapping("traits")
	public BrapiPagedResponse<BrTraitDetailTO> getAllTraits(Pageable pageRequest) {
		return forData(ontologyService.findAllTraits(pageRequest))
				.withStatusSuccess()
				.build();
	}

	@Override
	@GetMapping("traits/{traitDbId}")
	public BrapiResponse<BrTraitDetailTO> findTrait(@PathVariable Integer traitDbId) {
		return forData(ontologyService.findTrait(traitDbId))
				.withStatusSuccess()
				.build();
	}
}
