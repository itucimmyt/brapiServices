package org.cimmyt.api.brapi.resource;

import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.to.BrProgramTO;
import org.cimmyt.model.Program;
import org.springframework.data.domain.Pageable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Exposes {@link Program} as a BrAPI resource.
 * TODO move to {@link BrCommonResource}
 * @author JAROJAS
 *
 */
@Api(tags={"common"})
public interface BrProgramResource {
	@ApiOperation(value="find all programs"
			,notes="retrieve programs"
			,nickname="findPrograms")
	BrapiPagedResponse<BrProgramTO> findAll(Pageable pageRequest);

}