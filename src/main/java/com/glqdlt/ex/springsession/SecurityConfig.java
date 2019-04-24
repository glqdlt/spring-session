package com.glqdlt.ex.springsession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.formLogin()
                .and()
                .antMatcher("/**")
                .authorizeRequests()
                .anyRequest()
                .authenticated()
            .and()
                .sessionManagement()
                .maximumSessions(1) // 허용 인증 session 의 최대치
                .maxSessionsPreventsLogin(true); // true : 기존 로그인 session 만 허용, false : 기존 로그인 session 은 destroyed 되고 신규 로그인 session 을 등록

    }

    @Bean
    public SessionListener sessionListener() {
        return new SessionListener();
    }

}
