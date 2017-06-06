package org.cimmyt.repository;

import org.cimmyt.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Manages persistance for {@link Property} instances
 * @author jarojas
 *
 */
@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer>{

}
