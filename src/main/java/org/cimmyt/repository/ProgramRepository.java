package org.cimmyt.repository;

import org.cimmyt.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */

@Repository
public interface ProgramRepository extends JpaRepository<Program, Integer> {

}
