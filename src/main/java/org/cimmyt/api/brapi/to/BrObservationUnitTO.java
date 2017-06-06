package org.cimmyt.api.brapi.to;

import java.util.List;

/**
 * 
 * @author JAROJAS
 *
 */
public class BrObservationUnitTO {

	private Integer observationUnitDbId;
	private String observationUnitName;
	private Integer germplasmDbId; 
	private String germplasmName;
	private String pedigree;
	private Integer entryNumber; 
	private String entryType;
	private Integer plotNumber; 
	private Integer plantNumber;
	private Integer blockNumber;
	private Integer x;
	private Integer y;
	private Integer replicate;
	private List<BrObservationTO> observations;
	
	public Integer getObservationUnitDbId() {
		return observationUnitDbId;
	}
	public void setObservationUnitDbId(Integer observationUnitDbId) {
		this.observationUnitDbId = observationUnitDbId;
	}
	public String getObservationUnitName() {
		return observationUnitName;
	}
	public void setObservationUnitName(String observationUnitName) {
		this.observationUnitName = observationUnitName;
	}
	public Integer getGermplasmDbId() {
		return germplasmDbId;
	}
	public void setGermplasmDbId(Integer germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
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
	public Integer getEntryNumber() {
		return entryNumber;
	}
	public void setEntryNumber(Integer entryNumber) {
		this.entryNumber = entryNumber;
	}
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public Integer getPlotNumber() {
		return plotNumber;
	}
	public void setPlotNumber(Integer plotNumber) {
		this.plotNumber = plotNumber;
	}
	public Integer getPlantNumber() {
		return plantNumber;
	}
	public void setPlantNumber(Integer plantNumber) {
		this.plantNumber = plantNumber;
	}
	public Integer getBlockNumber() {
		return blockNumber;
	}
	public void setBlockNumber(Integer blockNumber) {
		this.blockNumber = blockNumber;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getReplicate() {
		return replicate;
	}
	public void setReplicate(Integer replicate) {
		this.replicate = replicate;
	}
	public List<BrObservationTO> getObservations() {
		return observations;
	}
	public void setObservations(List<BrObservationTO> observations) {
		this.observations = observations;
	}
}
