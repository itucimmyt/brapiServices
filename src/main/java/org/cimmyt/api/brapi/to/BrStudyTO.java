package org.cimmyt.api.brapi.to;

/**
 * Data model for study summaries in BrAPI
 * @author JAROJAS
 *
 */
public class BrStudyTO extends AbstractBrStudyTO{
	
	private int locationDbId;
	private String locationName;
	private int programDbId;
	private String programName;
	
	public int getLocationDbId() {
		return locationDbId;
	}
	public void setLocationDbId(int locationDbId) {
		this.locationDbId = locationDbId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public int getProgramDbId() {
		return programDbId;
	}
	public void setProgramDbId(int programDbId) {
		this.programDbId = programDbId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
}
