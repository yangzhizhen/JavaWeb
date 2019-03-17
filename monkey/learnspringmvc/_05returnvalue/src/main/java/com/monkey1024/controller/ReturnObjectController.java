package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * ����Object����
 */
@Controller
public class ReturnObjectController {

    @RequestMapping(name = "/returnString.do",produces = "text/html;charset=utf-8")
    @ResponseBody//������ֵ��ӵ���Ӧ����
    public Object returnString()throws Exception{

        return "С����1024";
    }


    @RequestMapping("returnMap.do")
    @ResponseBody
    public Object returnMap() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "���");
        map.put("world", "����");

        return map;

    }
}
