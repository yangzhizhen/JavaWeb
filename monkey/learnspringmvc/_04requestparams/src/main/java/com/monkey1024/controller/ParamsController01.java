package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * ��ȡ���ύ�Ĳ���
 */
@Controller
@RequestMapping("/user")
public class ParamsController01 {

    @RequestMapping("/params01")
    public ModelAndView getParams01(String username, int age, HttpServletResponse response) throws Exception{
        //�����Ĳ�������Ҫ��ǰ̨ҳ���еı������input��nameһ��
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", username);
        mv.addObject("age", age);
        mv.setViewName("result");
        return mv;
    }
}
