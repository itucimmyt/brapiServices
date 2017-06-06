package org.cimmyt.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="master",name="cross_method")
public class CrossMethod {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String abbrev;
	@Column
	private String name;
	@Column
	private String description;
	@Column(name="display_name")
	private String displayName;
	@Column
	private String remarks;
	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;
	@Column(name="creator_id")
	private Integer creatorId;
	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;
	@Column(name="modifier_id")
	private Integer modifierId;
	@Column
	private String notes;
	@Column(name="is_void")
	private boolean isVoid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
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
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
	public Integer getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	public Timestamp getModificationTimestamp() {
		return modificationTimestamp;
	}
	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}
	public Integer getModifierId() {
		return modifierId;
	}
	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public boolean isVoid() {
		return isVoid;
	}
	public void setVoid(boolean isVoid) {
		this.isVoid = isVoid;
	}
}
