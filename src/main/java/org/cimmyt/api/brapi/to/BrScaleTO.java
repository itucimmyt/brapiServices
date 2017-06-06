package org.cimmyt.api.brapi.to;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BrAPI representation of an Ontology scale
 * @author JAROJAS
 *
 */
public class BrScaleTO extends AbstractVocabulary{

	public enum ValidValue {min, max, categories}
	
	private Integer decimalPlaces;
	private Map<ValidValue, String> validValues;

	@Override
	@JsonProperty("scaleDbId")
	public String getDbId() {
		return super.getDbId();
	}
	public Integer getDecimalPlaces() {
		return decimalPlaces;
	}
	public void setDecimalPlaces(Integer decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}
	public Map<ValidValue, String> getValidValues() {
		return validValues;
	}
	public void setValidValues(Map<ValidValue, String> validValues) {
		this.validValues = validValues;
	}
}
