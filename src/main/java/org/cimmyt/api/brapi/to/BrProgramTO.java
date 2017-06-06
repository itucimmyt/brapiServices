package org.cimmyt.api.brapi.to;

import org.cimmyt.api.ApiTO;
import org.cimmyt.model.Program;

/**
 * {@link ApiTO Transfer Object} for {@link Program} in BrAPI calls
 * @author RHTOLEDO
 * 
 */

public class BrProgramTO implements ApiTO<Program>{
	
	private Integer programDbId;
	private String  name;
	private String  abbreviation;
	private String  objective;
	private String  leadPerson;
	
	public Integer getProgramDbId() {
		return programDbId;
	}
	public void setProgramDbId(Integer programDbId) {
		this.programDbId = programDbId;
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
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public String getLeadPerson() {
		return leadPerson;
	}
	public void setLeadPerson(String leadPerson) {
		this.leadPerson = leadPerson;
	}
	
	
	
	

}
