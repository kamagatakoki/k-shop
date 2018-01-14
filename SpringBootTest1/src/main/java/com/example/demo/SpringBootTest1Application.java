package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.example.demo.domain.Customer;

/**
 * @author kamagata
 *
 */
@SpringBootApplication
public class SpringBootTest1Application implements CommandLineRunner {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@SuppressWarnings("javadoc")
	@Override
	public void run(String... args) throws Exception {
		String sql = "Select id, first_name, last_name from customers where id = :id";

		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("id", 1);

		Customer result = jdbcTemplate.queryForObject(sql, param,
				(rs, rowNum) -> new Customer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name")));

		System.out.println(result);

	}

	/**
	 * @param args デフォルト
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest1Application.class, args);
	}
}
