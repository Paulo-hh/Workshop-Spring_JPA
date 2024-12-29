package com.example.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	@Transactional
	public Product findById(Long id) {
		return productRepository.findById(id).get();
	}
}
