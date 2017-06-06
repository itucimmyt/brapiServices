package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the cross database table.
 * 
 */
@Entity
@Table(schema="operational")
@NamedQuery(name="Cross.findAll", query="SELECT c FROM Cross c")
public class Cross implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="cross_list_id")
	private Integer crossListId;

	@Column(name="cross_method_id")
	private Integer crossMethodId;

	@Column(name="cross_name")
	private String crossName;

	private Integer crossno;

	private String description;

	private String entcode;

	private Integer entno;

	@Column(name="female_plot_id")
	private Integer femalePlotId;

	@Column(name="is_success")
	private Boolean isSuccess;

	@Column(name="is_void")
	private Boolean isVoid;

	private BigDecimal key;

	@Column(name="male_plot_id")
	private Integer malePlotId;

	@Column(name="modification_timestamp")
	private Time modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	@Column(name="phase_id")
	private Integer phaseId;

	@Column(name="place_id")
	private Integer placeId;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="program_id")
	private Integer programId;

	private String remarks;

	@Column(name="season_id")
	private Integer seasonId;

	private Integer year;

	//bi-directional many-to-one association to Entry
	@ManyToOne
	@JoinColumn(name="female_entry_id")
	private Entry entry1;

	//bi-directional many-to-one association to Entry
	@ManyToOne
	@JoinColumn(name="male_entry_id")
	private Entry entry2;

	public Cross() {
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

	public Integer getCrossListId() {
		return this.crossListId;
	}

	public void setCrossListId(Integer crossListId) {
		this.crossListId = crossListId;
	}

	public Integer getCrossMethodId() {
		return this.crossMethodId;
	}

	public void setCrossMethodId(Integer crossMethodId) {
		this.crossMethodId = crossMethodId;
	}

	public String getCrossName() {
		return this.crossName;
	}

	public void setCrossName(String crossName) {
		this.crossName = crossName;
	}

	public Integer getCrossno() {
		return this.crossno;
	}

	public void setCrossno(Integer crossno) {
		this.crossno = crossno;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Integer getFemalePlotId() {
		return this.femalePlotId;
	}

	public void setFemalePlotId(Integer femalePlotId) {
		this.femalePlotId = femalePlotId;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
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

	public Integer getMalePlotId() {
		return this.malePlotId;
	}

	public void setMalePlotId(Integer malePlotId) {
		this.malePlotId = malePlotId;
	}

	public Time getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Time modificationTimestamp) {
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

	public Integer getPhaseId() {
		return this.phaseId;
	}

	public void setPhaseId(Integer phaseId) {
		this.phaseId = phaseId;
	}

	public Integer getPlaceId() {
		return this.placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getSeasonId() {
		return this.seasonId;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Entry getEntry1() {
		return this.entry1;
	}

	public void setEntry1(Entry entry1) {
		this.entry1 = entry1;
	}

	public Entry getEntry2() {
		return this.entry2;
	}

	public void setEntry2(Entry entry2) {
		this.entry2 = entry2;
	}

}