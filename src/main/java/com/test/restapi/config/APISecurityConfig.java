package com.test.restapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
@Order(1)
public class APISecurityConfig extends WebSecurityConfigurerAdapter {

  @Value("${restapi.http.auth-token-header-name}")
  private String principalRequestHeader;

  @Value("${restapi.http.auth-token}")
  private String principalRequestValue;

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    APIKeyAuthFilter filter = new APIKeyAuthFilter(principalRequestHeader);
    filter.setAuthenticationManager(authentication -> {
      String principal = (String) authentication.getPrincipal();
      if (!principalRequestValue.equals(principal)) {
        throw new BadCredentialsException("The API key was not found or not the expected value.");
      }
      authentication.setAuthenticated(true);
      return authentication;
    });
    httpSecurity.
        antMatcher("/api/**").
        csrf().disable().
        sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).
        and().addFilter(filter).authorizeRequests().anyRequest().authenticated();
  }

}