package com.angular_springboot_ecommerce.dao;

import com.angular_springboot_ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
