package com.monkey1024.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * DCL的单例模式
 */
public class MyBatisUtil {

    //无需将构造方法私有化，因为这里面只要保证之创建一个SqlSessionFactory的对象
    //private MyBatisUtil(){}

    private static volatile SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        try {
            if (sqlSessionFactory == null) {
                //读取主配置文件
                InputStream input = Resources.getResourceAsStream("mybatis.xml");
                synchronized (MyBatisUtil.class){
                    if (sqlSessionFactory == null){
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //mybatis自动提交事务
        //return sqlSessionFactory.openSession(true);
        return sqlSessionFactory.openSession();

    }
}
