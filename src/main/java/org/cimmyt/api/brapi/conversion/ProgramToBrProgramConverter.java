package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrProgramTO;
import org.cimmyt.model.Program;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Converts {@link Program} to BrAPI-specific TO
 * @author RHTOLEDO
 * @version 1.0
 */

@Component
public class ProgramToBrProgramConverter implements Converter<Program, BrProgramTO>{
	
	
	@Override
	public BrProgramTO convert(Program source){
		
		BrProgramTO target = new BrProgramTO();
		
		target.setProgramDbId(source.getId());
		target.setName(source.getName());
		target.setAbbreviation(source.getAbbrev());
		target.setObjective(source.getDescription());
		
		//TODO: Ask to IRRI developers if the DB supports this concept
		//      or where can we store it.
		target.setLeadPerson("");
		
		return target;
		
	}
}
