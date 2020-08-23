package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@DubboService
@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> userList() {
        return userMapper.selectAll();
    }

    @Override
    public boolean saveUser(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateByPrimaryKey(user) > 0;
    }

    @Override
    public boolean deleteUserById(Long id) {
        return userMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public PageInfo<User> pageUser(int page, int size) {
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.selectAll();
        return new PageInfo<User>(userList);
    }
}
