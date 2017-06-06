package org.cimmyt.service.impl;

import java.util.List;

import org.cimmyt.api.brapi.to.BrTraitDetailTO;
import org.cimmyt.api.brapi.to.BrVariableTO;
import org.cimmyt.api.conversion.BeanConverter;
import org.cimmyt.model.B4RVariables;
import org.cimmyt.model.Property;
import org.cimmyt.model.Variable;
import org.cimmyt.repository.PropertyRepository;
import org.cimmyt.repository.VariableRepository;
import org.cimmyt.service.BrOntologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

/**
 * Default implementation of {@link BrOntologyService}
 * @author JAROJAS
 *
 */
@Service
class BrOntologyServiceImpl implements BrOntologyService {

	private VariableRepository variableRepository;
	private BeanConverter beanConverter;
	private PropertyRepository propertyRepository;
	
	@Autowired
	public BrOntologyServiceImpl(VariableRepository variableRepository, BeanConverter beanConverter
			,PropertyRepository propertyRepository) {
		super();
		this.variableRepository = variableRepository;
		this.beanConverter = beanConverter;
		this.propertyRepository = propertyRepository;
	}

	@Override
	public List<BrVariableTO> findById(List<Integer> ids) {
		return beanConverter.convert(variableRepository.findAll(ids), Variable.class, BrVariableTO.class);
	}

	@Override
	public Page<BrTraitDetailTO> findAllTraits(@PageableDefault(page=0,size=50)Pageable pageRequest) {
		Page<Integer> traitIds = variableRepository.findByType(pageRequest, B4RVariables.VARIABLE_TYPE_TRAIT);
		
		List<BrTraitDetailTO> traits = beanConverter.convert(
				propertyRepository.findAll(traitIds.getContent()),Property.class, BrTraitDetailTO.class);
				
		return new PageImpl<>(traits, pageRequest, traitIds.getTotalElements());
	}

	@Override
	public BrTraitDetailTO findTrait(Integer id) {
		return beanConverter.convert(propertyRepository.findOne(id), BrTraitDetailTO.class);
	}

}
