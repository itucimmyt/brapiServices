package org.cimmyt.api.brapi.to;

import java.util.Map;

/**
 * Common fields for different BrAPI's study representations
 * @author JAROJAS
 *
 */
public abstract class AbstractBrStudyTO {
	
	private int studyDbId;
	private String studyName;
	private String studyType;
	private String[] seasons;
	private int trialDbId;
	private String trialName;
	private String startDate;
	private String endDate;
	private boolean active;
	private Map<String, String> additionalInfo;
	
	public int getStudyDbId() {
		return studyDbId;
	}
	public void setStudyDbId(int studyDbId) {
		this.studyDbId = studyDbId;
	}
	public String getStudyName() {
		return studyName;
	}
	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}
	public String getStudyType() {
		return studyType;
	}
	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}
	public String[] getSeasons() {
		return seasons;
	}
	public void setSeasons(String[] seasons) {
		this.seasons = seasons;
	}
	public int getTrialDbId() {
		return trialDbId;
	}
	public void setTrialDbId(int trialDbId) {
		this.trialDbId = trialDbId;
	}
	public String getTrialName() {
		return trialName;
	}
	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
}
