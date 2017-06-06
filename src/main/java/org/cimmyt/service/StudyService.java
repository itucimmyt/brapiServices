package org.cimmyt.service;

import java.util.List;

import org.cimmyt.model.Entry;
import org.cimmyt.model.Study;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Logic to manage {@link Study studies}
 * @author jarojas
 *
 */
public interface StudyService {

	Page<Study> getStudies(Pageable page);
	
	List<Entry> findEntries(int studyId);

}