package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * �����з���String����
 * �����ֻϣ������ִ����Ϻ���תjsp��������Դ����ʱ����ʹ��String��Ϊ�����ķ���ֵ
 */
@Controller
public class ReturnStringController {

    /**
     * ��ת���ڲ���Դ
     * @return
     * @throws Exception
     */
    @RequestMapping("/welcome.do")
    public String welcome()throws Exception{

        return "welcome";
    }


    /**
     * ��ת���ⲿ��Դ
     * @return
     * @throws Exception
     */
    @RequestMapping("/monkey1024.do")
    public String monkey1024()throws Exception{

        //�˴����ص��ַ�����Ҫ��springmvc.xml�����ļ����ⲿ��Դview�����bean��id����һ��
        return "monkey1024";
    }
}
