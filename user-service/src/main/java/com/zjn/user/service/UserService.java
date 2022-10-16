package com.zjn.user.service;

import com.zjn.user.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author zjn
 * @date 2022/10/16 上午10:45
 */
@Service
public interface UserService {
    /**
     * 根据柴查询
     * @param id
     * @return
     */
    User findById(Long id);
}
