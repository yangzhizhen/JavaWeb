package com.monkey1024.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.monkey1024.bean.User;
import com.monkey1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询全部用户
     * @return
     */
    @GetMapping("/users")
    public String selectUser(){
        List<User> users = userService.selectUser();

        return JSON.toJSONString(users);
    }

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    @GetMapping("/users/{id}")
    public String selectUserById(@PathVariable int id) {
        User user = userService.selectUserById(id);

        return JSON.toJSONString(user);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/users")
    public String addUser(@RequestBody User user) {

        try {
            userService.addUser(user);
            //如果成功就返回success
            return JSON.toJSONString("success");
        }catch (Exception e){
            e.printStackTrace();
            //如果失败就返回fail
            return JSON.toJSONString("fail");
        }

    }


    /**
     * 修改用户
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user) {

        try {
            user.setId(id);
            userService.updateUser(user);

            //如果成功就返回success
            return JSON.toJSONString("success");
        } catch (Exception e) {
            e.printStackTrace();
            //如果失败就返回fail
            return JSON.toJSONString("fail");
        }

    }


    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        try {
            userService.deleteUser(id);

            //如果成功就返回success
            return JSON.toJSONString("success");
        }catch (Exception e){
            e.printStackTrace();
            //如果失败就返回fail
            return JSON.toJSONString("fail");
        }


    }

}
