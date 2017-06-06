package org.cimmyt.repository;

import org.cimmyt.model.Variable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface VariableRepository extends JpaRepository<Variable,Integer>{

	@Query("select v.property.id from Variable v where type=:type group by v.property.id")
	Page<Integer> findByType(Pageable pageRequest,@Param("type") String type);
}
