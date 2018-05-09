package com.ssm.Service;

import java.util.List;

import com.ssm.Po.Administrator;
import com.ssm.Po.Item;
import com.ssm.Po.User;

public interface AdministratorService {

	 Administrator login(String username,String password);
	
    User findUsernameById(int id);
    
    List<User> findUsernameByUsername(String username);
    
    void addUser(User user);
    
    void  updateUser(User user);
    
    void deleteUser(int id);
    
    Item findItemsById(int id);
	
    List<Item> findItemsByItemsName(String ItemName);

	Administrator findAdministratorByAdministratorName();
	
	
}
