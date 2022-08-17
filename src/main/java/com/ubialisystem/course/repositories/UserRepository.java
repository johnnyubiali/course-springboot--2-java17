package com.ubialisystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubialisystem.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
