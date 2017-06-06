package org.cimmyt.api;

/**
 * Marks classes acting as final responses for Specific APIs. Any class modeling the response for an API
 * must implement this interface
 * @author jarojas
 *
 * @param <T> specifies the format (usually a Transfer Object) returned in the body 
 */
public interface ApiResponse<T> {

}
