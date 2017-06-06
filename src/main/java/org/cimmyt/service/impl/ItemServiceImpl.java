package org.cimmyt.service.impl;

import java.util.List;

import org.cimmyt.model.Container;
import org.cimmyt.model.SeedStorage;
import org.cimmyt.repository.ContainerRepository;
import org.cimmyt.repository.SeedStorageRepository;
import org.cimmyt.service.ItemService;
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
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class ItemServiceImpl implements ItemService{

	private SeedStorageRepository seedRepository;
	private ContainerRepository   containerRepository;
	
	@Autowired
	public ItemServiceImpl(SeedStorageRepository seedRepository,ContainerRepository containerRepository){
		super();
		this.seedRepository = seedRepository;
		this.containerRepository = containerRepository;
	}
	
	@Override	
	public List<Container> getContainers() {
		return containerRepository.findAll();
	}
	
	@Override
	public Page<SeedStorage> getSeedStorage(Pageable page) {
		Example<SeedStorage> example = Example.of(new SeedStorage("KDX"));
		return seedRepository.findAll(example,page);
	}

}
