package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理controller
 */
@Controller
public class ExceptionController {

    @RequestMapping("myException.do")
    public ModelAndView myException(String name) throws Exception{


        ModelAndView mv = new ModelAndView();

        if ("jack".equals(name)) {
            //记录日志，或者做其他的处理
            throw new MyException("我的自定义异常");
        }

        if (!"jack".equals(name)) {
            //记录日志，或者做其他的处理
            throw new Exception("异常");
        }

        return mv;
    }
}
