package com.myexpenditure.MyExpenditure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myexpenditure.MyExpenditure.entity.User;
import com.myexpenditure.MyExpenditure.service.UserService;

@RequestMapping(value = "/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(value = "/all")
	public Iterable<User> getAllUsers() { //// http://localhost:8080/user/all
		return userService.findAllUsers();

	}

	@PostMapping(value = "/save")
	public User createUsers(@RequestBody User userObj) {
		return userService.createUser(userObj);
	}

	@GetMapping(value = "/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		return userService.findUser(userId);

	}

	@PutMapping(value = "/{userId}/{email}/{firstName}")

	public User updateUser(@PathVariable("userId") Long userId, @PathVariable("email") String email,
			@PathVariable("firstName") String firstName) {
		return userService.UpdateUser(userId, email, firstName);
	}
	
	@DeleteMapping(value="/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		 userService.deleteUser(userId);
	}
}
