package com.ssm.Service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.Mapper.UserMapper;
import com.ssm.Po.User;
import com.ssm.Service.UserService;

@Service
public class UserServiceImp implements UserService{
  @Autowired
  private UserMapper userMapper;

@Override
public void save(User user) {
	// TODO Auto-generated method stub
	userMapper.save(user);
}

@Override
public boolean update(User user) {
	// TODO Auto-generated method stub
	return userMapper.update(user);
}

@Override
public boolean delete(int id) {
	// TODO Auto-generated method stub
	return userMapper.delete(id);
}

@Override
public User findUserById(int id) {
	// TODO Auto-generated method stub
	User user=userMapper.findUserById(id);
	return user;
}

@Override
public List<User> findAll() {
	// TODO Auto-generated method stub
	List<User> findAllList=userMapper.findAll();
	return findAllList;
}

@Override
public User login(String username, String password) {
	// TODO Auto-generated method stub
	return userMapper.login(username,password);
}

@Override
public String findPassword(String username) {
	// TODO Auto-generated method stub
	return null;
}


	
}
