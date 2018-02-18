package com.example.sample.validation;

import java.io.Serializable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * クラスの説明：一意チェックバリデーター
 * @author kamagata
 * @since 2018/01/12
 */
public class UniqueIDValidator implements ConstraintValidator<Unique, Serializable> {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private String tableNm; // エンティティクラス
	private String uniqueField; // 一意チェックカラム

	/** オーバーライドの説明：一意チェックバリデーター初期処理
	 * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
	 * @author kamagata
	 * @since 2018/01/12
	 * @param unique a
	 */
	@Override
	public void initialize(Unique unique) {
		tableNm = unique.tableNm();
		uniqueField = unique.columnNm();
	}

	/** オーバーライドの説明：
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
	 * @author kamagata
	 * @since 2018/01/12
	 * @param property a
	 * @param cvContext a
	 * @return a
	 */
	@Override
	public boolean isValid(Serializable property, ConstraintValidatorContext cvContext) {

		String query = String.format("SELECT COUNT(*) FROM %s e WHERE e.%s = :value ", tableNm, uniqueField);
		String count = jdbcTemplate.queryForObject(query, String.class, property);

		return count.equals("0");
	}

}