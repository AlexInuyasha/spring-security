package com.hzy.gpspringbootfreemarker.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName MyHandlerExceptionResolver
 * @Aauthor zhengyang.hu
 * @Date 2021/2/19
 **/
@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        if(e instanceof  NullPointerException){
            mv.setViewName("error1");
            mv.addObject("error","空指针异常");
        }else if(e instanceof  ArithmeticException){
            mv.setViewName("error2");
            mv.addObject("error","算数异常");
        }
        return mv;
    }
}
