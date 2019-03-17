package com.monkey1024.myexception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �Զ����쳣������
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

    /**
     * ֻҪ�ڳ��������쳣�׳�����ô�ͻ�ִ�и÷���
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);

        //����Ĭ���쳣�������
        mv.setViewName("error/error");

        //�ж�ex�����Ƿ���MyException��ʵ��
        if(ex instanceof MyException){
            //��¼��־

            //������תҳ��
            mv.setViewName("error/myerror");
        }else if(ex instanceof NullPointerException){
            //��¼��־
            //.....
            //.....
        }


        return mv;
    }
}
