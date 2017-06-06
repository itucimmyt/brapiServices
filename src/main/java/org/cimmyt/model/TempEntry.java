package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the temp_entry database table.
 * 
 */
@Entity
@Table(name="temp_entry", schema="operational")
@NamedQuery(name="TempEntry.findAll", query="SELECT t FROM TempEntry t")
public class TempEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	private String entcode;

	private Integer entno;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	private BigDecimal key;

	@Column(name="list_member_id")
	private Integer listMemberId;

	private String metno;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	@Column(name="product_gid")
	private Integer productGid;

	@Column(name="product_gid_id")
	private Integer productGidId;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="product_name")
	private String productName;

	private String remarks;

	@Column(name="study_id")
	private Integer studyId;

	//bi-directional many-to-one association to SeedStorageLog
	@ManyToOne
	@JoinColumn(name="seed_storage_log_id")
	private SeedStorageLog seedStorageLog;

	//bi-directional many-to-one association to TempEntryData
	@OneToMany(mappedBy="tempEntry")
	private List<TempEntryData> tempEntryData;

	//bi-directional many-to-one association to TempEntryMetadata
	@OneToMany(mappedBy="tempEntry")
	private List<TempEntryMetadata> tempEntryMetadata;

	//bi-directional many-to-one association to TempPlot
	@OneToMany(mappedBy="tempEntry")
	private List<TempPlot> tempPlots;

	//bi-directional many-to-one association to TempPlotData
	@OneToMany(mappedBy="tempEntry")
	private List<TempPlotData> tempPlotData;

	//bi-directional many-to-one association to TempPlotMetadata
	@OneToMany(mappedBy="tempEntry")
	private List<TempPlotMetadata> tempPlotMetadata;

	public TempEntry() {
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

	public String getEntcode() {
		return this.entcode;
	}

	public void setEntcode(String entcode) {
		this.entcode = entcode;
	}

	public Integer getEntno() {
		return this.entno;
	}

	public void setEntno(Integer entno) {
		this.entno = entno;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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

	public Integer getListMemberId() {
		return this.listMemberId;
	}

	public void setListMemberId(Integer listMemberId) {
		this.listMemberId = listMemberId;
	}

	public String getMetno() {
		return this.metno;
	}

	public void setMetno(String metno) {
		this.metno = metno;
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

	public Integer getProductGid() {
		return this.productGid;
	}

	public void setProductGid(Integer productGid) {
		this.productGid = productGid;
	}

	public Integer getProductGidId() {
		return this.productGidId;
	}

	public void setProductGidId(Integer productGidId) {
		this.productGidId = productGidId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getStudyId() {
		return this.studyId;
	}

	public void setStudyId(Integer studyId) {
		this.studyId = studyId;
	}

	public SeedStorageLog getSeedStorageLog() {
		return this.seedStorageLog;
	}

	public void setSeedStorageLog(SeedStorageLog seedStorageLog) {
		this.seedStorageLog = seedStorageLog;
	}

	public List<TempEntryData> getTempEntryData() {
		return this.tempEntryData;
	}

	public void setTempEntryData(List<TempEntryData> tempEntryData) {
		this.tempEntryData = tempEntryData;
	}

	public TempEntryData addTempEntryData(TempEntryData tempEntryData) {
		getTempEntryData().add(tempEntryData);
		tempEntryData.setTempEntry(this);

		return tempEntryData;
	}

	public TempEntryData removeTempEntryData(TempEntryData tempEntryData) {
		getTempEntryData().remove(tempEntryData);
		tempEntryData.setTempEntry(null);

		return tempEntryData;
	}

	public List<TempEntryMetadata> getTempEntryMetadata() {
		return this.tempEntryMetadata;
	}

	public void setTempEntryMetadata(List<TempEntryMetadata> tempEntryMetadata) {
		this.tempEntryMetadata = tempEntryMetadata;
	}

	public TempEntryMetadata addTempEntryMetadata(TempEntryMetadata tempEntryMetadata) {
		getTempEntryMetadata().add(tempEntryMetadata);
		tempEntryMetadata.setTempEntry(this);

		return tempEntryMetadata;
	}

	public TempEntryMetadata removeTempEntryMetadata(TempEntryMetadata tempEntryMetadata) {
		getTempEntryMetadata().remove(tempEntryMetadata);
		tempEntryMetadata.setTempEntry(null);

		return tempEntryMetadata;
	}

	public List<TempPlot> getTempPlots() {
		return this.tempPlots;
	}

	public void setTempPlots(List<TempPlot> tempPlots) {
		this.tempPlots = tempPlots;
	}

	public TempPlot addTempPlot(TempPlot tempPlot) {
		getTempPlots().add(tempPlot);
		tempPlot.setTempEntry(this);

		return tempPlot;
	}

	public TempPlot removeTempPlot(TempPlot tempPlot) {
		getTempPlots().remove(tempPlot);
		tempPlot.setTempEntry(null);

		return tempPlot;
	}

	public List<TempPlotData> getTempPlotData() {
		return this.tempPlotData;
	}

	public void setTempPlotData(List<TempPlotData> tempPlotData) {
		this.tempPlotData = tempPlotData;
	}

	public TempPlotData addTempPlotData(TempPlotData tempPlotData) {
		getTempPlotData().add(tempPlotData);
		tempPlotData.setTempEntry(this);

		return tempPlotData;
	}

	public TempPlotData removeTempPlotData(TempPlotData tempPlotData) {
		getTempPlotData().remove(tempPlotData);
		tempPlotData.setTempEntry(null);

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
		tempPlotMetadata.setTempEntry(this);

		return tempPlotMetadata;
	}

	public TempPlotMetadata removeTempPlotMetadata(TempPlotMetadata tempPlotMetadata) {
		getTempPlotMetadata().remove(tempPlotMetadata);
		tempPlotMetadata.setTempEntry(null);

		return tempPlotMetadata;
	}

}