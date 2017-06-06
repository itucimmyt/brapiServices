package org.cimmyt.model;

import javax.persistence.Column;

public class SearchInfo {
	
	
	private String  solrId;
    private Integer breedingMethodId;
    private Integer specimenId;
    @Column(name="entity_name")
    private String  entityName;
    private String  specimenName;
    private String  genotypeName;
    private Integer filialGeneration;
    private Integer genotypeId;
    private Integer isActive;
    private Integer genusId;
    private String  version;
    private String  specimenBarcode;
    
	public String getSolrId() {
		return solrId;
	}
	public void setSolrId(String solrId) {
		this.solrId = solrId;
	}
	public Integer getBreedingMethodId() {
		return breedingMethodId;
	}
	public void setBreedingMethodId(Integer breedingMethodId) {
		this.breedingMethodId = breedingMethodId;
	}
	public Integer getSpecimenId() {
		return specimenId;
	}
	public void setSpecimenId(Integer specimenId) {
		this.specimenId = specimenId;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getSpecimenName() {
		return specimenName;
	}
	public void setSpecimenName(String specimenName) {
		this.specimenName = specimenName;
	}
	public String getGenotypeName() {
		return genotypeName;
	}
	public void setGenotypeName(String genotypeName) {
		this.genotypeName = genotypeName;
	}
	public Integer getFilialGeneration() {
		return filialGeneration;
	}
	public void setFilialGeneration(Integer filialGeneration) {
		this.filialGeneration = filialGeneration;
	}
	public Integer getGenotypeId() {
		return genotypeId;
	}
	public void setGenotypeId(Integer genotypeId) {
		this.genotypeId = genotypeId;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	public Integer getGenusId() {
		return genusId;
	}
	public void setGenusId(Integer genusId) {
		this.genusId = genusId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSpecimenBarcode() {
		return specimenBarcode;
	}
	public void setSpecimenBarcode(String specimenBarcode) {
		this.specimenBarcode = specimenBarcode;
	}
    
    
    
	

}
