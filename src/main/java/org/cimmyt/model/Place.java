package org.cimmyt.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author RHTOLEDO
 * @version 1.0
 * 
 * Note: Relationship code with others tables was commented.       
 */

@Entity
@Table(schema="master")
@NamedQuery(name="Place.findAll", query="SELECT p FROM Place p")
public class Place implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbrev;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private String description;

	@Column(name="display_name")
	private String displayName;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String name;

	private String notes;

	@Column(name="place_type")
	private String placeType;

	private Double rank;

	private String remarks;

	//bi-directional many-to-one association to Facility
	//@OneToMany(mappedBy="place")
	//private List<Facility> facilities;

	//bi-directional many-to-one association to Item
	//@OneToMany(mappedBy="place")
	//private List<Item> items;

	//bi-directional many-to-one association to Geolocation
	@ManyToOne
	private Geolocation geolocation;

	//bi-directional many-to-one association to Institute
	@ManyToOne
	private Institute institute;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="creator_id")
	//private User user1;

	//bi-directional many-to-one association to User
	//@ManyToOne
	//@JoinColumn(name="modifier_id")
	//private User user2;

	//bi-directional many-to-one association to PlaceData
	//@OneToMany(mappedBy="place")
	//private List<PlaceData> placeData;

	//bi-directional many-to-one association to PlaceSeason
	//@OneToMany(mappedBy="place")
	//private List<PlaceSeason> placeSeasons;

	//bi-directional many-to-one association to ProgramPlace
	//@OneToMany(mappedBy="place")
	//private List<ProgramPlace> programPlaces;

	//bi-directional many-to-one association to Service
	//@OneToMany(mappedBy="place")
	//private List<Service> services;
	
	//bi-directional many-to-one association to Study
	@OneToMany(mappedBy="place")
	private List<Study> studies;
	
	public List<Study> getStudies(){
		return this.studies;
	}
	
	public void setStudies(List<Study> studies) {
		this.studies = studies;
	}

	public Study addStudy(Study study) {
		getStudies().add(study);
		study.setPlace(this);

		return study;
	}

	public Study removeStudy(Study study) {
		getStudies().remove(study);
		study.setPlace(null);

		return study;
	}	
	

	public Place() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getPlaceType() {
		return this.placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public Double getRank() {
		return this.rank;
	}

	public void setRank(Double rank) {
		this.rank = rank;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/*public List<Facility> getFacilities() {
		return this.facilities;
	}*/

	/*public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}*/

	/*public Facility addFacility(Facility facility) {
		getFacilities().add(facility);
		facility.setPlace(this);

		return facility;
	}*/

	/*public Facility removeFacility(Facility facility) {
		getFacilities().remove(facility);
		facility.setPlace(null);

		return facility;
	}*/

	/*public List<Item> getItems() {
		return this.items;
	}*/

	/*public void setItems(List<Item> items) {
		this.items = items;
	}*/

	/*public Item addItem(Item item) {
		getItems().add(item);
		item.setPlace(this);

		return item;
	}*/

	/*public Item removeItem(Item item) {
		getItems().remove(item);
		item.setPlace(null);

		return item;
	}*/

	public Geolocation getGeolocation() {
		return this.geolocation;
	}

	public void setGeolocation(Geolocation geolocation) {
		this.geolocation = geolocation;
	}

	public Institute getInstitute() {
		return this.institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	/*public User getUser1() {
		return this.user1;
	}*/

	/*public void setUser1(User user1) {
		this.user1 = user1;
	}*/

	/*public User getUser2() {
		return this.user2;
	}*/

	/*public void setUser2(User user2) {
		this.user2 = user2;
	}*/

	/*public List<PlaceData> getPlaceData() {
		return this.placeData;
	}*/

	/*public void setPlaceData(List<PlaceData> placeData) {
		this.placeData = placeData;
	}*/

	/*public PlaceData addPlaceData(PlaceData placeData) {
		getPlaceData().add(placeData);
		placeData.setPlace(this);

		return placeData;
	}*/

	/*public PlaceData removePlaceData(PlaceData placeData) {
		getPlaceData().remove(placeData);
		placeData.setPlace(null);

		return placeData;
	}*/

	/*public List<PlaceSeason> getPlaceSeasons() {
		return this.placeSeasons;
	}*/

	/*public void setPlaceSeasons(List<PlaceSeason> placeSeasons) {
		this.placeSeasons = placeSeasons;
	}*/

	/*public PlaceSeason addPlaceSeason(PlaceSeason placeSeason) {
		getPlaceSeasons().add(placeSeason);
		placeSeason.setPlace(this);

		return placeSeason;
	}*/

	/*public PlaceSeason removePlaceSeason(PlaceSeason placeSeason) {
		getPlaceSeasons().remove(placeSeason);
		placeSeason.setPlace(null);

		return placeSeason;
	}*/

	/*public List<ProgramPlace> getProgramPlaces() {
		return this.programPlaces;
	}*/

	/*public void setProgramPlaces(List<ProgramPlace> programPlaces) {
		this.programPlaces = programPlaces;
	}*/

	/*public ProgramPlace addProgramPlace(ProgramPlace programPlace) {
		getProgramPlaces().add(programPlace);
		programPlace.setPlace(this);

		return programPlace;
	}*/

	/*public ProgramPlace removeProgramPlace(ProgramPlace programPlace) {
		getProgramPlaces().remove(programPlace);
		programPlace.setPlace(null);

		return programPlace;
	}*/

	/*public List<Service> getServices() {
		return this.services;
	}*/

	/*public void setServices(List<Service> services) {
		this.services = services;
	}*/

	/*public Service addService(Service service) {
		getServices().add(service);
		service.setPlace(this);

		return service;
	}*/

	/*public Service removeService(Service service) {
		getServices().remove(service);
		service.setPlace(null);

		return service;
	}*/

}