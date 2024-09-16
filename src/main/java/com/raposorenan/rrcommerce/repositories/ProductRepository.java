package com.raposorenan.rrcommerce.repositories;

import com.raposorenan.rrcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
