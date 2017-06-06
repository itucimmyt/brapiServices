package org.cimmyt.service.impl;

import java.util.List;

import org.cimmyt.api.brapi.conversion.ScaleValueToBrStudyTypeTOConverter;
import org.cimmyt.api.brapi.to.BrStudyTypeTO;
import org.cimmyt.model.B4RVariables;
import org.cimmyt.model.ScaleValue;
import org.cimmyt.repository.StudyTypeRepository;
import org.cimmyt.service.ScaleValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author RHTOLEDO
 * @author JAROJAS
 */

@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class ScaleValueServiceImpl implements ScaleValueService{

	
	private StudyTypeRepository studyTypeRepository;
	private ScaleValueToBrStudyTypeTOConverter studyTypeConverter;
	
	private final Example<ScaleValue> scaleForStudyType = Example.of(new ScaleValue(B4RVariables.STUDY_TYPE));
	
	@Autowired
	public ScaleValueServiceImpl(StudyTypeRepository studyTypeRepository
			,ScaleValueToBrStudyTypeTOConverter studyTypeConverter){
		super();
		this.studyTypeRepository = studyTypeRepository;
		this.studyTypeConverter = studyTypeConverter;
	}
	
	/**
	 *  The study types are inside the table SCALES_VALUES
	 *  with a specific scaleId. See {@link B4RVariables}
	 */
	@Override
	public List<ScaleValue> getStudyType() {
		return studyTypeRepository.findAll(scaleForStudyType);
	}

	@Override
	public Page<BrStudyTypeTO> getStudyType(Pageable pageRequest) {
		
		return studyTypeRepository.findAll(scaleForStudyType, pageRequest)
				.map(studyTypeConverter);
	}

}
