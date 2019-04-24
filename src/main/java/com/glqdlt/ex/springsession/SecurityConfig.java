package com.glqdlt.ex.springsession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Jhun
 * @see <a href='https://docs.spring.io/spring-security/site/docs/current/guides/html5/form-javaconfig.html'>https://docs.spring.io/spring-security/site/docs/current/guides/html5/form-javaconfig.html</a>
 * @see <a href='https://docs.spring.io/spring-session/docs/current/reference/html5/#introduction'>https://docs.spring.io/spring-session/docs/current/reference/html5/#introduction</a>
 * https://docs.spring.io/spring-security/site/docs/3.1.x/reference/springsecurity-single.html
 * 2019-04-24
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public SessionListener sessionListener(){
        return new SessionListener();
    }

}
