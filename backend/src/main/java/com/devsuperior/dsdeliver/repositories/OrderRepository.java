package com.devsuperior.dsdeliver.repositories;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
