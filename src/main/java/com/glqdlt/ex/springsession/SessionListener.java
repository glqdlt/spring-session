package com.glqdlt.ex.springsession;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Jhun
 * @see <a href = 'https://stackoverflow.com/questions/36795678/how-to-enable-session-and-set-session-timeout-in-spring-security'>https://stackoverflow.com/questions/36795678/how-to-enable-session-and-set-session-timeout-in-spring-security</a>
 * @see <a href = 'http://dveamer.github.io/backend/PreventDuplicatedLogin.html'>http://dveamer.github.io/backend/PreventDuplicatedLogin.html</a>
 * @see <a href = 'https://iwan2fly.tistory.com/74'>https://iwan2fly.tistory.com/74</a>
 * @see <a href = 'https://www.mkyong.com/servlet/a-simple-httpsessionattributelistener-example/'>https://www.mkyong.com/servlet/a-simple-httpsessionattributelistener-example/</a>
 * 2019-04-24
 */
@Slf4j
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("session created ==> createtionTime : {}, session Id : {}", se.getSession().getCreationTime(), se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("session destroyed ==> createtionTime : {}, session Id : {}", se.getSession().getCreationTime(), se.getSession().getId());
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {

    }
}
