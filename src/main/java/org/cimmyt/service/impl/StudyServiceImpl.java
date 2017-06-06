package org.cimmyt.service.impl;

import java.util.List;
import java.util.Map;

import org.cimmyt.api.brapi.conversion.EntryToBrEntryTOConverter;
import org.cimmyt.api.brapi.conversion.StudyToBrStudyConverter;
import org.cimmyt.api.brapi.to.BrEntryTO;
import org.cimmyt.api.brapi.to.BrStudyDetailTO;
import org.cimmyt.api.brapi.to.BrStudyTO;
import org.cimmyt.api.conversion.BeanConverter;
import org.cimmyt.model.Entry;
import org.cimmyt.model.Study;
import org.cimmyt.repository.EntryRepository;
import org.cimmyt.repository.StudyRepository;
import org.cimmyt.service.BrStudyService;
import org.cimmyt.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author JAROJAS
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class StudyServiceImpl implements StudyService, BrStudyService {

	private StudyToBrStudyConverter studyConverter;
	private StudyRepository studyRepository;
	private EntryRepository entryRepository;
	private EntryToBrEntryTOConverter entryConverter;
	private BeanConverter converter;

	@Autowired
	public StudyServiceImpl(StudyRepository studyRepository, StudyToBrStudyConverter studyConverter
			,EntryRepository entryRepository
			,EntryToBrEntryTOConverter entryConverter
			,BeanConverter converter) {
		super();
		this.studyRepository = studyRepository;
		this.studyConverter = studyConverter;
		this.entryConverter = entryConverter;
		this.entryRepository = entryRepository;
		this.converter = converter;
	}
	
	@Override
	public Page<Study> getStudies(Pageable page){
		return studyRepository.findAll(page);
	}

	@Override
	public List<Entry> findEntries(int studyId) {
		return studyRepository.findOne(studyId).getEntries();
	}

	@Override
	public Page<BrStudyTO> searchStudies(Pageable page, Map<String, String> searchCriteria) {
		Page<Study> studyPage = studyRepository.findAll(page);
		
		return studyPage.map(studyConverter);
	}

	@Override
	public Page<BrEntryTO> findEntries(Pageable page, int studyId) {
		Page<Entry> entryPage = entryRepository.findByStudyId(studyId, page);
		
		return entryPage.map(entryConverter);
	}

	@Override
	public BrStudyDetailTO findDetail(Integer studyId) {
		return converter.convert(studyRepository.findOne(studyId), BrStudyDetailTO.class);
	}
}