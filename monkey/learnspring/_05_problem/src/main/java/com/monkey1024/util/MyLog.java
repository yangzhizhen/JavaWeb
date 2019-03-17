package com.monkey1024.util;

public class MyLog {

    /**
     * 记录日志
     * @param clazz
     */
    public static void doLog(Class<?> clazz){
        System.out.println("记录日志：" + clazz.getName());
    }
}
