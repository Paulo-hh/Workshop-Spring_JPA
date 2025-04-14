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
	
	@Transactional
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	@Transactional
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	@Transactional
	public User update(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, obj);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setEmail(obj.getEmail());
		entity.setName(obj.getName());
		entity.setPhone(obj.getPhone());
	}
	
}
