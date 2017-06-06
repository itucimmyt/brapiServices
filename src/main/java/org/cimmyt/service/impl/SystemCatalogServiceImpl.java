package org.cimmyt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.cimmyt.api.brapi.to.BrBreedingMethodTO;
import org.cimmyt.api.conversion.BeanConverter;
import org.cimmyt.model.BreedingMethodVariable;
import org.cimmyt.model.CrossMethod;
import org.cimmyt.model.Place;
import org.cimmyt.model.Program;
import org.cimmyt.model.RestOperations;
import org.cimmyt.model.SearchInfo;
import org.cimmyt.repository.CrossMethodRepository;
import org.cimmyt.repository.LocationRepository;
import org.cimmyt.repository.ProgramRepository;
import org.cimmyt.service.BrCommonService;
import org.cimmyt.service.SystemCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author RHTOLEDO
 *
 */

@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class SystemCatalogServiceImpl implements SystemCatalogService, BrCommonService{
	
	
	private ProgramRepository programRepository;
	private LocationRepository locationRepository;
	private CrossMethodRepository crossMethodRepo;
	private BeanConverter beanConverter;
	
	@Autowired
	public SystemCatalogServiceImpl(ProgramRepository programRepository,
			                        LocationRepository locationRepository,
			                        CrossMethodRepository crossMethodRepo,
			                        BeanConverter beanConverter){
		super();
		this.programRepository  = programRepository;
		this.locationRepository = locationRepository;
		this.crossMethodRepo = crossMethodRepo;
		this.beanConverter = beanConverter;
	}
	
	@Override
	public List<Program> getPrograms(){
		return programRepository.findAll();
	}
	
	@Override
	public Page<Program> getPrograms(Pageable page){
	     return programRepository.findAll(page);	
	}
	
	@Override
	public List<RestOperations> getOperations() {
		
		List<RestOperations> restOpList = new ArrayList<RestOperations>();
		
		restOpList.add(RestOperations.getInstanceMsg("login"));
		restOpList.add(RestOperations.getInstanceMsg("get/login/status"));
		restOpList.add(RestOperations.getInstanceMsg("list/all/group"));
		restOpList.add(RestOperations.getInstanceMsg("list/group"));
		restOpList.add(RestOperations.getInstanceMsg("switch/group/_groupid"));
		restOpList.add(RestOperations.getInstanceMsg("get/version"));
		restOpList.add(RestOperations.getInstanceMsg("logout"));
		restOpList.add(RestOperations.getInstanceMsg("list/operation"));
		restOpList.add(RestOperations.getInstanceMsg("get/genus/_id"));
		restOpList.add(RestOperations.getInstanceMsg("list/genus"));
		restOpList.add(RestOperations.getInstanceMsg("get/genotype/_id"));
		restOpList.add(RestOperations.getInstanceMsg("list/genotype/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("get/genotypealias/_id"));
		restOpList.add(RestOperations.getInstanceMsg("list/genotypealias/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("genotype/_genoid/list/alias"));
		restOpList.add(RestOperations.getInstanceMsg("generaltype/_typeid"));
		restOpList.add(RestOperations.getInstanceMsg("itemunit/_itemunitid"));
		restOpList.add(RestOperations.getInstanceMsg("trial/details/_trial"));
		restOpList.add(RestOperations.getInstanceMsg("trial/_id/import/datakapturetemplate/csv"));
		restOpList.add(RestOperations.getInstanceMsg("list/project/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/trial/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/sample/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/item/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/itemparent/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/unittype/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/state/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/container/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/specimengroup/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/specimenParent/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/genotypealias/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/genotypealiasstatus/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/genparent/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/genotypespecimen/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/trialevent/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/traitgroup/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/specimen/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("set/group/_id"));	
		restOpList.add(RestOperations.getInstanceMsg("export/samplemeasurement/csv"));
		restOpList.add(RestOperations.getInstanceMsg("list/generalunit/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("list/trial/_nperpage/page/_num"));	
		restOpList.add(RestOperations.getInstanceMsg("trial/_id/list/trait"));
		restOpList.add(RestOperations.getInstanceMsg("trial/_id/list/trialunit/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("trial/_id/list/trialunit"));
		restOpList.add(RestOperations.getInstanceMsg("trial/_id/list/instancenumber"));
		restOpList.add(RestOperations.getInstanceMsg("list/site/_nperpage/page/_num"));
		restOpList.add(RestOperations.getInstanceMsg("list/type/workflow/active"));
		restOpList.add(RestOperations.getInstanceMsg("list/designtype"));
		
		
		return restOpList;
	}

	@Override
	public List<SearchInfo> getSearchInfo() {
		
		List<SearchInfo> listSearch = new ArrayList<>();
		SearchInfo searchInfo = new SearchInfo();
		
		searchInfo.setSolrId("SPEC4830449-GENO4830449");
		searchInfo.setBreedingMethodId(11);
		searchInfo.setSpecimenId(5895423);
		searchInfo.setEntityName("specimen_genotype");
		searchInfo.setSpecimenName("CMSS05Y00576T-099TOPM-099Y-099M-099Y-099ZTM-12WGY-0B");
		searchInfo.setGenotypeName("GID:4830449");
		searchInfo.setFilialGeneration(0);
		searchInfo.setGenotypeId(4830449);
		searchInfo.setIsActive(1);
		searchInfo.setGenusId(1);
		searchInfo.setVersion("1545879440151543808");
		searchInfo.setSpecimenBarcode("GID:4830449");
		
		listSearch.add(searchInfo);
		
		searchInfo = new SearchInfo();
		searchInfo.setSolrId("SPEC4830449-GENO4830449");
		searchInfo.setBreedingMethodId(11);
		searchInfo.setSpecimenId(5793843);
		searchInfo.setEntityName("specimen_genotype");
		searchInfo.setSpecimenName("CMSS05Y00576T-099TOPM-099Y-099M-099Y-099ZTM-12WGY-0B");
		searchInfo.setGenotypeName("GID:4830449");
		searchInfo.setFilialGeneration(0);
		searchInfo.setGenotypeId(4830449);
		searchInfo.setIsActive(1);
		searchInfo.setGenusId(1);
		searchInfo.setVersion("1545879440151543808");
		searchInfo.setSpecimenBarcode("GID:4830449");		
		
		
		listSearch.add(searchInfo);
		
		return  listSearch;
		
	}

	@Override
	public Page<Place> getLocations(Pageable page) {
		return locationRepository.findAll(page);
	}

	@Override
	public List<BreedingMethodVariable> getBreedingMethod() {
		
		List<BreedingMethodVariable> bMList = new ArrayList<>();
		BreedingMethodVariable bMVariable = new BreedingMethodVariable();
		
		bMVariable.setId(1);
		bMVariable.setName("Single Cross");
		bMVariable.setDescription("Cross between two single plants. If both parents are fixed (pure) inbred lines there will be no segregation for gametes or genotypes.");
		bMVariable.setCode("C2W");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);
		
		bMVariable = new BreedingMethodVariable();
		bMVariable.setId(2);
		bMVariable.setName("Three-way cross");
		bMVariable.setDescription("Cross between two plants, one an inbred line and one a single cross (usually an F1) and thus segregating for gametes.");
		bMVariable.setCode("C3W");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);		
		
		bMVariable = new BreedingMethodVariable();
		bMVariable.setId(3);
		bMVariable.setName("Double cross");
		bMVariable.setDescription("Cross between two single crosses (usually two F1s) and hence both segregating for gametes.");
		bMVariable.setCode("CDC");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);
		
		bMVariable = new BreedingMethodVariable();
		bMVariable.setId(4);
		bMVariable.setName("Backcross");
		bMVariable.setDescription("Backcross to recover a specific gene. The coding in the genealogical table records which parent was used as the female in each cycle. Each entity kept separate.");
		bMVariable.setCode("BCR");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);
		
		bMVariable = new BreedingMethodVariable();
		bMVariable.setId(5);
		bMVariable.setName("Interspecific cross");
		bMVariable.setDescription("Cross between two species. The problem with making this a separate method is that the species cross could be made by any of the previous (101-108) or following (110-113)");
		bMVariable.setCode("CIS");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);		
		
		bMVariable = new BreedingMethodVariable();
		bMVariable.setId(6);
		bMVariable.setName("Female Backcross");
		bMVariable.setDescription("Backcross to recover a specific gene. The coding in the genealogical table records which parent was used as the female in each cycle. Each entity kept separate.");
		bMVariable.setCode("FBCR");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);
		
		bMVariable = new BreedingMethodVariable();
		bMVariable.setId(7);
		bMVariable.setName("Male Backcross");
		bMVariable.setDescription("Backcross to recover a specific gene. The coding in the genealogical table records which parent was used as the male in each cycle. Each entity kept separate.");
		bMVariable.setCode("MBCR");
		bMVariable.setCropId(2);
		bMVariable.setTypeId(1);
		bMVariable.setStatusId(1);
		bMList.add(bMVariable);		
		
		return bMList;
	}

	@Override
	public List<BrBreedingMethodTO> findBreedingMethods() {
		return beanConverter.convert(crossMethodRepo.findAll()
				,CrossMethod.class
				,BrBreedingMethodTO.class);
	}
	
}
