package com.nischita.FlipBucket.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SecurityConfig {


    @Bean
    public UserDetailsService userDetailsService(){


        UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        UserDetails user1= userBuilder
                .username("vamsi")
                .password("vamsi")
                .build();

        UserDetails user2= userBuilder
                .username("nishi")
                .password("donkey")
                .build();


        UserDetails user3= userBuilder
                .username("deepthi")
                .password("manibabu")
                .build();




        return new InMemoryUserDetailsManager(user1,user2,user3);
    }

}
