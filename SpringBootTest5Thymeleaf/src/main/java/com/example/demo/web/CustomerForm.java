package com.example.demo.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * @author kamagata
 *
 */
@Data
public class CustomerForm {
	@NotNull
	@Size(min = 1, max = 127)
	private String firstName;

	@NotNull
	@Size(min = 1, max = 127)
	private String lastName;
}
