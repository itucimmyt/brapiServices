package org.cimmyt.api.brapi.resource;

import java.util.List;

import org.cimmyt.api.brapi.call.BrapiResponse;
import org.cimmyt.api.brapi.to.BrBreedingMethodTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Interface for concentrating common BrAPI calls
 * @author JAROJAS
 *
 */
@Api(tags={"common"})
public interface BrCommonResource {

	@ApiOperation(value="find all breeding methods"
			,notes="retrieve breeding methods"
			,nickname="findBreedingMethods")
	BrapiResponse<List<BrBreedingMethodTO>> findBreedingMethods();
}
