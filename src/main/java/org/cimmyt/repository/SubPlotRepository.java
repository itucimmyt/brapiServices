package org.cimmyt.repository;

import org.cimmyt.model.Subplot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author jarojas
 */
@Repository
public interface SubPlotRepository extends JpaRepository<Subplot,Integer>{

	Page<Subplot> findByStudyId(Pageable pageRequest, int studyId);
}
