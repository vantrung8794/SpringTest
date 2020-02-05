package com.example.demo.config;

import com.example.demo.filter.NewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class NewFilterConfig {
    @Bean
    public FilterRegistrationBean<NewFilter> registrationBean(){
        FilterRegistrationBean<NewFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new NewFilter());
        filterFilterRegistrationBean.addUrlPatterns("/customers/*");
        return  filterFilterRegistrationBean;
    }
}
