package com.example.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.example.course.entities.pk.OrdemItemPK;

public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private OrdemItemPK id;
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
		id.setOrder(order);
		id.setProduct(product);
	}
	
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}


	public Double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
}
