package org.cc.demo.mybatisplus.sample;


import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.cc.demo.mybatisplus.mapper.UserMapper;
import org.cc.demo.mybatisplus.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatisPlus {
    @Test
    public void testUserFindAll() throws IOException {
        String config = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
//        List<User> users = userMapper.findAll();
        List<User> users = userMapper.selectList(null);

        for(User user : users)  {
            System.out.println(user.getUserName());
            System.out.println(user.getName());
        }
    }
}
