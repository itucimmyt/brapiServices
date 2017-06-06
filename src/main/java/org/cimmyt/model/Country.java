package org.cimmyt.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="creation_timestamp")
	private Timestamp creationTimestamp;

	@Column(name="creator_id")
	private Integer creatorId;

	@Column(name="hasc_code")
	private String hascCode;

	@Column(name="is_void")
	private Boolean isVoid;

	@Column(name="iso_code")
	private String isoCode;

	@Column(name="modification_timestamp")
	private Timestamp modificationTimestamp;

	@Column(name="modifier_id")
	private Integer modifierId;

	private String name;

	private String notes;

	@Column(name="other_name")
	private String otherName;

	private String remarks;

	@Column(name="subregion_1_type")
	private String subregion1Type;

	@Column(name="subregion_2_type")
	private String subregion2Type;

	//bi-directional many-to-one association to Geolocation
	@OneToMany(mappedBy="country")
	private List<Geolocation> geolocations;

	//bi-directional many-to-one association to Subregion1
	//@OneToMany(mappedBy="country")
	//private List<Subregion1> subregion1s;

	public Country() {
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

	public String getHascCode() {
		return this.hascCode;
	}

	public void setHascCode(String hascCode) {
		this.hascCode = hascCode;
	}

	public Boolean getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}

	public String getIsoCode() {
		return this.isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
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

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSubregion1Type() {
		return this.subregion1Type;
	}

	public void setSubregion1Type(String subregion1Type) {
		this.subregion1Type = subregion1Type;
	}

	public String getSubregion2Type() {
		return this.subregion2Type;
	}

	public void setSubregion2Type(String subregion2Type) {
		this.subregion2Type = subregion2Type;
	}

	public List<Geolocation> getGeolocations() {
		return this.geolocations;
	}

	public void setGeolocations(List<Geolocation> geolocations) {
		this.geolocations = geolocations;
	}

	public Geolocation addGeolocation(Geolocation geolocation) {
		getGeolocations().add(geolocation);
		geolocation.setCountry(this);

		return geolocation;
	}

	public Geolocation removeGeolocation(Geolocation geolocation) {
		getGeolocations().remove(geolocation);
		geolocation.setCountry(null);

		return geolocation;
	}

	//public List<Subregion1> getSubregion1s() {
	//	return this.subregion1s;
	//}

	//public void setSubregion1s(List<Subregion1> subregion1s) {
	//	this.subregion1s = subregion1s;
	//}

	//public Subregion1 addSubregion1(Subregion1 subregion1) {
	//	getSubregion1s().add(subregion1);
	//	subregion1.setCountry(this);

	//	return subregion1;
	//}

	//public Subregion1 removeSubregion1(Subregion1 subregion1) {
	//	getSubregion1s().remove(subregion1);
	//	subregion1.setCountry(null);

	//	return subregion1;
	//}

}