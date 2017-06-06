package org.cimmyt.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * This is the model managed by CERES. In B4R, there is no model for
 * breeding method catalog data. 
 * 
 * It is necessary to discuss with IRRI developers
 * 
 * @author RHTOLEDO
 * @version 1.0
 */

public class BreedingMethodVariable implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer   id;
	private String    name;
	private String    description;
	private String    code;
	private Integer   cropId;
	private Integer   typeId;
	private Integer   statusId;
	private Timestamp createdOn;
	private Integer   createdBy;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getCropId() {
		return cropId;
	}
	public void setCropId(Integer cropId) {
		this.cropId = cropId;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
