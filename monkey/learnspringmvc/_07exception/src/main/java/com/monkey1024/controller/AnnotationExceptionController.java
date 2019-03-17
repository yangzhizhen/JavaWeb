package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 使用注解标注异常的处理方法
 *
 * java只支持单继承，继承BaseController之后就不能继承其他类了
 */
public class AnnotationExceptionController extends BaseController{

    @RequestMapping("/register.do")
    public ModelAndView register(String name) throws Exception{

        ModelAndView mv = new ModelAndView();

        if ("jack".equals(name)){
            throw new MyException("自定义异常");
        }

        return mv;

    }

//    /**
//     * 处理MyException异常的方法
//     * 只能处理同一个类中的MyException异常
//     * @param ex
//     * @return
//     */
//    @ExceptionHandler({MyException.class,NullPointerException.class})
//    public ModelAndView handleMyException(Exception ex){
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("ex", ex);
//        mv.setViewName("/error/myerror");
//
//        return mv;
//    }
}
