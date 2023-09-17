package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	
	  @Bean static PasswordEncoder passwordencoder() {
	  
	  return new BCryptPasswordEncoder(); }
	 

	@Bean
	SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeHttpRequests((auth) -> auth.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults());

		
		return http.build();

	}

    @Bean
    UserDetailsService userDetailsService() {

		UserDetails user = User.builder().username("suraj").password(passwordencoder().encode("suraj")).roles("USER").build();

		UserDetails admin = User.builder().username("admin").password(passwordencoder().encode("admin123")).roles("ADMIN").build();

		return new InMemoryUserDetailsManager(user, admin);

	}
}
