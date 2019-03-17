package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理基类
 */
@Controller
public class BaseController {

    /**
     * 处理MyException异常的方法
     * 只能处理同一个类中的MyException异常
     * @param ex
     * @return
     */
    @ExceptionHandler({MyException.class,NullPointerException.class})
    public ModelAndView handleMyException(Exception ex){

        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/error/myerror");

        return mv;
    }
}
