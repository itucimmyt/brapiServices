package org.cimmyt.repository;

import org.cimmyt.model.Container;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface ContainerRepository extends JpaRepository<Container,Integer>{

}
