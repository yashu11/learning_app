//package com.yashuLearns.LearningProject.security;
//
//import com.yashuLearns.LearningProject.filters.JWTAuthenticationTokenFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.sql.DataSource;
//
//
////@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
////    @Autowired
////    DataSource dataSource;
//    @Autowired
//    UserDetailsService userDetailsService;
////    @Autowired
////    JWTAuthenticationTokenFilter jwtAuthenticationTokenFilter;
//    @Override
//    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
////        builder.inMemoryAuthentication().withUser("any").password("any").roles("ANY")
////                .and().withUser("user").password("user").roles("USER")
////                .and().withUser("admin").password("admin").roles("ADMIN");
//
// //       builder.jdbcAuthentication().dataSource(dataSource);
////                .withDefaultSchema()
////                .withUser("user").password("user").roles("USER").and()
////                .withUser("admin").password("admin").roles("ADMIN");
//
//        builder.userDetailsService(userDetailsService);
//
////        builder.ldapAuthentication()
////                .userDnPatterns("uid={0},ou=people")
////                .groupSearchBase("ou=groups")
////                .contextSource()
////                .url("ldap://localhost:8389/dc=springframework,dc=org")
////                .and()
////                .passwordCompare()
////                .passwordEncoder(new LdapShaPasswordEncoder())
////                .passwordAttribute("userPassword");
//    }
//
//    @Bean
//    public PasswordEncoder getPassword() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().fullyAuthenticated()
//                .antMatchers("/user").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/*").permitAll()
//                .and().formLogin();
//        http.csrf().disable().authorizeRequests()
//                .antMatchers("/authentiate").permitAll().anyRequest().authenticated()
//        .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//   // @Override
////    @Bean
////    public AuthenticationManager authenticationManagerBean() throws Exception {
////        return super.authenticationManagerBean();
////    }
//}
