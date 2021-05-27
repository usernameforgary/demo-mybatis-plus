package org.cc.demo.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.cc.demo.mybatisplus.pojo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
}
