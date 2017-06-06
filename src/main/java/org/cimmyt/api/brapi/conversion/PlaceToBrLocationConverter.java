package org.cimmyt.api.brapi.conversion;

import java.util.Optional;

import org.cimmyt.api.brapi.to.BrLocationTO;
import org.cimmyt.api.conversion.ApiConversion;
import org.cimmyt.model.Country;
import org.cimmyt.model.Geolocation;
import org.cimmyt.model.Place;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Converts {@link Place} to BrAPI-specific TO
 * @author RHTOLEDO
 * @author jarojas
 * @version 1.1
 */

@Component
@ApiConversion
public class PlaceToBrLocationConverter implements Converter<Place, BrLocationTO> {

	@Override
	public BrLocationTO convert(Place source) {

        BrLocationTO target = new BrLocationTO();
        
        target.setLocationDbId(source.getId());
        target.setLocationType(source.getPlaceType());
        target.setName(source.getDisplayName());
        target.setAbbreviation(source.getAbbrev());
        
        Optional<Geolocation> georef = Optional.ofNullable(source.getGeolocation());
        
        target.setLatitude(georef.map(Geolocation::getLatitude).orElse(null));
        target.setLongitude(georef.map(Geolocation::getLongitude).orElse(null));
        target.setAltitude(georef.map(Geolocation::getElevation).orElse(null));        
    	target.setCountryCode(georef.map(Geolocation::getCountry)
    			.map(Country::getIsoCode).orElse(null));
    	target.setCountryName(georef.map(Geolocation::getCountry)
    			.map(Country::getName).orElse(null));
    	
		return target;
	}

}
