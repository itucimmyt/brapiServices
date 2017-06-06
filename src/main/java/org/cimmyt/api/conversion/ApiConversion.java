package org.cimmyt.api.conversion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.cimmyt.api.ApiFormat;

/**
 * <p>Specifies for which endoint format a conversion applies. 
 * Defaults to <strong>ApiFormat.BRAPI</strong></p>
 * <p>This annotation specifies WHEN a {@link ApiConverter converter} is suitable to be used.</p>
 * @author JAROJAS
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ApiConversion {
	
	public ApiFormat value() default ApiFormat.BRAPI;
}
