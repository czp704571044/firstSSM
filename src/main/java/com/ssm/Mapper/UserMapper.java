package com.ssm.Mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.Po.User;
@Repository
public interface UserMapper {
 
	User findUserByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

	void addUser(User user);

	void updateUser(User user);

	User findUserById(int id);

	User findUserByUsername(String username);

	
	
	
	
}
