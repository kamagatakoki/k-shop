package com.example.demo.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author kamagata
 *
 */
@Data
@AllArgsConstructor
public class Customer implements Serializable {

	private Integer id;
	private String firstName;
	private String lastName;

}
