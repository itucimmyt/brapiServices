package org.cimmyt.repository;

import org.cimmyt.model.Plot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 * @author jarojas
 */
@Repository
public interface PlotRepository extends JpaRepository<Plot,Integer>{

	Page<Plot> findByStudyId(Pageable pageRequest, int studyId);
}
