package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Customer;

/**
 * @author kamagata
 *
 */
@Repository
@Transactional
public class CustomerRepository {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	private static final RowMapper<Customer> customerRowmapper = (rs, i) -> {
		Integer id = rs.getInt("id");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		return new Customer(id, firstName, lastName);
	};

	/**
	 * @return カスタマー情報全件
	 */
	public List<Customer> findAll() {
		List<Customer> customers = jdbcTemplate.query(
				"SELECT id, first_name, last_name from customers order by id", customerRowmapper);
		return customers;
	}

	/**
	 * @param customerId カスタマーID
	 * @return カスタマー情報
	 */
	public Customer findOne(Integer customerId) {
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", customerId);

		return jdbcTemplate.queryForObject(
				"SELECT id, first_name, last_name from customers where id = :id order by id", param, customerRowmapper);
	}

	/**
	 * @param customer カスタマー情報
	 * @return カスタマー情報
	 */
	public Customer save(Customer customer) {

		SqlParameterSource param = new BeanPropertySqlParameterSource(customer);

		if (customer.getId() == null) {
			jdbcTemplate.update("INSERT INTO CUSTOMERS VALUES (SEQ_CUSTOMERS.NEXTVAL, :firstName, :lastName)", param);
		} else {
			jdbcTemplate.update("UPDATE CUSTOMERS SET FIRST_NAME = :firstName, LAST_NAME = :lastName WHERE ID = :id", param);
		}

		return customer;
	}

	/**
	 * @param customerId カスタマーID
	 */
	public void delete(Integer customerId) {

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", customerId);

		jdbcTemplate.update("DELETE FROMO CUSTOMERS WHERE ID = :id", param);
	}

}
