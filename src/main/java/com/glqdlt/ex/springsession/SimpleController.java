package com.glqdlt.ex.springsession;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jhun
 * 2019-04-24
 */
@Slf4j
@RestController
public class SimpleController {

    @GetMapping("/")
    public String root() {
        return "root";
    }

    @GetMapping("/auth/1")
    public String auth() {
        SecurityContext c = SecurityContextHolder.getContext();
        WebAuthenticationDetails detail = (WebAuthenticationDetails) c.getAuthentication().getDetails();
        log.info(String.format("remote ip : %s, session id : %s", detail.getRemoteAddress(), detail.getSessionId()));
        return "auth1";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }
}
