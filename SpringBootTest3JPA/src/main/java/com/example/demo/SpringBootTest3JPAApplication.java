package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

/**
 * @author kamagata
 *
 */
@SpringBootApplication
public class SpringBootTest3JPAApplication implements CommandLineRunner {
	@Autowired
	CustomerRepository customerRepository;

	@SuppressWarnings("javadoc")
	@Override
	public void run(String... args) throws Exception {

		// データ追加
		customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
		System.out.println("INSERT完了");

		// データ表示
		//		customerRepository.findAllOrderByName().forEach(System.out::println);

		// ページング処理
		Pageable pageable = new PageRequest(1, 3);
		Page<Customer> page = customerRepository.findAll(pageable);
		//		          customerRepository.findAll().forEach(System.out::println);

		System.out.println("1ページのデータ数：" + page.getSize());
		System.out.println("現在のページ：" + page.getNumber());
		System.out.println("全ページ数：" + page.getTotalPages());
		System.out.println("全ﾃﾞｰﾀ数：" + page.getTotalElements());
		page.getContent().forEach(System.out::println);

	}

	/**
	 * @param args なし
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest3JPAApplication.class, args);
	}
}
