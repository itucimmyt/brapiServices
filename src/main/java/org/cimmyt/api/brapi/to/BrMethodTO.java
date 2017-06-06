package org.cimmyt.api.brapi.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BrAPI representation of an Ontology method
 * @author JAROJAS
 *
 */
public class BrMethodTO extends AbstractVocabulary{

	private String description;
	private String formula;

	@Override
	@JsonProperty("methodDbId")
	public String getDbId() {
		return super.getDbId();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
}
