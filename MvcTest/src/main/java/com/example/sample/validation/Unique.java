package com.example.sample.validation;

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
@Constraint(validatedBy = UniqueIDValidator.class)
@Documented
public @interface Unique {

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
	 * メソッドの説明：テーブル名
	 * @author kamagata
	 * @since 2018/02/19
	 * @return テーブル名
	 */
	String tableNm();

	/**
	 * メソッドの説明：カラム名
	 * @author kamagata
	 * @since 2018/02/19
	 * @return テーブル名
	 */
	String columnNm();
}