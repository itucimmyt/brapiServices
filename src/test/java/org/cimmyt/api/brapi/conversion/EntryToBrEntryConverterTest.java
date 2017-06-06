package org.cimmyt.api.brapi.conversion;

import java.util.ArrayList;
import java.util.Optional;

import org.cimmyt.model.Entry;
import org.cimmyt.model.Product;
import org.cimmyt.model.ProductName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.slf4j.Logger;

@RunWith(BlockJUnit4ClassRunner.class)
public class EntryToBrEntryConverterTest {

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger("tester");

	@Test
	public void test() {
		
		Entry source = new Entry();
		source.setProduct(new Product());
		source.getProduct().setProductNames(new ArrayList<>());
		
		source.getProduct().getProductNames().add(new ProductName());
		source.getProduct().getProductNames().get(0).setValue("asdsad");
		source.getProduct().getProductNames().add(new ProductName());
		source.getProduct().getProductNames().get(1).setValue("qwewqewqe");
		source.getProduct().getProductNames().add(new ProductName());
		source.getProduct().getProductNames().get(2).setValue("zxczxczxcz");
		
		
		String[] synonyms =
		Optional.ofNullable(source)
			.map(Entry::getProduct)
			.map(Product::getProductNames)
			.orElse(new ArrayList<>())
		.stream()
			.map(prodName -> prodName.getValue())
			.toArray(String[]::new);
		
		LOG.info("size: {}",synonyms.length);
		LOG.info("content: {} {} {}",synonyms);
	}
}
