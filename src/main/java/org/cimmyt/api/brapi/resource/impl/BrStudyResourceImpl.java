package org.cimmyt.api.brapi.resource.impl;

import java.util.List;

import org.cimmyt.api.brapi.call.BrResponseBuilder;
import org.cimmyt.api.brapi.call.BrapiPagedResponse;
import org.cimmyt.api.brapi.call.BrapiResponse;
import org.cimmyt.api.brapi.resource.BrStudyResource;
import org.cimmyt.api.brapi.to.BrEntryTO;
import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.api.brapi.to.BrStudyDetailTO;
import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.api.brapi.to.BrStudyTypeTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.cimmyt.model.Study;
import org.cimmyt.service.BrStudyServiceBroker;
import org.cimmyt.service.ScaleValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Resource in BrAPI format for {@link Study} entities
 * @author JAROJAS
 *
 */
@RestController
class BrStudyResourceImpl implements BrStudyResource {

	private BrStudyServiceBroker studyService;
	private ScaleValueService studyTypeService;
	
	@Autowired
	public BrStudyResourceImpl(BrStudyServiceBroker studyService
			,ScaleValueService studyTypeService) {
		super();
		this.studyService = studyService;
		this.studyTypeService = studyTypeService;
	}
	
	@Override
	@GetMapping("studies-search")
	public BrapiPagedResponse<BrStudyTO> findStudies(
			@PageableDefault(page=0,size=50)Pageable pageRequest) {
		
		Page<BrStudyTO> page = studyService.searchStudies(pageRequest,null);

		return BrResponseBuilder.forData(page)
				.withStatusSuccess()
				.build();
	}
	
	@Override
	@GetMapping("studies/{studyDbId}/germplasm")
	public BrapiPagedResponse<BrEntryTO> findEntries(@PageableDefault(page=0,size=50)Pageable pageRequest,
			@PathVariable(required=true) int studyDbId) {
		
		Page<BrEntryTO> entries = studyService.findEntries(pageRequest, studyDbId);

		return BrResponseBuilder.forData(entries)
				.withStatusSuccess()
				.build();
	}

	@Override
	@GetMapping("studyTypes")
	public BrapiPagedResponse<BrStudyTypeTO> findStudyTypes(Pageable pageRequest) {
		return BrResponseBuilder.forData(studyTypeService.getStudyType(pageRequest))
				.withStatusSuccess()
				.build();
	}

	@Override
	@GetMapping("studies/{studyDbId}")
	public BrapiResponse<BrStudyDetailTO> findGermplasmDetail(@PathVariable int studyDbId) {
		return BrResponseBuilder.forData(studyService.findDetail(studyDbId))
				.withStatusSuccess()
				.build();
	}

	@Override
	@GetMapping("studies/{studyDbId}/observationVariables")
	public BrapiPagedResponse<BrVariableTO> findObservationVariablesDetail(Pageable pageRequest
			,@PathVariable(required=true) int studyDbId) {
		
		List<BrVariableTO> variables = studyService.findVariables(studyDbId);
		Page<BrVariableTO> variablesPage = new PageImpl<>(variables, pageRequest, variables.size());
		
		return BrResponseBuilder.forData(variablesPage)
				.withStatusSuccess()
				.build();
	}

	@Override
	@GetMapping("studies/{studyDbId}/observationunits")
	public BrapiPagedResponse<BrObservationUnitTO> findObservationUnitDetail(Pageable pageRequest
			,@PathVariable(required=true) int studyDbId
			,@RequestParam(name="observationLevel", defaultValue="plot") String observationLevel) {
		return BrResponseBuilder.forData(studyService.findObservationUnits(pageRequest, studyDbId, observationLevel))
				.withStatusSuccess()
				.build();
	}

}
