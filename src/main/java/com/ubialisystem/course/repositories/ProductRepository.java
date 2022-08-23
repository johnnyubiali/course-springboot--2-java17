package com.ubialisystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubialisystem.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
