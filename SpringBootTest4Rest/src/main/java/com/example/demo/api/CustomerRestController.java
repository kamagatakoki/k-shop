package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

/**
 * @author kamagata
 *
 */
@RestController
@RequestMapping("api/customers")
public class CustomerRestController {
	@Autowired
	CustomerService customerservice;

	/**
	 * 顧客全件取得
	 * @return カスタマー情報リスト
	 */
	@GetMapping
	List<Customer> getCustomers() {
		return customerservice.findAll();
	}

	/**
	 * 顧客ページ分取得
	 * @param pageable ページ情報
	 * @return カスタマー情報リスト
	 */
	@GetMapping(path = "pages")
	Page<Customer> getCustomers(@PageableDefault Pageable pageable) {
		return customerservice.findAll(pageable);

	}

	/**
	 * 顧客1件取得
	 * @param id カスタマーID
	 * @return カスタマー情報
	 */
	@GetMapping(path = "{id}")
	Customer getCustomer(@PathVariable Integer id) {
		return customerservice.findOne(id);
	}

	/**
	 * 顧客1件登録
	 * @param customer カスタマー情報
	 * @return カスタマー情報
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	Customer postCustomer(@RequestBody Customer customer) {
		return customerservice.create(customer);
	}

	/**
	 * 顧客1件更新
	 * @param id カスタマーID
	 * @param customer カスタマー情報
	 * @return カスタマー情報
	 */
	@PutMapping(path = "{id}")
	Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
		customer.setId(id);
		return customerservice.update(customer);
	}

	/**
	 * 顧客1件削除
	 * @param id カスタマーID
	 */
	@DeleteMapping(path = "{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void deleteCustomer(@PathVariable Integer id) {
		customerservice.delete(id);
	}
}
