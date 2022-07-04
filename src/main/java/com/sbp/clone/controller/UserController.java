package com.sbp.clone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbp.clone.models.User;
import com.sbp.clone.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User createEmployee(@RequestBody User user) {
	    return userService.createUser(user);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> readEmployees() {
	    return userService.getUsers();
	}
	
	@RequestMapping(value="/user/{Id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable(value = "id") Long id) {
	    userService.deleteUser(id);
	}
}
