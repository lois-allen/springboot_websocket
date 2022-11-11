package com.example.springboot_websocket.mapper;

import com.example.springboot_websocket.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public int insert(User user);
    public int deleteById(int id);
    public int update(User user);
    public User selectById(int id);
    public List<User> selectAll();
    public User selectByUsername(String username);
    public User selectByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

}
