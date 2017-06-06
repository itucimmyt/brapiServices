package org.cimmyt.repository;

import org.cimmyt.model.ScaleValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */

@Repository
public interface StudyTypeRepository extends JpaRepository<ScaleValue,Integer>{

}
