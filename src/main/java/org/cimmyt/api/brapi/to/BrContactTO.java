package org.cimmyt.api.brapi.to;

/**
 * Data model for contacts in BrAPI
 * @author JAROJAS
 *
 */
public class BrContactTO {

	private Integer contactDbId;
	private String name;
	private String email;
	private String type;
	private String orcid;
	
	public Integer getContactDbId() {
		return contactDbId;
	}
	public void setContactDbId(Integer contactDbId) {
		this.contactDbId = contactDbId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOrcid() {
		return orcid;
	}
	public void setOrcid(String orcid) {
		this.orcid = orcid;
	}	
}
