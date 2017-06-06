package org.cimmyt.api.brapi.to;

/**
 * 
 * @author JAROJAS
 *
 */
public class BrTraitDetailTO {
	private String traitDbId;
	private String traitId;
	private String name;
	private String description;
	private String defaultValue;
	private String[] observationVariables;
	
	public String getTraitDbId() {
		return traitDbId;
	}
	public void setTraitDbId(String traitDbId) {
		this.traitDbId = traitDbId;
	}
	public String getTraitId() {
		return traitId;
	}
	public void setTraitId(String traitId) {
		this.traitId = traitId;
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
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String[] getObservationVariables() {
		return observationVariables;
	}
	public void setObservationVariables(String[] observationVariables) {
		this.observationVariables = observationVariables;
	}
}
