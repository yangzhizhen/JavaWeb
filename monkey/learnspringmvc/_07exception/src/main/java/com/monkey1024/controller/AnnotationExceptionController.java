package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ʹ��ע���ע�쳣�Ĵ�����
 *
 * javaֻ֧�ֵ��̳У��̳�BaseController֮��Ͳ��ܼ̳���������
 */
public class AnnotationExceptionController extends BaseController{

    @RequestMapping("/register.do")
    public ModelAndView register(String name) throws Exception{

        ModelAndView mv = new ModelAndView();

        if ("jack".equals(name)){
            throw new MyException("�Զ����쳣");
        }

        return mv;

    }

//    /**
//     * ����MyException�쳣�ķ���
//     * ֻ�ܴ���ͬһ�����е�MyException�쳣
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
