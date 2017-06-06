package org.cimmyt.api.brapi.to;

import org.cimmyt.api.ApiTO;
import org.cimmyt.model.StudyMetadata;

/**
 * {@link ApiTO Transfer Object} for {@link StudyMetadata} in BrAPI calls
 * @author JAROJAS
 *
 */
public class BrStudyMetadataTO implements ApiTO<StudyMetadata>{
	
	private String metaName;

	public String getMetaName() {
		return metaName;
	}

	public void setMetaName(String metaName) {
		this.metaName = metaName;
	}
	

	
}
