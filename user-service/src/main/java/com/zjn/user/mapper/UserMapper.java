package com.zjn.user.mapper;

import com.zjn.user.pojo.User;

/**
 * @author zjn
 * @date 2022/10/16 上午10:36
 */
public interface UserMapper {
    /**
     * 根据id查找
     * @param id
     * @return
     */
    User findById(Long id);
}
