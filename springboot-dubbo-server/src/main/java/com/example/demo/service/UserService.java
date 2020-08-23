package com.example.demo.service;

import com.example.demo.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
public interface UserService {
    /**
     * 根据输入用户id返回对应用户
     * @param id
     * @return user
     */
    User findUserById(Long id);

    List<User> userList();

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUserById(Long id);

    PageInfo<User> pageUser(int page, int size);
}
