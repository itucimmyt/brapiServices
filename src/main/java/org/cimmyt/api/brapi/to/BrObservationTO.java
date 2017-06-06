package org.cimmyt.api.brapi.to;

/**
 * 
 * @author JAROJAS
 *
 */
public class BrObservationTO {

	private Integer observationDbId;
	private Integer observationVariableId;
	private String observationVariableName;
	private String collector;
	private String observationTimeStamp;
	private String value;
	
	public Integer getObservationDbId() {
		return observationDbId;
	}
	public void setObservationDbId(Integer observationDbId) {
		this.observationDbId = observationDbId;
	}
	public Integer getObservationVariableId() {
		return observationVariableId;
	}
	public void setObservationVariableId(Integer observationVariableId) {
		this.observationVariableId = observationVariableId;
	}
	public String getObservationVariableName() {
		return observationVariableName;
	}
	public void setObservationVariableName(String observationVariableName) {
		this.observationVariableName = observationVariableName;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	public String getObservationTimeStamp() {
		return observationTimeStamp;
	}
	public void setObservationTimeStamp(String observationTimeStamp) {
		this.observationTimeStamp = observationTimeStamp;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
