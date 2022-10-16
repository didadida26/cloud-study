package com.zjn.user.service.impl;

import com.zjn.user.mapper.UserMapper;
import com.zjn.user.pojo.User;
import com.zjn.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zjn
 * @date 2022/10/16 上午10:46
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    /**
     * 根据柴查询
     *
     * @param id
     * @return
     */
    @Override
    public User findById(Long id) {
        User user = userMapper.findById(id);
        System.out.println("user = " + user);
        return user;
    }
}
