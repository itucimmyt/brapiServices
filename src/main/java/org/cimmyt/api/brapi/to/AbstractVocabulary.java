package org.cimmyt.api.brapi.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common fields for different BrAPI's ontology terms
 * @author JAROJAS
 *
 */
class AbstractVocabulary {

	private String dbId;
	private String name;
	private String xref;
	@JsonProperty("class")
	private String clazz;
	
	public String getDbId() {
		return dbId;
	}
	public void setDbId(String dbId) {
		this.dbId = dbId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getXref() {
		return xref;
	}
	public void setXref(String xref) {
		this.xref = xref;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

}
