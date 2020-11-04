package com.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/*
 * @Configuration
 * 
 * @EnableWebSecurity public class SpringSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Bean
 * 
 * @Override protected UserDetailsService userDetailsService() {
 * List<UserDetails> users = new ArrayList<UserDetails>();
 * users.add(User.withDefaultPasswordEncoder().username("chenna").password(
 * "chenna@123").roles("USER").build()); return new
 * InMemoryUserDetailsManager(users); }
 * 
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS,
 * "/**").permitAll().anyRequest() .authenticated().and() // .formLogin().and()
 * .httpBasic(); }
 * 
 * 
 * }
 */