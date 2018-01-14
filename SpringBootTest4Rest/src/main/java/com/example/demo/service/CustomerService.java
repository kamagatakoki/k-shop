package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

/**
 * @author kamagata
 *
 */
@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	/**
	 * @return カスタマー情報リスト
	 */
	public List<Customer> findAll() {
		return customerRepository.findAllOrderByName();
	}

	/**
	 * @param pageable ページオブジェクト
	 * @return ページオブジェクト(カスタマー型)
	 */
	public Page<Customer> findAll(Pageable pageable) {
		return customerRepository.findAll(pageable);
	}

	/**
	 * @param id カスタマーID
	 * @return カスタマー情報
	 */
	public Customer findOne(Integer id) {
		return customerRepository.findOne(id);
	}

	/**
	 * @param customer カスタマー情報
	 * @return カスタマー情報
	 */
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	/**
	 * @param customer カスタマー情報
	 * @return カスタマー情報
	 */
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}

	/**
	 * @param id カスタマーID
	 */
	public void delete(Integer id) {
		customerRepository.delete(id);
	}

}
