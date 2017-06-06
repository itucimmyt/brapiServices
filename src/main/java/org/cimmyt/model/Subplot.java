package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the subplot database table.
 * 
 */
@Entity
@Table(schema="operational")
@NamedQuery(name="Subplot.findAll", query="SELECT s FROM Subplot s")
public class Subplot implements Serializable {
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

	private BigDecimal key;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	private String remarks;

	private Integer subplotno;

	//bi-directional many-to-one association to Entry
	@ManyToOne
	private Entry entry;

	//bi-directional many-to-one association to Plot
	@ManyToOne
	private Plot plot;

	//bi-directional many-to-one association to Study
	@ManyToOne
	private Study study;

	//bi-directional many-to-one association to SubplotData
	@OneToMany(mappedBy="subplot")
	private List<SubplotData> subplotData;

	//bi-directional many-to-one association to SubplotMetadata
	@OneToMany(mappedBy="subplot")
	private List<SubplotMetadata> subplotMetadata;

	public Subplot() {
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getSubplotno() {
		return this.subplotno;
	}

	public void setSubplotno(Integer subplotno) {
		this.subplotno = subplotno;
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

	public List<SubplotData> getSubplotData() {
		return this.subplotData;
	}

	public void setSubplotData(List<SubplotData> subplotData) {
		this.subplotData = subplotData;
	}

	public SubplotData addSubplotData(SubplotData subplotData) {
		getSubplotData().add(subplotData);
		subplotData.setSubplot(this);

		return subplotData;
	}

	public SubplotData removeSubplotData(SubplotData subplotData) {
		getSubplotData().remove(subplotData);
		subplotData.setSubplot(null);

		return subplotData;
	}

	public List<SubplotMetadata> getSubplotMetadata() {
		return this.subplotMetadata;
	}

	public void setSubplotMetadata(List<SubplotMetadata> subplotMetadata) {
		this.subplotMetadata = subplotMetadata;
	}

	public SubplotMetadata addSubplotMetadata(SubplotMetadata subplotMetadata) {
		getSubplotMetadata().add(subplotMetadata);
		subplotMetadata.setSubplot(this);

		return subplotMetadata;
	}

	public SubplotMetadata removeSubplotMetadata(SubplotMetadata subplotMetadata) {
		getSubplotMetadata().remove(subplotMetadata);
		subplotMetadata.setSubplot(null);

		return subplotMetadata;
	}

}