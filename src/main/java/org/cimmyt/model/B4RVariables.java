package org.cimmyt.model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Here, some variables used in B4R
 * Appears in {@link StudyToDalTrialConverter}
 * @author RHTOLEDO
 * @version 1.0
 */

public class B4RVariables {
	
	private B4RVariables(){};
	
	
	public final static Integer  STUDY_REMARKS       = 571;
	public final static Integer  STUDY_TYPE          = 557;
	public final static Integer  EXPERIMENTAL_DESIGN = 104;
	public final static Integer  STUDY_NAME          = 484;
	
	public final static String   VARIABLE_TYPE_TRAIT = "observation";
	
	
	/**
	 * The studyMetadata contains additional info from studies. The structure
	 * is id,value
	 * @param studyMetadata
	 * @param Id
	 * @return
	 */
	public static String getValueFromMetadata(List<StudyMetadata> studyMetadata, Integer Id){
		

		List<StudyMetadata> studyMeta = studyMetadata.stream().filter(
				                        metadata -> metadata.getVariableId().equals(Id))
				                        .collect(Collectors.<StudyMetadata> toList());
		
		return !studyMeta.isEmpty()?studyMeta.get(0).getValue():null;
		
	}
	
	/**
	 * The active-inactive condition is stored in the field is_void
	 * in all the B4R table
	 * f -> is active 
	 * t -> is not active
	 * @param flag
	 * @return
	 */
	public static Integer isActiveFromIsVoid(Boolean flag){
		return flag==false?1:0;
	}

}
