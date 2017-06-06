package org.cimmyt.api.brapi.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BrAPI representation of an Ontology trait
 * @author JAROJAS
 *
 */public class BrTraitTO extends AbstractVocabulary{
	
	private String description;
	private String[] synonyms;
	private String mainAbbreviation;
	private String[] alternativeAbbreviations;
	private String entity;
	private String attribute;
	private String status;

	@Override
	@JsonProperty("traitDbId")
	public String getDbId() {
		return super.getDbId();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String[] synonyms) {
		this.synonyms = synonyms;
	}
	public String getMainAbbreviation() {
		return mainAbbreviation;
	}
	public void setMainAbbreviation(String mainAbbreviation) {
		this.mainAbbreviation = mainAbbreviation;
	}
	public String[] getAlternativeAbbreviations() {
		return alternativeAbbreviations;
	}
	public void setAlternativeAbbreviations(String[] alternativeAbbreviations) {
		this.alternativeAbbreviations = alternativeAbbreviations;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
