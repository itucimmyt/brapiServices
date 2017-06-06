package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the temp_plot database table.
 * 
 */
@Entity
@Table(name="temp_plot", schema="operational")
@NamedQuery(name="TempPlot.findAll", query="SELECT t FROM TempPlot t")
public class TempPlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String code;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="is_void")
	private Boolean isVoid;

	private BigDecimal key;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	private Integer plotno;

	private String remarks;

	private Integer rep;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to TempEntry
	@ManyToOne
	@JoinColumn(name="entry_id")
	private TempEntry tempEntry;

	//bi-directional many-to-one association to TempPlotData
	@OneToMany(mappedBy="tempPlot")
	private List<TempPlotData> tempPlotData;

	//bi-directional many-to-one association to TempPlotMetadata
	@OneToMany(mappedBy="tempPlot")
	private List<TempPlotMetadata> tempPlotMetadata;

	public TempPlot() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public BigDecimal getKey() {
		return this.key;
	}

	public void setKey(BigDecimal key) {
		this.key = key;
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

	public Integer getPlotno() {
		return this.plotno;
	}

	public void setPlotno(Integer plotno) {
		this.plotno = plotno;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getRep() {
		return this.rep;
	}

	public void setRep(Integer rep) {
		this.rep = rep;
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

	public List<TempPlotData> getTempPlotData() {
		return this.tempPlotData;
	}

	public void setTempPlotData(List<TempPlotData> tempPlotData) {
		this.tempPlotData = tempPlotData;
	}

	public TempPlotData addTempPlotData(TempPlotData tempPlotData) {
		getTempPlotData().add(tempPlotData);
		tempPlotData.setTempPlot(this);

		return tempPlotData;
	}

	public TempPlotData removeTempPlotData(TempPlotData tempPlotData) {
		getTempPlotData().remove(tempPlotData);
		tempPlotData.setTempPlot(null);

		return tempPlotData;
	}

	public List<TempPlotMetadata> getTempPlotMetadata() {
		return this.tempPlotMetadata;
	}

	public void setTempPlotMetadata(List<TempPlotMetadata> tempPlotMetadata) {
		this.tempPlotMetadata = tempPlotMetadata;
	}

	public TempPlotMetadata addTempPlotMetadata(TempPlotMetadata tempPlotMetadata) {
		getTempPlotMetadata().add(tempPlotMetadata);
		tempPlotMetadata.setTempPlot(this);

		return tempPlotMetadata;
	}

	public TempPlotMetadata removeTempPlotMetadata(TempPlotMetadata tempPlotMetadata) {
		getTempPlotMetadata().remove(tempPlotMetadata);
		tempPlotMetadata.setTempPlot(null);

		return tempPlotMetadata;
	}

}