package org.cimmyt.service.impl;

import java.util.List;

import org.cimmyt.model.B4RVariables;
import org.cimmyt.model.Variable;
import org.cimmyt.repository.VariableRepository;
import org.cimmyt.service.TraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * At the moment, the B4R database does not have the relation
 * between study and trait before collect data in the field.
 * 
 * The method {@link #getTraitList(Integer)}, receives the traitId parameter. 
 * However, is not used,the method return all the traits defined in the table 
 * master.variable below the following condition: 
 *    select * from master.variable where type = 'observation'
 * 
 * 
 * @author RHTOLEDO
 * @version 1.0
 */

@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class TraitServiceImpl implements TraitService{
	

	private VariableRepository plotDataRepository;
	
	@Autowired
	public TraitServiceImpl(VariableRepository plotDataRepository){
		super();
		this.plotDataRepository = plotDataRepository;
	}
	
	@Override
	public List<Variable> getTraitList(Integer traitId) {
		//All traits
		//Example<Variable> example = Example.of(new Variable(B4RVariables.VARIABLE_TYPE_TRAIT));
		
		//two specific
		Example<Variable> example = Example.of(new Variable(B4RVariables.VARIABLE_TYPE_TRAIT,"CIMMYT")); 
		return plotDataRepository.findAll(example);
	}	
	
	
}
