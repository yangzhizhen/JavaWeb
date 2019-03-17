package com.monkey1024.test;

import com.monkey1024.bean.User;
import com.monkey1024.bean.UserExample;
import com.monkey1024.dao.UserMapper;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Test01 {

    private SqlSession sqlSession;

    private UserMapper userDao;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        userDao = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void closeSession() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectUserById(){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(13);

        List<User> users = userDao.selectByExample(userExample);
        if (users != null && users.size() >= 1){
            User user = (User) users.get(0);
            System.out.println(user.getId());
        }else{
            System.out.println("没有数据");
        }
    }
}
