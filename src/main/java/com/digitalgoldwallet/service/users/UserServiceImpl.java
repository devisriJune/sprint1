package com.digitalgoldwallet.service.users;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digitalgoldwallet.dao.user.UserRepository;
import com.digitalgoldwallet.model.Users.Users;

@Service
public class UserServiceImpl implements UsersService{
	
	@Autowired
	UserRepository UserDao;

	@Override
	public List<Users> GetAllUsers() {
		// TODO Auto-generated method stub
		return UserDao.findAll();
	}
	
	@Override
	public Users findUserByID(int userId) {
		// TODO Auto-generated method stub
		Optional<Users> user=UserDao.findById(userId);
		return user.get();
	}
	@Override
	public Users findByName(String name) {
		// TODO Auto-generated method stub
		Optional<Users> username=UserDao.findByName(name);
		return username.get();
	
	}
	@Transactional
	@Override
	public void addUsers(Users u) {
	UserDao.saveAndFlush(u);
	        
	    
	}


	
}



	
