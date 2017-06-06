package org.cimmyt.api.brapi.conversion;

import java.util.Optional;
import java.util.stream.Collectors;

import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.model.Entry;
import org.cimmyt.model.Plot;
import org.cimmyt.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class PlotToBrObservationUnitTOConverter implements Converter<Plot, BrObservationUnitTO>{

	PlotDataToBrObservationTOConverter plotDataConverter;
	
	@Autowired
	public PlotToBrObservationUnitTOConverter(PlotDataToBrObservationTOConverter plotDataConverter) {
		super();
		this.plotDataConverter = plotDataConverter;
	}

	@Override
	public BrObservationUnitTO convert(Plot source) {
		Optional<Plot> opPlot = Optional.ofNullable(source);
		BrObservationUnitTO target = new BrObservationUnitTO();
		
		target.setBlockNumber(null);
		target.setEntryNumber(opPlot.map(Plot::getEntry)
				.map(Entry::getEntno).orElse(null));
		target.setEntryType(null);
		target.setGermplasmDbId(opPlot.map(Plot::getEntry)
				.map(Entry::getProductGid).orElse(null));
		target.setGermplasmName(opPlot.map(Plot::getEntry).map(Entry::getProduct)
				.map(Product::getDesignation).orElse(null));
		target.setObservationUnitDbId(source.getId());
		target.setObservationUnitName(source.getCode());
		target.setPedigree(opPlot.map(Plot::getEntry).map(Entry::getProduct)
				.map(Product::getDerivativeName).orElse(null));
		target.setPlantNumber(null);
		target.setPlotNumber(source.getPlotno());
		target.setReplicate(source.getRep());
		target.setX(null);
		target.setY(null);
		
		target.setObservations(source.getPlotData().stream()
				.map(pData -> plotDataConverter.convert(pData))
				.collect(Collectors.toList()));
		
		return target;
	}

}
