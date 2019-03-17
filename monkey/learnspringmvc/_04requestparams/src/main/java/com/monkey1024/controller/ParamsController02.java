package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * 表单参数名称和方法参数名称不一致的情况
 *
 * RequestParam
 */
@Controller
@RequestMapping("/user")
public class ParamsController02 {

    //@RequestMapping("/params02")
    public ModelAndView getParams02(@RequestParam(name = "username") String t_username, @RequestParam(name = "age") int t_age) throws Exception{
        //方法的参数名需要跟前台页面中的表单里面的input的name一致
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", t_username);
        mv.addObject("age", t_age);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/params02")
    public ModelAndView getParams03(@RequestParam(name = "username") String t_username, @RequestParam(name = "age",defaultValue = "18") int t_age, @RequestParam(required = false) String password) throws Exception{
        //方法的参数名需要跟前台页面中的表单里面的input的name一致
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", t_username);
        mv.addObject("age", t_age);
        mv.setViewName("result");
        return mv;
    }
}
