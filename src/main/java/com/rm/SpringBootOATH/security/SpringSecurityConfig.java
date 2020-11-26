//package com.rm.SpringBootOATH.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	// Create 2 users for demo
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                .withUser("user").password("{noop}password").roles("USER")
//                .and()
//                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
//
//    }
//
//	   @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//
//	        http
//	                //HTTP Basic authentication
//	                .httpBasic()
//	                .and()
//	                .authorizeRequests()
//	                .antMatchers(HttpMethod.GET, "/employee/**").hasRole("USER")
//	                .antMatchers(HttpMethod.POST, "/employee").hasRole("ADMIN")
//	                .antMatchers(HttpMethod.DELETE, "/employee/**").hasRole("ADMIN")
//	                .and()
//	                .csrf().disable()
//	                .formLogin().disable();
//	    }
//
//
//}
