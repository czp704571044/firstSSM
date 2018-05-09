package com.ssm.Service.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.Mapper.UserMapper;
import com.ssm.Po.User;
import com.ssm.Service.UserService;

@Service("UserService")
public class UserServiceImp implements UserService {
 

	@Autowired
    private UserMapper userMapper;
    
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUsernameAndPassword(username,password);
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
		
	}

	@Override
	public void updateInformation(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}
	   @Override
		public User findUserById(int id) {
			// TODO Auto-generated method stub
			return userMapper.findUserById(id);
		}

		@Override
		public User findUserByUsername(String username) {
			// TODO Auto-generated method stub
			return userMapper.findUserByUsername(username);
		}
  
}
