package com.shopme.admin.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	UserDetailsService userDetailsService() {
		return new ShopmeUserDetailsService();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		
		return authProvider;
	}
	
	@Bean
	SecurityFilterChain configureHttp(HttpSecurity http) throws Exception {
		http.authenticationProvider(authenticationProvider());
		
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/states/list_by_country/**").hasAnyAuthority("Admin", "Salesperson")
				
				.requestMatchers("/users/**", "/settings/**", "/countries/**", "/states/**").hasAuthority("Admin")
				
				.requestMatchers("/categories/**", "/brands/**").hasAnyAuthority("Admin", "Editor")
				
				.requestMatchers("/products/new", "/products/delete/**").hasAnyAuthority("Admin", "Editor")
				
				.requestMatchers("/products/edit/**", "/products/save", "/products/check_unique")
					.hasAnyAuthority("Admin", "Editor", "Salesperson")
				
				.requestMatchers("/products", "/products/", "/products/detail/**", "/products/page/**")
					.hasAnyAuthority("Admin", "Editor", "Salesperson", "Shipper")
					
				.requestMatchers("/products/**").hasAnyAuthority("Admin", "Editor")
				
				.requestMatchers("/orders", "/orders/", "/orders/page/**", "/orders/detail/**").hasAnyAuthority("Admin", "Salesperson", "Shipper")
				
				.requestMatchers("/products/detail/**", "/customers/detail/**").hasAnyAuthority("Admin", "Editor", "Salesperson", "Assistant")
				
				.requestMatchers("/customers/**", "/orders/**", "/get_shipping_cost", "/reports/**").hasAnyAuthority("Admin", "Salesperson")
				
				.requestMatchers("/orders_shipper/update/**").hasAuthority("Shipper")
				
				.requestMatchers("/reviews/**").hasAnyAuthority("Admin", "Assistant")
				
				.anyRequest().authenticated()
			)
			.formLogin(form -> form
				.loginPage("/login")
				.usernameParameter("email")
				.permitAll())

			.logout(logout -> logout.permitAll())

			.rememberMe(rem -> rem
					.key("AbcDefgHijKlmnOpqrs_1234567890")
					.tokenValiditySeconds(7 * 24 * 60 * 60));
//			.headers(headers -> headers
//					.frameOptions(frame -> frame.sameOrigin())
//				);
		
			// Include frameOptions for H2 console or same-origin embedded frames
			http.headers(headers -> headers.frameOptions().sameOrigin());
			
			return http.build();
	}

	@Bean
	WebSecurityCustomizer configureWebSecurity() throws Exception {
		return (web) -> web.ignoring().requestMatchers("/images/**", "/js/**", "/webjars/**");
	}

}