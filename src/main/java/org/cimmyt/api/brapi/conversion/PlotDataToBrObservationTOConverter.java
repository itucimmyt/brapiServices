package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrObservationTO;
import org.cimmyt.model.PlotData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class PlotDataToBrObservationTOConverter implements Converter<PlotData, BrObservationTO>{

	@Override
	public BrObservationTO convert(PlotData source) {
		BrObservationTO target = new BrObservationTO();
		
		target.setCollector(null);
		target.setObservationDbId(source.getId());
		target.setObservationTimeStamp(source.getModificationTimestamp().toString());
		target.setObservationVariableId(source.getVariable().getId());
		target.setObservationVariableName(source.getVariable().getName());
		target.setValue(source.getValue());
		return target;
	}

}
