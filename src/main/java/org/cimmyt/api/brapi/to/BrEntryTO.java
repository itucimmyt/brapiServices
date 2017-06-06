package org.cimmyt.api.brapi.to;

/**
 * 
 * @author JAROJAS
 *
 */
public class BrEntryTO {

	private int germplasmDbId;
	private int entryNumber;
	private String germplasmName;
	private String pedigree;
	private String seedSource;
	private String accessionNumber;
	private String germplasmPUI;
	private String[] synonyms;
	
	public int getGermplasmDbId() {
		return germplasmDbId;
	}
	public void setGermplasmDbId(int germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
	}
	public int getEntryNumber() {
		return entryNumber;
	}
	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}
	public String getGermplasmName() {
		return germplasmName;
	}
	public void setGermplasmName(String germplasmName) {
		this.germplasmName = germplasmName;
	}
	public String getPedigree() {
		return pedigree;
	}
	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}
	public String getSeedSource() {
		return seedSource;
	}
	public void setSeedSource(String seedSource) {
		this.seedSource = seedSource;
	}
	public String getAccessionNumber() {
		return accessionNumber;
	}
	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
	}
	public String getGermplasmPUI() {
		return germplasmPUI;
	}
	public void setGermplasmPUI(String germplasmPUI) {
		this.germplasmPUI = germplasmPUI;
	}
	public String[] getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String[] synonyms) {
		this.synonyms = synonyms;
	}
		
}