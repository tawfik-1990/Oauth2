package com.oauth2.security.springoauth2authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
@EnableResourceServer
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	

	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	
	    @Override
	public void configure(HttpSecurity http) throws Exception {
	  
	    	http
	    	    .anonymous().disable()
	    	    .authorizeRequests().antMatchers("/test/**")
	    	    .authenticated()
	    	    .and()
	    	    .exceptionHandling()
	    	    .accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}

		
	  
	  



}
