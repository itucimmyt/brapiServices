package org.cimmyt.api.brapi.to;

/**
 * 
 * @author JAROJAS
 *
 */
public class BrStudyTypeTO {

	private Integer studyTypeDbId;
	private String name;
	private String description;
	
	public Integer getStudyTypeDbId() {
		return studyTypeDbId;
	}
	public void setStudyTypeDbId(Integer studyTypeDbId) {
		this.studyTypeDbId = studyTypeDbId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
