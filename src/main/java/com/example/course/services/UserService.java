package com.example.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	@Transactional
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
}
