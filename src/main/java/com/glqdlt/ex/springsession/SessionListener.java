package com.glqdlt.ex.springsession;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Jhun
 * @see <a href = 'https://stackoverflow.com/questions/36795678/how-to-enable-session-and-set-session-timeout-in-spring-security'>https://stackoverflow.com/questions/36795678/how-to-enable-session-and-set-session-timeout-in-spring-security</a>
 * 2019-04-24
 */
@Slf4j
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("session created ==> createtionTime : {}, session Id : {}", se.getSession().getCreationTime(), se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("session destroyed ==> createtionTime : {}, session Id : {}", se.getSession().getCreationTime(), se.getSession().getId());
    }
}
