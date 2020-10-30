package com.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);
}
