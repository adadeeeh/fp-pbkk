package com.beasiswa.portal.config;

public class PortalBeasiswaSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
	
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentification()
			.withUser(users.username("admin").password("admin").roles("ADMIN"));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/formUpdate").hasRole("ADMIN")
			.antMatchers("/delete").hasRole("ADMIN")
			.antMatchers("/form").hasRole("ADMIN")
			.antMatchers("/saveBeasiswa").hasRole("ADMIN")
			.antMatchers("/detailBeasiswa").permitAll()
			.and()
			.formLogin()
				.loginPage("/showLoginPage")
				.loginProcessingUrl("/authenticateUser")
				.permitAll()
			.and()
			.logout()
			.kogoutSuccessUrl("/")
			.permitAll();
		
	}
	
}
