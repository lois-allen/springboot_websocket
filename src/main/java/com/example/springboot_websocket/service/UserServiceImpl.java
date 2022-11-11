package com.example.springboot_websocket.service;

import com.example.springboot_websocket.bean.User;
import com.example.springboot_websocket.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username,password);
    }
}
