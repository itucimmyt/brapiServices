package org.cimmyt.repository;

import org.cimmyt.model.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface UnitsRepository extends JpaRepository<Units,Integer>{

}
