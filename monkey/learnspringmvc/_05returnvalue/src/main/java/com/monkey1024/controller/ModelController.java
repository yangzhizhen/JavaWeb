package com.monkey1024.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * model�ӿڣ�����������������
 */
@Controller
public class ModelController {

    @RequestMapping("/modeldata.do")
    public String modelData(Model model,String name) throws Exception{
//        Model model = new Model();

        model.addAttribute("username",name);
        model.addAttribute(name);//������model.addAttribute("string",name);

        return "welcome";
    }
}
