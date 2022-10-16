package com.zjn.user.controller;

import com.zjn.user.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zjn
 * @date 2022/10/16 上午11:35
 */
@SpringBootTest
class UserControllerTest {
    @Resource
    private UserController userController;

    @Test
    void findById() {
        User user1 = userController.findById(2L);
        User user2 = userController.findById(3L);
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);


    }
}