package org.cimmyt.api;

/**
 * Declares keys for valid formats for REST endpoints. This can be used to split functionality
 * based on the type of endpoint a request comes from.
 * @author jarojas
 *
 */
public enum ApiFormat {
	/**
	 * Key for a BrAPI endpoint
	 */
	BRAPI,
	/**
	 * Key for a KDDart-DAL endpoint
	 */
	DAL;
}
