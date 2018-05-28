package com.ssm.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.Po.User;
public interface UserMapper {
   void save(User user);
   
   boolean update(User user);
   
   boolean delete(int id);
   
   User findUserById(int id);
   
   List<User> findAll();

   User login(@Param("username")String username, @Param("password")String password);
   
   String findPassword(String username);
}
