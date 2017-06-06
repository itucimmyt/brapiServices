package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the seed_storage_log database table.
 * 
 */
@Entity
@Table(name="seed_storage_log", schema="operational")
@NamedQuery(name="SeedStorageLog.findAll", query="SELECT s FROM SeedStorageLog s")
public class SeedStorageLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="encode_timestamp")
	private Timestamp encodeTimestamp;

	@Column(name="encoder_id")
	private Integer encoderId;

	@Column(name="event_timestamp")
	private Timestamp eventTimestamp;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	private String receiver;

	private String remarks;

	@Column(name="seed_storage_id")
	private Integer seedStorageId;

	private String sender;

	@Column(name="transaction_type")
	private String transactionType;

	private String unit;

	private double volume;

	//bi-directional many-to-one association to Entry
	@OneToMany(mappedBy="seedStorageLog")
	private List<Entry> entries;

	//bi-directional many-to-one association to TempEntry
	@OneToMany(mappedBy="seedStorageLog")
	private List<TempEntry> tempEntries;

	public SeedStorageLog() {
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

	public Timestamp getEncodeTimestamp() {
		return this.encodeTimestamp;
	}

	public void setEncodeTimestamp(Timestamp encodeTimestamp) {
		this.encodeTimestamp = encodeTimestamp;
	}

	public Integer getEncoderId() {
		return this.encoderId;
	}

	public void setEncoderId(Integer encoderId) {
		this.encoderId = encoderId;
	}

	public Timestamp getEventTimestamp() {
		return this.eventTimestamp;
	}

	public void setEventTimestamp(Timestamp eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
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

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getSeedStorageId() {
		return this.seedStorageId;
	}

	public void setSeedStorageId(Integer seedStorageId) {
		this.seedStorageId = seedStorageId;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public List<Entry> getEntries() {
		return this.entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public Entry addEntry(Entry entry) {
		getEntries().add(entry);
		entry.setSeedStorageLog(this);

		return entry;
	}

	public Entry removeEntry(Entry entry) {
		getEntries().remove(entry);
		entry.setSeedStorageLog(null);

		return entry;
	}

	public List<TempEntry> getTempEntries() {
		return this.tempEntries;
	}

	public void setTempEntries(List<TempEntry> tempEntries) {
		this.tempEntries = tempEntries;
	}

	public TempEntry addTempEntry(TempEntry tempEntry) {
		getTempEntries().add(tempEntry);
		tempEntry.setSeedStorageLog(this);

		return tempEntry;
	}

	public TempEntry removeTempEntry(TempEntry tempEntry) {
		getTempEntries().remove(tempEntry);
		tempEntry.setSeedStorageLog(null);

		return tempEntry;
	}

}