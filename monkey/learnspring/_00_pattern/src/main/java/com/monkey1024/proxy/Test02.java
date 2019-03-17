package com.monkey1024.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test02 {

    public static void main(String[] args) {
        XiaoMan xiaoMan = new XiaoMan();
        //NaNa naNa = new NaNa(xiaoMan);

        //使用jdk的动态代理创建代理对象
        Beauty beauty = (Beauty)Proxy.newProxyInstance(xiaoMan.getClass().getClassLoader(), xiaoMan.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = null;
                if ("eat".equals(method.getName())){
                    System.out.println("打扮的帅帅的");
                    invoke = method.invoke(xiaoMan);
                    System.out.println("结果");
                } else if ("gift".equals(method.getName())) {
                    invoke = method.invoke(xiaoMan, new Object[]{(Integer)args[0]/2});
                }

                return invoke;
            }
        });


        You you = new You(beauty);

        you.makeFriend();
        you.show();
    }
}
