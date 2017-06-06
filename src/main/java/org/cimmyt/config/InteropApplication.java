package org.cimmyt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Main entry point for the application. It supports deployment as executable jar as well as WAR file
 * @author JAROJAS
 *
 */
@SpringBootApplication(scanBasePackages = { "org.cimmyt" })
@EnableJpaRepositories({ "org.cimmyt.repository" })
@EntityScan({ "org.cimmyt.model" })
public class InteropApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InteropApplication.class, args);
	}

	@Bean
	public WebMvcConfigurerAdapter webConfigurer(){
		return new WebMvcConfigurerAdapter() {
			
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				super.addInterceptors(registry);
				registry.addInterceptor(new EndpointHandler())
					.addPathPatterns("/**");
					
			}
		};
		
		
	}
}
