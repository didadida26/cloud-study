package com.zjn.user.controller;

import com.zjn.user.pojo.PatternProperties;
import com.zjn.user.pojo.User;
import com.zjn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zjn
 * @date 2022/10/16 上午10:47
 * refreshscope 配置热更新
 */
@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;
    @Resource
    private PatternProperties patternProperties;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id){
        return userService.findById(id);

    }

    // 方式1 没有@RefreshScope 就不能热更新
//    @Value("${pattern.dateformat}")
    private String dateformat;

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }

    /**
     * 方式2 不用加注解
      */
    @GetMapping("now2")
    public String now2(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat()));
    }

    @GetMapping("/getProperties")
    public PatternProperties getPatternProperties(){
        return patternProperties;
    }
}
