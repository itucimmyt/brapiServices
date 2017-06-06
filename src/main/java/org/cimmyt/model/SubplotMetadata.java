package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the subplot_metadata database table.
 * 
 */
@Entity
@Table(name="subplot_metadata", schema="operational")
@NamedQuery(name="SubplotMetadata.findAll", query="SELECT s FROM SubplotMetadata s")
public class SubplotMetadata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	private String remarks;

	private String value;

	@Column(name="variable_id")
	private Integer variableId;

	//bi-directional many-to-one association to Entry
	@ManyToOne
	private Entry entry;

	//bi-directional many-to-one association to Plot
	@ManyToOne
	private Plot plot;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to Subplot
	@ManyToOne
	private Subplot subplot;

	public SubplotMetadata() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreationTimestamp() {
		return this.creationTimestamp;
	}

	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public Integer getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getVariableId() {
		return this.variableId;
	}

	public void setVariableId(Integer variableId) {
		this.variableId = variableId;
	}

	public Entry getEntry() {
		return this.entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public Plot getPlot() {
		return this.plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	public Subplot getSubplot() {
		return this.subplot;
	}

	public void setSubplot(Subplot subplot) {
		this.subplot = subplot;
	}

}