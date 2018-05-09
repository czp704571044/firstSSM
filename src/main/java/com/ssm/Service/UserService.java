package com.ssm.Service;



import com.ssm.Po.User;

public interface UserService {
   
	User login(String username,String password);
	void register(User user);
	void updateInformation(User user);
	User findUserById(int id);
	User findUserByUsername(String username);
	
	
} 
