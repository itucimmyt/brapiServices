package org.cimmyt.service;

import java.util.List;

import org.cimmyt.api.brapi.to.BrTraitDetailTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Methods for working with Ontology
 * @author JAROJAS
 *
 */
public interface BrOntologyService {

	List<BrVariableTO> findById(List<Integer> ids);
	
	Page<BrTraitDetailTO> findAllTraits(Pageable pageRequest);
	
	BrTraitDetailTO findTrait(Integer id);
}
