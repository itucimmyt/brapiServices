package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the seed_storage database table.
 * 
 */
@Entity
@Table(name="seed_storage", schema="operational")
@NamedQuery(name="SeedStorage.findAll", query="SELECT s FROM SeedStorage s")
public class SeedStorage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	private Integer gid;

	@Temporal(TemporalType.DATE)
	@Column(name="harvest_date")
	private Date harvestDate;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="key_type")
	private String keyType;

	private String label;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String notes;

	@Column(name="product_gid_id")
	private Integer productGidId;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="program_id")
	private Integer programId;

	private String remarks;

	@Column(name="seed_lot_id")
	private BigDecimal seedLotId;

	@Column(name="seed_manager")
	private String seedManager;

	@Column(name="seed_storage_status")
	private String seedStorageStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="seeds_acquired_date")
	private Date seedsAcquiredDate;

	@Column(name="selection_number")
	private Integer selectionNumber;

	@Column(name="temp_seed_lot_id")
	private String tempSeedLotId;

	private String unit;

	private double volume;

	//bi-directional many-to-one association to SeedStorage
	@ManyToOne
	@JoinColumn(name="original_storage_id")
	private SeedStorage seedStorage;

	//bi-directional many-to-one association to SeedStorage
	@OneToMany(mappedBy="seedStorage")
	private List<SeedStorage> seedStorages;

	//bi-directional many-to-one association to SeedStorageMetadata
	@OneToMany(mappedBy="seedStorage")
	private List<SeedStorageMetadata> seedStorageMetadata;

	public SeedStorage() {}
	
	public SeedStorage(String remarks) {
		this.remarks = remarks;
		this.volume  = 1000;
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

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Date getHarvestDate() {
		return this.harvestDate;
	}

	public void setHarvestDate(Date harvestDate) {
		this.harvestDate = harvestDate;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public String getKeyType() {
		return this.keyType;
	}

	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public BigDecimal getSeedLotId() {
		return this.seedLotId;
	}

	public void setSeedLotId(BigDecimal seedLotId) {
		this.seedLotId = seedLotId;
	}

	public String getSeedManager() {
		return this.seedManager;
	}

	public void setSeedManager(String seedManager) {
		this.seedManager = seedManager;
	}

	public String getSeedStorageStatus() {
		return this.seedStorageStatus;
	}

	public void setSeedStorageStatus(String seedStorageStatus) {
		this.seedStorageStatus = seedStorageStatus;
	}

	public Date getSeedsAcquiredDate() {
		return this.seedsAcquiredDate;
	}

	public void setSeedsAcquiredDate(Date seedsAcquiredDate) {
		this.seedsAcquiredDate = seedsAcquiredDate;
	}

	public Integer getSelectionNumber() {
		return this.selectionNumber;
	}

	public void setSelectionNumber(Integer selectionNumber) {
		this.selectionNumber = selectionNumber;
	}

	public String getTempSeedLotId() {
		return this.tempSeedLotId;
	}

	public void setTempSeedLotId(String tempSeedLotId) {
		this.tempSeedLotId = tempSeedLotId;
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

	public SeedStorage getSeedStorage() {
		return this.seedStorage;
	}

	public void setSeedStorage(SeedStorage seedStorage) {
		this.seedStorage = seedStorage;
	}

	public List<SeedStorage> getSeedStorages() {
		return this.seedStorages;
	}

	public void setSeedStorages(List<SeedStorage> seedStorages) {
		this.seedStorages = seedStorages;
	}

	public SeedStorage addSeedStorage(SeedStorage seedStorage) {
		getSeedStorages().add(seedStorage);
		seedStorage.setSeedStorage(this);

		return seedStorage;
	}

	public SeedStorage removeSeedStorage(SeedStorage seedStorage) {
		getSeedStorages().remove(seedStorage);
		seedStorage.setSeedStorage(null);

		return seedStorage;
	}

	public List<SeedStorageMetadata> getSeedStorageMetadata() {
		return this.seedStorageMetadata;
	}

	public void setSeedStorageMetadata(List<SeedStorageMetadata> seedStorageMetadata) {
		this.seedStorageMetadata = seedStorageMetadata;
	}

	public SeedStorageMetadata addSeedStorageMetadata(SeedStorageMetadata seedStorageMetadata) {
		getSeedStorageMetadata().add(seedStorageMetadata);
		seedStorageMetadata.setSeedStorage(this);

		return seedStorageMetadata;
	}

	public SeedStorageMetadata removeSeedStorageMetadata(SeedStorageMetadata seedStorageMetadata) {
		getSeedStorageMetadata().remove(seedStorageMetadata);
		seedStorageMetadata.setSeedStorage(null);

		return seedStorageMetadata;
	}

}