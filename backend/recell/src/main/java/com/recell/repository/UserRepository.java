package com.recell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recell.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);

}
