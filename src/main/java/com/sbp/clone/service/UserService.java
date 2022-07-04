package com.sbp.clone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbp.clone.models.User;
import com.sbp.clone.repository.UserRepository;

@Service
public class UserService {

	        @Autowired
	            UserRepository userRepository;        
	
	        public User createUser(User user) {
	            return userRepository.save(user);
	        }

	        // READ
	        public List<User> getUsers() {
	            return userRepository.findAll();
	        }

	        // DELETE
	        public void deleteUser(Long id) {
	            userRepository.deleteById(id);
	        }
	        
	        //UPDATE
//	        public User updateUser(Long id, User userDetails) {
//	            User user = userRepository.findById(id).get();
//	            user.setUsername(userDetails.getUsername());
//	            user.setEmailId(userDetails.getEmailId());
//	            user.setPassword(userDetails.getPassword());
//	            
//	            return userRepository.save(user);                                
//	        }

}
