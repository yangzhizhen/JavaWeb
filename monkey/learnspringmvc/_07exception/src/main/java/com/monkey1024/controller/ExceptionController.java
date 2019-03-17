package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * �쳣����controller
 */
@Controller
public class ExceptionController {

    @RequestMapping("myException.do")
    public ModelAndView myException(String name) throws Exception{


        ModelAndView mv = new ModelAndView();

        if ("jack".equals(name)) {
            //��¼��־�������������Ĵ���
            throw new MyException("�ҵ��Զ����쳣");
        }

        if (!"jack".equals(name)) {
            //��¼��־�������������Ĵ���
            throw new Exception("�쳣");
        }

        return mv;
    }
}
