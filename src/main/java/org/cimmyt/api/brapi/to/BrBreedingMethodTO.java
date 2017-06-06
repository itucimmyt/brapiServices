package org.cimmyt.api.brapi.to;

/**
 * 
 * @author JAROJAS
 *
 */
public class BrBreedingMethodTO {

	private int breedingMethodDbId;
	private String abbreviation;
	private String name;
	private String description;
	
	public int getBreedingMethodDbId() {
		return breedingMethodDbId;
	}
	public void setBreedingMethodDbId(int breedingMethodDbId) {
		this.breedingMethodDbId = breedingMethodDbId;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
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
