package challenge.backend.disney.web;

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
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN", "USER")
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/add_character/**", "/edit_characters/**", "/save_character/**", "/delete_characters/**",
                        "/add_movies/**", "/edit_movies/**", "/save_movies/**", "/delete_movies/**")
                .hasRole("ADMIN")
                .antMatchers("/")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/mistakes/403");

    }
}
