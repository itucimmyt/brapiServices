package org.cimmyt.repository;

import java.util.List;

import org.cimmyt.model.PlotData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface PlotDataRepository extends JpaRepository<PlotData,Integer>{
	@Query("select p.variable.id from PlotData p where study.id = :studyId group by p.variable.id")
	List<Integer> findVariableIds(@Param("studyId") Integer studyId);
	
}
