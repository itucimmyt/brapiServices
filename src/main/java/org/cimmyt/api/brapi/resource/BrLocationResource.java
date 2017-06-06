package org.cimmyt.api.brapi.resource;

import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.to.BrLocationTO;
import org.cimmyt.model.Place;
import org.springframework.data.domain.Pageable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Exposes {@link Place} as a BrAPI resource.
 * TODO move to {@link BrCommonResource}
 * @author JAROJAS
 *
 */
@Api(tags={"common"})
public interface BrLocationResource {

	@ApiOperation(value="find all locations"
			,notes="retrieve locations"
			,nickname="findLocations")
	BrapiPagedResponse<BrLocationTO> findAll(Pageable pageRequest);

}
