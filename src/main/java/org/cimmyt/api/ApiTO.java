package org.cimmyt.api;

/**
 * Defines classes acting as Transfer Objects(TO). Any class modeling the request/response 
 * payload  of a REST endpoint <strong>must</strong> implement this interface. 
 * @author jarojas
 *
 * @param <T> specifies the back-end Model Entity represented by this TO
 */
public interface ApiTO<T> {

}
