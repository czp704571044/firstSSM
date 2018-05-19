package com.ssm.Service;



import java.util.List;

import com.ssm.Po.User;

public interface UserService {
  public void save(User user);
	   
  public  boolean update(User user);
	   
  public  boolean delete(int id);
	   
  public  User findUserById(int id);
	   
  public   List<User>findAll();
  
  public User login(String username,String password);
}
