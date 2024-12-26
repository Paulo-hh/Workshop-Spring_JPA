package com.example.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	@Transactional
	public Order findById(Long id) {
		return orderRepository.findById(id).get();
	}
}
