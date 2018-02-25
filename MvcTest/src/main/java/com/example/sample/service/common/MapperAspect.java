package com.example.sample.service.common;

import java.lang.reflect.Method;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

/**
 * クラスの説明：登録・更新時に共通カラムの値を設定
 * @author kamagata
 * @since 2018/02/24
 */
@Aspect
@Component
public class MapperAspect {

	/**
	 * メソッドの説明：共通カラムの値設定
	 * @author kamagata
	 * @since 2018/02/24
	 * @param joinpoint ジョインポイント
	 * @throws Throwable 例外スロー
	 */
	@Before("execution(* com.example.sample.domain.mapper.*.*Mapper.insert*(..)) || " +
			"execution(* com.example.sample.domain.mapper.*.*Mapper.update*(..))")
	public void setCommonEntity(JoinPoint joinpoint) throws Throwable {

		// メソッド名取得
		MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature();
		Method method = methodSignature.getMethod();
		String methodNm = method.getName();

		// Entity取得
		Object[] args = joinpoint.getArgs();
		Object entity = args[0];

		// 登録者・登録日をエンティティに設定
		if (methodNm.startsWith("insert")) {
			setValueByInsert(entity);
		}

		// 更新者・更新日をエンティティに設定
		if (methodNm.startsWith("update")) {
			setValueByUpdate(entity);
		}
	}

	/**
	 * メソッドの説明：登録者・登録日設定
	 * @author kamagata
	 * @since 2018/02/24
	 * @param entity エンティティ
	 * @throws Throwable 例外スロー
	 */
	private void setValueByInsert(Object entity) throws Throwable {

		// 登録者設定
		Method setInsertCd = ReflectionUtils.findMethod(entity.getClass(), "setInsertCd", Long.class);
		if (setInsertCd != null) {
			setInsertCd.invoke(entity, Long.parseLong("1234"));
		}

		// 登録日時設定
		Method setInsertDt = ReflectionUtils.findMethod(entity.getClass(), "setInsertDt", Date.class);
		if (setInsertDt != null) {
			setInsertDt.invoke(entity, new Date());
		}
	}

	/**
	 * メソッドの説明：更新者・更新日設定
	 * @author kamagata
	 * @since 2018/02/24
	 * @param entity エンティティ
	 * @throws Throwable 例外スロー
	 */
	private void setValueByUpdate(Object entity) throws Throwable {

		// 登録者設定
		Method setInsertCd = ReflectionUtils.findMethod(entity.getClass(), "setUpdateCd", Long.class);
		if (setInsertCd != null) {
			setInsertCd.invoke(entity, Long.parseLong("1234"));
		}

		// 登録日時設定
		Method setInsertDt = ReflectionUtils.findMethod(entity.getClass(), "setUpdateDt", Date.class);
		if (setInsertDt != null) {
			setInsertDt.invoke(entity, new Date());
		}
	}

}
