package org.cimmyt.api.brapi.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BrAPI representation of an Ontology variable
 * @author JAROJAS
 *
 */
public class BrVariableTO extends AbstractVocabulary{

	private String ontologyDbId;
	private String ontologyName;
	private String defaultValue;
	private BrTraitTO trait;
	private BrMethodTO method;
	private BrScaleTO scale;
	
	private String[] synonyms;
	private String[] contextOfUse;
	private String growthStage;
	private String status;
	private String institution;
	private String scientist;
	private String date;
	private String language;
	private String crop;
	
	@Override
	@JsonProperty("observationVariableDbId")
	public String getDbId() {
		return super.getDbId();
	}
	
	public String getOntologyDbId() {
		return ontologyDbId;
	}
	public void setOntologyDbId(String ontologyDbId) {
		this.ontologyDbId = ontologyDbId;
	}
	public String getOntologyName() {
		return ontologyName;
	}
	public void setOntologyName(String ontologyName) {
		this.ontologyName = ontologyName;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public BrTraitTO getTrait() {
		return trait;
	}
	public void setTrait(BrTraitTO trait) {
		this.trait = trait;
	}
	public BrMethodTO getMethod() {
		return method;
	}
	public void setMethod(BrMethodTO method) {
		this.method = method;
	}
	public BrScaleTO getScale() {
		return scale;
	}
	public void setScale(BrScaleTO scale) {
		this.scale = scale;
	}
	public String[] getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String[] synonyms) {
		this.synonyms = synonyms;
	}
	public String[] getContextOfUse() {
		return contextOfUse;
	}
	public void setContextOfUse(String[] contextOfUse) {
		this.contextOfUse = contextOfUse;
	}
	public String getGrowthStage() {
		return growthStage;
	}
	public void setGrowthStage(String growthStage) {
		this.growthStage = growthStage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getScientist() {
		return scientist;
	}
	public void setScientist(String scientist) {
		this.scientist = scientist;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
}
