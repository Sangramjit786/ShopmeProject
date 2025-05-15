package com.shopme.admin.order;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shopme.admin.paging.SearchRepository;
import com.shopme.common.entity.order.Order;

public interface OrderRepository extends SearchRepository<Order, Integer> {
	public Order save(Order order);
	
	public Optional<Order> findById(Integer id);
	
	public void deleteById(Integer id);
	
	@Query("SELECT o FROM Order o WHERE CONCAT('#', o.id) LIKE %?1% OR "
			+ " CONCAT(o.firstName, ' ', o.lastName) LIKE %?1% OR"
			+ " o.firstName LIKE %?1% OR"
			+ " o.lastName LIKE %?1% OR o.phoneNumber LIKE %?1% OR"
			+ " o.addressLine1 LIKE %?1% OR o.addressLine2 LIKE %?1% OR"
			+ " o.postalCode LIKE %?1% OR o.city LIKE %?1% OR"
			+ " o.state LIKE %?1% OR o.country LIKE %?1% OR"
			+ " CAST(o.paymentMethod AS string) LIKE %?1% OR CAST(o.status AS string) LIKE %?1% OR"
			+ " o.customer.firstName LIKE %?1% OR"
			+ " o.customer.lastName LIKE %?1%")
	public Page<Order> findAll(String keyword, Pageable pageable);
	
	public Long countById(Integer id);

	public Iterable<Order> findAll();
}
