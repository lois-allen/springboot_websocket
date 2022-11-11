package com.example.springboot_websocket.controller;

import com.example.springboot_websocket.bean.User;
import com.example.springboot_websocket.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/{page}")
    public String getPage(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/user/register")
    public String register(User user) {
        userService.insert(user);
        return "index";
    }

    @RequestMapping("/user/login")
    public void login(HttpServletResponse response, HttpSession session, String username, String password) throws IOException {
        User u = userService.selectByUsernameAndPassword(username,password);
        if(u==null){
            response.sendRedirect("/index");
        }
        //session.setAttribute("username",username);
        response.sendRedirect("/socket");

    }

}
