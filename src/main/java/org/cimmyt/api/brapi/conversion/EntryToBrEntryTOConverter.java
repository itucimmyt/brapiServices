package org.cimmyt.api.brapi.conversion;

import java.util.ArrayList;
import java.util.Optional;

import org.cimmyt.api.brapi.to.BrEntryTO;
import org.cimmyt.model.Entry;
import org.cimmyt.model.Product;
import org.cimmyt.model.ProductName;
import org.cimmyt.model.SeedStorageLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author JAROJAS
 *
 */
@Component
public class EntryToBrEntryTOConverter implements Converter<Entry, BrEntryTO>{

	@Autowired
	public EntryToBrEntryTOConverter() {
		super();
	}

	@Override
	public BrEntryTO convert(Entry source) {
		BrEntryTO target = new BrEntryTO();
		
		target.setAccessionNumber(Optional.ofNullable(source)
				.map(Entry::getSeedStorageLog)
				.map(SeedStorageLog::getId)
				.orElse(-1).toString());
		
		target.setEntryNumber(source.getEntno());
		
		
		Integer gid = Optional.ofNullable(source.getProductGid()).orElseGet(() ->source.getProduct().getGid());
		gid = gid == null?-1:gid;
		
		target.setGermplasmDbId(source.getId());
		target.setGermplasmName(source.getProduct().getDisplayName());
		target.setGermplasmPUI(null);
		target.setPedigree(source.getProduct().getGeneration());
		target.setSeedSource(source.getProduct().getParentage());
		
		String[] synonyms = Optional.ofNullable(source)
			.map(Entry::getProduct)
			.map(Product::getProductNames)
			.orElse(new ArrayList<ProductName>())
		.stream()
		.map(prodName -> prodName.getValue())
		.toArray(String[]::new);

		target.setSynonyms(synonyms);
		
		return target;
	}

}
