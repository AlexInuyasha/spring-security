package com.hzy.gpspringbootfreemarker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName BrowserSecurityController
 * @Aauthor zhengyang.hu
 * @Date 2021/3/3
 **/
@RestController
public class BrowserSecurityController {
    private RequestCache requestCache = new HttpSessionRequestCache();
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @GetMapping("/authentication/require")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String requireAuthentication(HttpServletRequest request, HttpServletResponse response){
        SavedRequest cacheRequest = requestCache.getRequest(request, response);
        if (cacheRequest != null){
            String redirectUrl = cacheRequest.getRedirectUrl();
            if (StringUtils.endsWithIgnoreCase(redirectUrl,".html")){
                try {
                    redirectStrategy.sendRedirect(request,response,"/login.html");
                } catch (IOException e) {
                    System.out.println("重定向失败");
                    e.printStackTrace();
                }
            }
        }
        return "访问的资源需要身份认证！";
    }

    @GetMapping("index")
    public Object index(){
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
