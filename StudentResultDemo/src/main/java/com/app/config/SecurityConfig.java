package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("student").password("chenna").roles("USER").and().withUser("Teacher")
				.password("Ram").roles("ADMIN");

		super.configure(auth);
	}
	/*
	 * @Bean PasswordEncoder getPassword() { return noPasswordEncoder.getInstance();
	 * }
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/*").hasRole("Admin").antMatchers("/getStudData").hasRole("User").and()
				.formLogin();
		super.configure(http);
	}

}
