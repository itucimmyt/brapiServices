package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the temp_plot_data database table.
 * 
 */
@Entity
@Table(name="temp_plot_data", schema="operational")
@NamedQuery(name="TempPlotData.findAll", query="SELECT t FROM TempPlotData t")
public class TempPlotData implements Serializable {
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

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to TempEntry
	@ManyToOne
	@JoinColumn(name="entry_id")
	private TempEntry tempEntry;

	//bi-directional many-to-one association to TempPlot
	@ManyToOne
	@JoinColumn(name="plot_id")
	private TempPlot tempPlot;

	public TempPlotData() {
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

	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	public TempEntry getTempEntry() {
		return this.tempEntry;
	}

	public void setTempEntry(TempEntry tempEntry) {
		this.tempEntry = tempEntry;
	}

	public TempPlot getTempPlot() {
		return this.tempPlot;
	}

	public void setTempPlot(TempPlot tempPlot) {
		this.tempPlot = tempPlot;
	}

}