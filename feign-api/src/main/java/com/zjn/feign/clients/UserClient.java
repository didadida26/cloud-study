package com.zjn.feign.clients;

import com.zjn.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zjn
 * @date 2022/10/17 下午12:48
 * feign client 远程调用接口
 */
@FeignClient("userservice")
public interface UserClient {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
