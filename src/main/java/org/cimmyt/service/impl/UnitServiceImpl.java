package org.cimmyt.service.impl;

import org.cimmyt.model.Units;
import org.cimmyt.repository.UnitsRepository;
import org.cimmyt.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * At the moment, the is no units catalog in B4R.
 * 
 * The method {@ #getGeneralUnits(Pageable)}, reads the units
 * from a temporal table created in B4R.
 * 
 * @author RHTOLEDO
 * @version 1.0
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class UnitServiceImpl implements UnitService{

	private UnitsRepository unitsRepository;
	
	@Autowired
	public UnitServiceImpl(UnitsRepository unitsRepository){
		super();
		this.unitsRepository = unitsRepository;
	}
	
	@Override
	public Page<Units> getGeneralUnits(Pageable page) {
		return unitsRepository.findAll(page);
	}
	
}
