package com.example.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	@Transactional
	public Category findById(Long id) {
		return categoryRepository.findById(id).get();
	}
	
}
