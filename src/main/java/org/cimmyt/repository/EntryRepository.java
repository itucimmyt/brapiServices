package org.cimmyt.repository;

import org.cimmyt.model.Entry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author jarojas
 *
 */

@Repository
public interface EntryRepository extends JpaRepository<Entry,Integer>{

	public Page<Entry> findByStudyId(int studyId, Pageable page);
}
