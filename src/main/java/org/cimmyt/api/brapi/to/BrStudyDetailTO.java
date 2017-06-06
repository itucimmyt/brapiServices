package org.cimmyt.api.brapi.to;

/**
 * Data model for study details in BrAPI
 * @author JAROJAS
 *
 */
public class BrStudyDetailTO extends AbstractBrStudyTO{
	
	private BrLocationTO location;
	private BrContactTO[] contacts;
	
	public BrLocationTO getLocation() {
		return location;
	}
	public void setLocation(BrLocationTO location) {
		this.location = location;
	}
	public BrContactTO[] getContacts() {
		return contacts;
	}
	public void setContacts(BrContactTO[] contacts) {
		this.contacts = contacts;
	}
}
