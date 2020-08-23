package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @GetMapping
    public List<User> userList() {
        return userService.userList();
    }

    @PostMapping
    public boolean saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping
    public boolean updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUserById(@PathVariable Long id) {
        return userService.deleteUserById(id);
    }

    @GetMapping("/{page}/{size}")
    public PageInfo<User> pageUser(@PathVariable int page, @PathVariable int size) {
        return userService.pageUser(page, size);
    }

}
