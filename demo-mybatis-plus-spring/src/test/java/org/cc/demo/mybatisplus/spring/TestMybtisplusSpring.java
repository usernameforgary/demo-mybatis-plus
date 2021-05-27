package org.cc.demo.mybatisplus.spring;

import org.cc.demo.mybatisplus.spring.mapper.UserMapper;
import org.cc.demo.mybatisplus.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@TestPropertySource(locations = "classpath:jdbc.properties")
public class TestMybtisplusSpring {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectAllUser() {
        List<User> users = userMapper.selectList(null);

        for(User user: users) {
            System.out.println(user.getUserName());
        }
    }
}
