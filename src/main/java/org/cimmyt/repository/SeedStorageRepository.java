package org.cimmyt.repository;

import org.cimmyt.model.SeedStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface SeedStorageRepository extends JpaRepository<SeedStorage, Integer>{}
