package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the facility database table.
 * 
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Facility.findAll", query="SELECT f FROM Facility f")
public class Facility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="facility_type")
	private String facilityType;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	private double latitude;

	@Column(name="layer_id")
	private String layerId;

	private Integer level;

	private double longitude;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	@Column(name="object_id")
	private Integer objectId;

	@Column(name="other_name")
	private String otherName;

	@Column(name="parent_id")
	private Integer parentId;

	private String remarks;

	private String section;

	@Column(name="table_id")
	private String tableId;

	@Column(name="warehouse_key")
	private BigDecimal warehouseKey;

	private String zone;

	//bi-directional many-to-one association to Institute
	@ManyToOne
	private Institute institute;

	//bi-directional many-to-one association to Place
	@ManyToOne
	private Place place;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to FacilityData
	@OneToMany(mappedBy="facility")
	private List<FacilityData> facilityData;

	//bi-directional many-to-one association to FacilityMetadata
	//@OneToMany(mappedBy="facility")
	//private List<FacilityMetadata> facilityMetadata;

	public Facility() {
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

	public String getFacilityType() {
		return this.facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
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

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getLayerId() {
		return this.layerId;
	}

	public void setLayerId(String layerId) {
		this.layerId = layerId;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public BigDecimal getWarehouseKey() {
		return this.warehouseKey;
	}

	public void setWarehouseKey(BigDecimal warehouseKey) {
		this.warehouseKey = warehouseKey;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Institute getInstitute() {
		return this.institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public Place getPlace() {
		return this.place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	//public User getUser1() {
	//	return this.user1;
	//}

	//public void setUser1(User user1) {
	//	this.user1 = user1;
	//}

	//public User getUser2() {
	//	return this.user2;
	//}

	//public void setUser2(User user2) {
	//	this.user2 = user2;
	//}

	public List<FacilityData> getFacilityData() {
		return this.facilityData;
	}

	public void setFacilityData(List<FacilityData> facilityData) {
		this.facilityData = facilityData;
	}

	public FacilityData addFacilityData(FacilityData facilityData) {
		getFacilityData().add(facilityData);
		facilityData.setFacility(this);

		return facilityData;
	}

	public FacilityData removeFacilityData(FacilityData facilityData) {
		getFacilityData().remove(facilityData);
		facilityData.setFacility(null);

		return facilityData;
	}

	//public List<FacilityMetadata> getFacilityMetadata() {
	//	return this.facilityMetadata;
	//}

	//public void setFacilityMetadata(List<FacilityMetadata> facilityMetadata) {
	//	this.facilityMetadata = facilityMetadata;
	//}

	//public FacilityMetadata addFacilityMetadata(FacilityMetadata facilityMetadata) {
	//	getFacilityMetadata().add(facilityMetadata);
	//	facilityMetadata.setFacility(this);

	//	return facilityMetadata;
	//}

	//public FacilityMetadata removeFacilityMetadata(FacilityMetadata facilityMetadata) {
	//	getFacilityMetadata().remove(facilityMetadata);
	//	facilityMetadata.setFacility(null);

	//	return facilityMetadata;

}