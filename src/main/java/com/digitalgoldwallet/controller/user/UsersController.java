package com.digitalgoldwallet.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalgoldwallet.model.Users.Users;
import com.digitalgoldwallet.service.users.UsersService;

@ComponentScan
@RestController
@RequestMapping(value="/api/v1/users")
public class UsersController {
	
	@Autowired
	UsersService Userserv;
	
	@GetMapping()
	List<Users>GetAllUsers(){
		
		System.out.println("get the users");
		List<Users> users = Userserv.GetAllUsers();
		return users;
		
	}
	
	@GetMapping(path="{user_id}")
	ResponseEntity< Users >findUserByID(@PathVariable("user_id") int user_id) {
		Users user=Userserv.findUserByID(user_id);
		//System.out.println(user);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	
	@GetMapping(path="/name/{user_name}")
	ResponseEntity< Users >findByName(@PathVariable("user_name") String user_name) {
		Users name=Userserv.findByName(user_name);
		//System.out.println(name);
		return new ResponseEntity<Users>(name,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	void addUsers(@RequestBody Users users){
		Userserv.addUsers(users);
		System.out.println("Successfully added");	
	}
	
}

	
	
	


