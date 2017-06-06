package org.cimmyt.test.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Allows for easily getting static files holding expected results from tests..
 * @author jarojas
 *
 */
@Component
public class TestResource implements ResourceLoaderAware{

	
	private ResourceLoader resourceLoader;
	
	/**
	 * Retrieves content of a given file, with some assumptions about it:
	 * <ul>
	 * 	<li>It has extension .json</li>
	 * 	<li>Is under {testClassPath}/json (i.e. src/test/resources/json)</li>
	 *</ul>
	 * @param fileName to search
	 * @return the content of the file
	 * @throws Exception if the file cannot be opened
	 */
	public String getJsonFile(String fileName) throws Exception{
		StringBuilder sb = new StringBuilder();
		try (Scanner scan = new Scanner(
				resourceLoader.getResource("classpath:json/"+fileName+".json").getInputStream())){
			while(scan.hasNext()){
				sb.append(scan.nextLine());
			}
		} catch (IOException e) {
			
			throw e;
		}
		return sb.toString();
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	
	public static String getJSONFile(String name) throws Exception{
		return getResource(name, "json");
	}
	
	public static String getXMLFile(String name) throws Exception{
		return getResource(name, "xml");
	}
	
	private static String getResource(String name, String format) throws Exception{
		Assert.notNull(name,"name cannot be null");
		
		StringBuilder sb = new StringBuilder();
		try (InputStream s = TestResource.class.getResourceAsStream( String.format("/%1$s/%2$s.%1$s", format, name));
			Scanner scan = new Scanner(s,"UTF-8")){
			while(scan.hasNext()){
				sb.append(scan.nextLine());
			}
		} catch (IOException e) {
			throw e;
		}
		return sb.toString();
	}
}
