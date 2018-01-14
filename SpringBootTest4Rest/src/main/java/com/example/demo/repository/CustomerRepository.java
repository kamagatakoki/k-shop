package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.Customer;

/**
 * @author kamagata
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	/**
	 * @return カスタマー情報
	 */
	@Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
	List<Customer> findAllOrderByName();

}
