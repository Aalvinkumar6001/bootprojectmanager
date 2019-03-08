package com.iiht.finalbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.finalbootapp.model.User;
import com.iiht.finalbootapp.service.UserService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/create")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		if (user == null || user.getFirstName() == null || user.getLastName() == null) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		} else {

			userservice.addUser(user);
			return new ResponseEntity<Object>(user, HttpStatus.CREATED);
		}

	}

	@GetMapping("/")
	public List<User> getUsers() {
		List<User> user = userservice.getUsers();
		return user;
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Object> deleteUser(@RequestBody User user){
		userservice.deleteUser(user);
		return new ResponseEntity<Object>(user, HttpStatus.CREATED);
	}

}
