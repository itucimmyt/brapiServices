package org.cimmyt.api.brapi.resource;

import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.cimmyt.api.brapi.to.BrEntryTO;
import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.api.brapi.to.BrStudyDetailTO;
import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.api.brapi.to.BrStudyTypeTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.cimmyt.model.Study;
import org.springframework.data.domain.Pageable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *  Exposes {@link Study} as a BrAPI resource.
 * @author JAROJAS
 *
 */
@Api(tags={"Studies"})
public interface BrStudyResource {

	/**
	 * Finds a study TOs. Supports pagination.
	 * @param pageRequest page of the study dataset. Defaults to first page with 50 elements
	 * @return the page requested
	 */
	@ApiOperation(value="search studies"
			,notes="Search by a variety of creteria. (Filters pending)"
			,nickname="searchStudies")
	BrapiPagedResponse<BrStudyTO> findStudies(Pageable pageRequest);

	@ApiOperation(value="study detail - germplasm"
			,notes="germplasm detail by study" 
			,nickname="getGermplasmByStudyId")
	BrapiPagedResponse<BrEntryTO> findEntries(Pageable pageRequest, int studyId);
	
	@ApiOperation(value="study types"
			,notes="different categories for studies" 
			,nickname="getStudyTypes")
	BrapiPagedResponse<BrStudyTypeTO> findStudyTypes(Pageable pageRequest);

	@ApiOperation(value="study detail - germplasm"
			,notes="germplasm detail by study" 
			,nickname="getGermplasmByStudyId")
	BrapiResponse<BrStudyDetailTO> findGermplasmDetail(int studyId);
	
	@ApiOperation(value="study detail - observation variables"
			,notes="observation variables by study" 
			,nickname="getObservationVariablesByStudyId")
	BrapiPagedResponse<BrVariableTO> findObservationVariablesDetail(Pageable pageRequest, int studyId);
	
	@ApiOperation(value="study detail - observation units"
			,notes="observation units by study with their observation values" 
			,nickname="getObservationUnitsByStudyId")
	BrapiPagedResponse<BrObservationUnitTO> findObservationUnitDetail(Pageable pageRequest, int studyId, String observationLevel);
}