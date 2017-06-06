package org.cimmyt.api.brapi.to;

import java.util.Map;

import org.cimmyt.api.ApiTO;
import org.cimmyt.model.Place;

/**
 * {@link ApiTO Transfer Object} for {@link Place} in BrAPI calls
 * @author RHTOLEDO
 * @version 1.0
 */


public class BrLocationTO implements ApiTO<Place>{
	
	private Integer locationDbId;
    private String  locationType;
    private String  name;
    private String  abbreviation;
    private String  countryCode;
    private String  countryName;
    private Double  latitude;
    private Double  longitude;
    private Double  altitude;
    private Map<String, String> additionalInfo;
    
	public Integer getLocationDbId() {
		return locationDbId;
	}
	public void setLocationDbId(Integer locationDbId) {
		this.locationDbId = locationDbId;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getAltitude() {
		return altitude;
	}
	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}
	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
    

}
