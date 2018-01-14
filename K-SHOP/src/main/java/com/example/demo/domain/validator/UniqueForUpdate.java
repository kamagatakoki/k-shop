package com.example.demo.domain.validator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * クラスの説明：Uniqueアノテーション定義
 * @author kamagata
 * @since 2018/01/13
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = UniqueIDValidatorForUpdate.class)
@Documented
public @interface UniqueForUpdate {

	/**
	 * メソッドの説明：エラーメッセージプロパティ定義
	 * @author kamagata
	 * @since 2018/01/13
	 * @return エラーメッセージプロパティ
	 */
	String message() default "{com.example.demo.domain.validator.constraints.uniques}";

	/**
	 * メソッドの説明：未使用
	 * @author kamagata
	 * @since 2018/01/13
	 * @return なし
	 */
	Class<?>[] groups() default {};

	/**
	 * メソッドの説明：未使用
	 * @author kamagata
	 * @since 2018/01/13
	 * @return なし
	 */
	Class<? extends Payload>[] payload() default {};

	/**
	 * The mapped hibernate/jpa entity class
	 */
	Class<?> entity();

	/**
	 * The property of the entity we want to validate for uniqueness. Default name is "id"
	 */
	String property() default "id";
}