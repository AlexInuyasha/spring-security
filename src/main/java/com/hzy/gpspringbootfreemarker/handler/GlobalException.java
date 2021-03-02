//package com.hzy.gpspringbootfreemarker.handler;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * @ClassName GlobalException
// * @Aauthor zhengyang.hu
// * @Date 2021/2/19
// **/
//@ControllerAdvice
//public class GlobalException {
//
//    @ExceptionHandler(value = NullPointerException.class)
//    public ModelAndView nullPointerExceptionHandler(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("error",e.getMessage());
//        modelAndView.setViewName("error1");
//        return modelAndView;
//    }
//
//    @ExceptionHandler(value = ArithmeticException.class)
//    public ModelAndView arithmeticExceptionHandler(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("error",e.getMessage());
//        modelAndView.setViewName("error2");
//        return modelAndView;
//    }
//}
