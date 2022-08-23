package com.ubialisystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubialisystem.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
