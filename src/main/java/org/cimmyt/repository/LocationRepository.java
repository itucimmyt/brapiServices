package org.cimmyt.repository;

import org.cimmyt.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface LocationRepository extends JpaRepository<Place,Integer>{

}
