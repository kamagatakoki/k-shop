package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.User;

/**
 * @author kamagata
 *
 */
public interface UserRepository extends JpaRepository<User, String> {

}
