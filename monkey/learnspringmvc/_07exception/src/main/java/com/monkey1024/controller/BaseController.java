package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * �쳣�������
 */
@Controller
public class BaseController {

    /**
     * ����MyException�쳣�ķ���
     * ֻ�ܴ���ͬһ�����е�MyException�쳣
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
