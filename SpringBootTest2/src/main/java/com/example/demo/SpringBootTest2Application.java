package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

/**
 * @author kamagata
 *
 */
@SpringBootApplication
public class SpringBootTest2Application implements CommandLineRunner {
	@Autowired
	CustomerRepository customerRepository;

	@SuppressWarnings("javadoc")
	@Override
	public void run(String... args) throws Exception {

		// データ追加
		customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
		System.out.println("INSERT完了");

		// データ表示
		customerRepository.findAll().forEach(System.out::println);

		//		String sql = "Select id, first_name, last_name from customers where id = :id";
		//
		//		SqlParameterSource param = new MapSqlParameterSource()
		//				.addValue("id", 1);
		//
		//		Customer result = jdbcTemplate.queryForObject(sql, param,
		//				(rs, rowNum) -> new Customer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name")));
		//
		//		System.out.println(result);

	}

	/**
	 * @param args デフォルト
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest2Application.class, args);
	}
}
