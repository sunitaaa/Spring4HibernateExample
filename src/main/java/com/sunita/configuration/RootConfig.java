
package com.sunita.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author snam joshi
 */
@Configuration
@ComponentScan(basePackages = "com.sunita",
        excludeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        })
public class RootConfig {
    
}
