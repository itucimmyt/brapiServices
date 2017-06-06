package org.cimmyt.service;

import java.util.List;

import org.cimmyt.model.Container;
import org.cimmyt.model.SeedStorage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * All the services related to items and inventory 
 * @author RHTOLEDO
 * @version 1.0
 */
public interface ItemService {
	
	/**
	 * Get all the items stored in the table {@link SeedStorage}
	 * from the operational schema in the B4R database.
	 * @param page
	 * @return
	 */
	Page<SeedStorage> getSeedStorage(Pageable page);
	
	/**
	 * Get all physical containers registered in the table {@link Container}
	 * from the operational seed_warehouse schema in the B4R database
	 * @return
	 */
	List<Container> getContainers();

}
