package com.example.demo.domain.validator;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * クラスの説明：一意チェックバリデーター
 * @author kamagata
 * @since 2018/01/13
 */
public class UniqueIDValidatorForUpdate implements ConstraintValidator<UniqueForUpdate, Serializable> {

	private EntityManager entityManager;
	private Class<?> entityClass; // エンティティクラス
	private String uniqueField; // 一意チェックカラム

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/01/13
	 * @param entityManager エンティティマネージャー
	 */
	@PersistenceContext
	public void setEngityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/** オーバーライドの説明：一意チェックバリデーター初期処理
	 * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
	 * @author kamagata
	 * @since 2018/01/12
	 * @param unique a
	 */
	@Override
	public void initialize(UniqueForUpdate unique) {
		entityClass = unique.entity();
		uniqueField = unique.property();
	}

	/** オーバーライドの説明：一意チェック処理
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
	 * @author kamagata
	 * @since 2018/01/12
	 * @param property a
	 * @param cvContext a
	 * @return a
	 */
	@Override
	public boolean isValid(Serializable property, ConstraintValidatorContext cvContext) {

		String query = String.format("FROM %s e WHERE e.%s = :value AND e.%s <> :value ", entityClass.getName(), uniqueField);
		List<?> count = entityManager.createQuery(query).setParameter("value", property).getResultList();

		return count.size() == 0;
	}

}