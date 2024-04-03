package com.digitalgoldwallet.service.users;

import java.util.List;

import com.digitalgoldwallet.model.Users.Users;

public interface UsersService {
	
	public List<Users> GetAllUsers();
	public Users findUserByID(int userId);
	public Users findByName(String name);
	public void addUsers(Users u) ;
	
	}
