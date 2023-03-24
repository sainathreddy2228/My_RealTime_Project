package com.myexpenditure.MyExpenditure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myexpenditure.MyExpenditure.entity.User;
import com.myexpenditure.MyExpenditure.repository.UserRepository;

@Service
//This annotation will consider as service layer for achieving transaction mgmt and all other external frameworks
//like rabitmq,kafka,JMS etc...instantiation
public class UserService {
	@Autowired
	private UserRepository userRepository; // IOC ==> UserRepository userRepository=ioc.getUserRepository();

//Retrieve All Users

	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
		// findAll ==> select * from tbl_user ==> Resultset ==> Iterable<user>
	}

	// Retrieving Single Ticket

	public User findUser(Long userId) {
		return userRepository.findById(userId).orElse(new User());

	}
	
	//Updating the Data
	public User UpdateUser(Long userId, String email, String firstName) {
		User dbUserObj=findUser(userId);
		dbUserObj.setEmail(email);
		dbUserObj.setFirstName(firstName);
		return userRepository.save(dbUserObj);
	}
		
		//Inserting the Data
		
	public User createUser(User userObj) {
		return userRepository.save(userObj);
		
	
	}
	
	public void deleteUser(Long userId) {
		 userRepository.deleteById(userId);
	}
}
