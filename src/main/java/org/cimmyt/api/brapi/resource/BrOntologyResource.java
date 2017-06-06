package org.cimmyt.api.brapi.resource;

import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.cimmyt.api.brapi.to.BrTraitDetailTO;
import org.springframework.data.domain.Pageable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Defines methods for exposing BrAPI calls related to ontology
 * @author JAROJAS
 *
 */
@Api(tags={"trait"})
public interface BrOntologyResource {

	@ApiOperation(value="find all traits"
			,notes="retrieve traits"
			,nickname="findTraits")
	BrapiPagedResponse<BrTraitDetailTO> getAllTraits(Pageable pageRequest);

	@ApiOperation(value="trait detail"
			,notes="find a trait and its associated variables"
			,nickname="findTraitDetail")
	BrapiResponse<BrTraitDetailTO> findTrait(Integer tritId);
}
