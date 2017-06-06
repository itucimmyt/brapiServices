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
 *
 */
@Entity
@Table(schema="master")
@NamedQuery(name="Geolocation.findAll", query="SELECT g FROM Geolocation g")
public class Geolocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	private Double elevation;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_void")
	private Boolean isVoid;

	private Double latitude;

	private Double longitude;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	private String notes;

	@Column(name="other_subregions")
	private String otherSubregions;

	private String remarks;

	@Column(name="subregion_3_hasc_code")
	private String subregion3HascCode;

	@Column(name="subregion_3_name")
	private String subregion3Name;

	@Column(name="subregion_3_other_names")
	private String subregion3OtherNames;

	@Column(name="subregion_3_type")
	private String subregion3Type;

	//bi-directional many-to-one association to Country
	@ManyToOne
	private Country country;

	//bi-directional many-to-one association to Subregion1
	/*@ManyToOne
	@JoinColumn(name="subregion_1_id")
	private Subregion1 subregion1;*/

	//bi-directional many-to-one association to Subregion2
	/*@ManyToOne
	@JoinColumn(name="subregion_2_id")
	private Subregion2 subregion2;*/

	//bi-directional many-to-one association to User
	/*@ManyToOne
	@JoinColumn(name="creator_id")
	private User user1;*/

	//bi-directional many-to-one association to User
	/*@ManyToOne
	@JoinColumn(name="modifier_id")
	private User user2;*/

	//bi-directional many-to-one association to GeolocationData
	/*@OneToMany(mappedBy="geolocation")
	private List<GeolocationData> geolocationData;*/

	//bi-directional many-to-one association to GeolocationMetadata
	/*@OneToMany(mappedBy="geolocation")
	private List<GeolocationMetadata> geolocationMetadata;*/

	//bi-directional many-to-one association to Place
	@OneToMany(mappedBy="geolocation")
	private List<Place> places;

	public Geolocation() {
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

	public Double getElevation() {
		return this.elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
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

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Timestamp getModificationTimestamp() {
		return this.modificationTimestamp;
	}

	public void setModificationTimestamp(Timestamp modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOtherSubregions() {
		return this.otherSubregions;
	}

	public void setOtherSubregions(String otherSubregions) {
		this.otherSubregions = otherSubregions;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSubregion3HascCode() {
		return this.subregion3HascCode;
	}

	public void setSubregion3HascCode(String subregion3HascCode) {
		this.subregion3HascCode = subregion3HascCode;
	}

	public String getSubregion3Name() {
		return this.subregion3Name;
	}

	public void setSubregion3Name(String subregion3Name) {
		this.subregion3Name = subregion3Name;
	}

	public String getSubregion3OtherNames() {
		return this.subregion3OtherNames;
	}

	public void setSubregion3OtherNames(String subregion3OtherNames) {
		this.subregion3OtherNames = subregion3OtherNames;
	}

	public String getSubregion3Type() {
		return this.subregion3Type;
	}

	public void setSubregion3Type(String subregion3Type) {
		this.subregion3Type = subregion3Type;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	/*public Subregion1 getSubregion1() {
		return this.subregion1;
	}*/

	/*public void setSubregion1(Subregion1 subregion1) {
		this.subregion1 = subregion1;
	}*/

	/*public Subregion2 getSubregion2() {
		return this.subregion2;
	}*/

	/*public void setSubregion2(Subregion2 subregion2) {
		this.subregion2 = subregion2;
	}*/

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

	/*public List<GeolocationData> getGeolocationData() {
		return this.geolocationData;
	}*/

	/*public void setGeolocationData(List<GeolocationData> geolocationData) {
		this.geolocationData = geolocationData;
	}*/

	/*public GeolocationData addGeolocationData(GeolocationData geolocationData) {
		getGeolocationData().add(geolocationData);
		geolocationData.setGeolocation(this);

		return geolocationData;
	}*/

	/*public GeolocationData removeGeolocationData(GeolocationData geolocationData) {
		getGeolocationData().remove(geolocationData);
		geolocationData.setGeolocation(null);

		return geolocationData;
	}*/

	/*public List<GeolocationMetadata> getGeolocationMetadata() {
		return this.geolocationMetadata;
	}*/

	/*public void setGeolocationMetadata(List<GeolocationMetadata> geolocationMetadata) {
		this.geolocationMetadata = geolocationMetadata;
	}*/

	/*public GeolocationMetadata addGeolocationMetadata(GeolocationMetadata geolocationMetadata) {
		getGeolocationMetadata().add(geolocationMetadata);
		geolocationMetadata.setGeolocation(this);

		return geolocationMetadata;
	}*/

	/*public GeolocationMetadata removeGeolocationMetadata(GeolocationMetadata geolocationMetadata) {
		getGeolocationMetadata().remove(geolocationMetadata);
		geolocationMetadata.setGeolocation(null);

		return geolocationMetadata;
	}*/

	public List<Place> getPlaces() {
		return this.places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public Place addPlace(Place place) {
		getPlaces().add(place);
		place.setGeolocation(this);

		return place;
	}

	public Place removePlace(Place place) {
		getPlaces().remove(place);
		place.setGeolocation(null);

		return place;
	}

}