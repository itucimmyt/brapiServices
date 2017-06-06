package org.cimmyt.repository;

import org.cimmyt.model.CrossMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author jarojas
 *
 */
@Repository
public interface CrossMethodRepository extends JpaRepository<CrossMethod,Integer>{

}
