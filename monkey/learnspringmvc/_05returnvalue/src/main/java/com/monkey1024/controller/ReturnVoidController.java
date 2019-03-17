package com.monkey1024.controller;

import com.alibaba.fastjson.JSON;
import com.monkey1024.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * ����û�з���ֵ
 */
@Controller
public class ReturnVoidController {

    /**
     * ʹ��ԭ��servlet����
     * @param request
     * @param response
     * @param student
     * @throws Exception
     */
    @RequestMapping("/servletjump.do")
    public void servletJump(HttpServletRequest request, HttpServletResponse response, Student student)throws Exception{

        request.setAttribute("student",student);

        request.getRequestDispatcher("/jsp/welcome.jsp").forward(request,response);
    }


    @RequestMapping("/ajaxResponse.do")
    public void ajaxResponse(HttpServletRequest request, HttpServletResponse response,Student student)throws Exception{
        PrintWriter out = response.getWriter();

        String jsonString = JSON.toJSONString(student);

        out.write(jsonString);
    }

}
