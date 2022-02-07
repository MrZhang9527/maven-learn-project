package com.zwhspace.springbootlearn.filter;

import com.zwhspace.springbootlearn.filter.pre.FilterPre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author admin
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterPre preFilter(){
        return new FilterPre();
    }
}
