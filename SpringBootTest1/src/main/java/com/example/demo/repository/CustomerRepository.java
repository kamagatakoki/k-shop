package com.example.demo.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Customer;

/**
 * @author kamagata
 *
 */
@Repository
public class CustomerRepository implements Serializable {

	private final ConcurrentMap<Integer, Customer> customermap = new ConcurrentHashMap<>();

	/**
	 * @return カスタマー情報全件
	 */
	public List<Customer> findAll() {
		return new ArrayList<>(customermap.values());
	}

	/**
	 * @param customerId カスタマーID
	 * @return カスタマー情報
	 */
	public Customer findOne(Integer customerId) {
		return customermap.get(customerId);
	}

	/**
	 * @param customerId カスタマーID
	 * @param customer カスタマー情報
	 */
	public void save(Integer customerId, Customer customer) {
		customermap.put(customerId, customer);
	}

	/**
	 * @param customerId カスタマーID
	 */
	public void delete(Integer customerId) {
		customermap.remove(customerId);
	}

}
