package org.cimmyt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the institute database table.
 * 
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Institute.findAll", query="SELECT i FROM Institute i")
public class Institute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbrev;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="institute_department")
	private String instituteDepartment;

	@Column(name="institute_type")
	private String instituteType;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	private String remarks;

	//bi-directional many-to-one association to Facility
	@OneToMany(mappedBy="institute")
	private List<Facility> facilities;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to Place
	@OneToMany(mappedBy="institute")
	private List<Place> places;

	public Institute() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAbbrev() {
		return this.abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public Timestamp getCreationTimestamp() {
		return this.creationTimestamp;
	}

	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public String getInstituteDepartment() {
		return this.instituteDepartment;
	}

	public void setInstituteDepartment(String instituteDepartment) {
		this.instituteDepartment = instituteDepartment;
	}

	public String getInstituteType() {
		return this.instituteType;
	}

	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<Facility> getFacilities() {
		return this.facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

	public Facility addFacility(Facility facility) {
		getFacilities().add(facility);
		facility.setInstitute(this);

		return facility;
	}

	public Facility removeFacility(Facility facility) {
		getFacilities().remove(facility);
		facility.setInstitute(null);

		return facility;
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

	public List<Place> getPlaces() {
		return this.places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public Place addPlace(Place place) {
		getPlaces().add(place);
		place.setInstitute(this);

		return place;
	}

	public Place removePlace(Place place) {
		getPlaces().remove(place);
		place.setInstitute(null);

		return place;
	}

}