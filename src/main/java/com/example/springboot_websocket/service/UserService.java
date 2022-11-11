package com.example.springboot_websocket.service;
import com.example.springboot_websocket.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public int insert(User user);
    public int deleteById(int id);
    public int update(User user);
    public User selectById(int id);
    public List<User> selectAll();

    public User selectByUsername(String username);

    public User selectByUsernameAndPassword(String username,String password);
}
