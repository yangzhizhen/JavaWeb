package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * ��ȡurl�е�����
 *
 * PathVariable
 */
@Controller
public class PathController01 {

    @RequestMapping("/{username}/{age}/path.do")
    //restful
    public ModelAndView getPath(@PathVariable("username") String name, @PathVariable int age) throws Exception{
        //�����Ĳ�������Ҫ��ǰ̨ҳ���еı������input��nameһ��
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", name);
        mv.addObject("age", age);
        mv.setViewName("result");
        return mv;
    }

}
