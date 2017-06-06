package org.cimmyt.repository;

import org.cimmyt.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface SeasonRepository extends JpaRepository<Season,Integer>{

}
