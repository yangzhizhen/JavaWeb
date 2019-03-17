package com.monkey1024.controller;

import com.monkey1024.bean.School;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * spring mvc中的转发和重定向
 */
@Controller
public class ForwardRedirectController {

    /**
     * 返回ModelAndView对象的转发
     * @return
     * @throws Exception
     */
    @RequestMapping("/forwardMAV.do")
    public ModelAndView forwardMAV() throws Exception{

        ModelAndView mv = new ModelAndView();
        mv.addObject("type", "返回ModelAndView对象的转发");
        //默认使用转发来进行跳转
        //mv.setViewName("/result");
        //手动显示的指定使用转发，此时视图解析将会失效
        //mv.setViewName("forward:/jsp/result.jsp");
        //如果要跳转到其他controller中，此时需要显示写上forward
        mv.setViewName("forward:other.do");
        return mv;
    }

    /**
     * 返回ModelAndView对象的重定向
     * @return
     * @throws Exception
     */
    @RequestMapping("/redirectMAV.do")
    public ModelAndView redirectMAV() throws  Exception{
        ModelAndView mv = new ModelAndView();

        //这里只能传递基本数据类型和String类型
        mv.addObject("type", "返回ModelAndView对象的重定向");

        mv.addObject("schoolName", "清华");
        mv.addObject("address", "北京");


        //重定向
        //mv.setViewName("redirect:/jsp/result.jsp");
        mv.setViewName("redirect:other.do");
        return mv;
    }


    /**
     * 返回String类型的转发
     * @param school
     * @return
     * @throws Exception
     */
    @RequestMapping("/forwardStr.do")
    //方法中的参数会被自动的放到request域中
    public String forwardStr(School school) throws Exception{


        //return "result";
        //显示的指定使用转发
        return "forward:/jsp/result.jsp";
    }

    /**
     * 返回String类型的重定向
     * @param model
     * @param school
     * @return
     * @throws Exception
     */
    @RequestMapping("/redirectStr.do")
    public String redirectStr(Model model,School school) throws Exception{

        //数据会被放到url地址栏中，因此只能传递基本数据类型和String类型
        model.addAttribute("schoolName", school.getSchoolName());
        model.addAttribute("address", school.getAddress());

        return "redirect:/jsp/result.jsp";
    }
}
