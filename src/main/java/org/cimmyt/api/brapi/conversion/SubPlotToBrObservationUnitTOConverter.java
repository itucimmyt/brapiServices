package org.cimmyt.api.brapi.conversion;

import java.util.Optional;
import java.util.stream.Collectors;

import org.cimmyt.api.brapi.to.BrObservationUnitTO;
import org.cimmyt.model.Entry;
import org.cimmyt.model.Plot;
import org.cimmyt.model.Product;
import org.cimmyt.model.Subplot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class SubPlotToBrObservationUnitTOConverter implements Converter<Subplot, BrObservationUnitTO>{

	SubPlotDataToBrObservationTOConverter subplotDataConverter;
	
	@Autowired
	public SubPlotToBrObservationUnitTOConverter(SubPlotDataToBrObservationTOConverter subplotDataConverter) {
		super();
		this.subplotDataConverter = subplotDataConverter;
	}

	@Override
	public BrObservationUnitTO convert(Subplot source) {
		Optional<Subplot> optSubplot = Optional.ofNullable(source);
		BrObservationUnitTO target = new BrObservationUnitTO();
		
		target.setBlockNumber(null);
		target.setEntryNumber(optSubplot.map(Subplot::getEntry)
				.map(Entry::getEntno).orElse(null));
		target.setEntryType(null);
		target.setGermplasmDbId(optSubplot.map(Subplot::getEntry)
				.map(Entry::getProductGid).orElse(null));
		target.setGermplasmName(optSubplot.map(Subplot::getEntry).map(Entry::getProduct)
				.map(Product::getDesignation).orElse(null));
		target.setObservationUnitDbId(source.getId());
		target.setObservationUnitName(optSubplot.map(Subplot::getPlot)
				.map(Plot::getCode).orElse(null));
		target.setPedigree(optSubplot.map(Subplot::getEntry).map(Entry::getProduct)
				.map(Product::getDerivativeName).orElse(null));
		target.setPlantNumber(null);
		target.setPlotNumber(optSubplot.map(Subplot::getPlot)
				.map(Plot::getPlotno).orElse(null));
		target.setReplicate(optSubplot.map(Subplot::getPlot)
				.map(Plot::getRep).orElse(null));
		target.setX(null);
		target.setY(null);
		
		target.setObservations(source.getSubplotData().stream()
				.map(spData -> subplotDataConverter.convert(spData))
				.collect(Collectors.toList()));
		
		return target;
	}

}
