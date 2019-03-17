package com.monkey1024.util;

public class MyTransaction {

    /**
     * 事务处理
     * @param clazz
     */
    public static void doTransaction(Class<?> clazz) {
        System.out.println("提交事务:" + clazz.getName());
    }
}
