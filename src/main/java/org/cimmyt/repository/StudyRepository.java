
package org.cimmyt.repository;

import org.cimmyt.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */

@Repository
public interface StudyRepository extends JpaRepository<Study, Integer>{

}
