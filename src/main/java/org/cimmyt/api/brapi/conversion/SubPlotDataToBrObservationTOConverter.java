package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrObservationTO;
import org.cimmyt.model.SubplotData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class SubPlotDataToBrObservationTOConverter implements Converter<SubplotData, BrObservationTO>{

	@Override
	public BrObservationTO convert(SubplotData source) {
		BrObservationTO target = new BrObservationTO();
		
		target.setCollector(null);
		target.setObservationDbId(source.getId());
		target.setObservationTimeStamp(source.getModificationTimestamp().toString());
		target.setObservationVariableId(source.getVariableId());
		target.setObservationVariableName(null);
		target.setValue(source.getValue());
		return target;
	}

}
