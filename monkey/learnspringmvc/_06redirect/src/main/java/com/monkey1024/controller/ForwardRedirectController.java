package com.monkey1024.controller;

import com.monkey1024.bean.School;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * spring mvc�е�ת�����ض���
 */
@Controller
public class ForwardRedirectController {

    /**
     * ����ModelAndView�����ת��
     * @return
     * @throws Exception
     */
    @RequestMapping("/forwardMAV.do")
    public ModelAndView forwardMAV() throws Exception{

        ModelAndView mv = new ModelAndView();
        mv.addObject("type", "����ModelAndView�����ת��");
        //Ĭ��ʹ��ת����������ת
        //mv.setViewName("/result");
        //�ֶ���ʾ��ָ��ʹ��ת������ʱ��ͼ��������ʧЧ
        //mv.setViewName("forward:/jsp/result.jsp");
        //���Ҫ��ת������controller�У���ʱ��Ҫ��ʾд��forward
        mv.setViewName("forward:other.do");
        return mv;
    }

    /**
     * ����ModelAndView������ض���
     * @return
     * @throws Exception
     */
    @RequestMapping("/redirectMAV.do")
    public ModelAndView redirectMAV() throws  Exception{
        ModelAndView mv = new ModelAndView();

        //����ֻ�ܴ��ݻ����������ͺ�String����
        mv.addObject("type", "����ModelAndView������ض���");

        mv.addObject("schoolName", "�廪");
        mv.addObject("address", "����");


        //�ض���
        //mv.setViewName("redirect:/jsp/result.jsp");
        mv.setViewName("redirect:other.do");
        return mv;
    }


    /**
     * ����String���͵�ת��
     * @param school
     * @return
     * @throws Exception
     */
    @RequestMapping("/forwardStr.do")
    //�����еĲ����ᱻ�Զ��ķŵ�request����
    public String forwardStr(School school) throws Exception{


        //return "result";
        //��ʾ��ָ��ʹ��ת��
        return "forward:/jsp/result.jsp";
    }

    /**
     * ����String���͵��ض���
     * @param model
     * @param school
     * @return
     * @throws Exception
     */
    @RequestMapping("/redirectStr.do")
    public String redirectStr(Model model,School school) throws Exception{

        //���ݻᱻ�ŵ�url��ַ���У����ֻ�ܴ��ݻ����������ͺ�String����
        model.addAttribute("schoolName", school.getSchoolName());
        model.addAttribute("address", school.getAddress());

        return "redirect:/jsp/result.jsp";
    }
}
