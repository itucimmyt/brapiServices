package org.cimmyt.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the method database table 
 * @author RHTOLEDO
 *
 */
@Entity
@Table(schema="seed_warehouse")
@NamedQuery(name="Container.findAll", query="SELECT s FROM Container s")
public class Container implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer id;
	
	private BigDecimal  key;
	
	@Column(name="facility_id")
	private Integer facilityId; 
	
	private String type; 	

	private String label;  
	
    private String name;	

    private String status;
    
    private String remarks;
    
	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;    

    
	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;
	
    private String notes;
	
	@Column(name="is_void")
	private Boolean isVoid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getKey() {
		return key;
	}

	public void setKey(BigDecimal key) {
		this.key = key;
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Timestamp getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getIsVoid() {
		return isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
