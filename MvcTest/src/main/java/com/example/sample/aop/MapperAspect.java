package com.example.sample.aop;

import java.lang.reflect.Method;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import com.example.sample.service.common.AccountUserDetails;

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
			setValue(entity, "Insert");
		}

		// 更新者・更新日をエンティティに設定
		if (methodNm.startsWith("update")) {
			setValue(entity, "Update");
		}
	}

	/**
	 * メソッドの説明：登録(更新)者・登録(更新)日時設定
	 * @author kamagata
	 * @since 2018/02/24
	 * @param entity エンティティ
	 * @param columnNm カラム名
	 * @throws Throwable 例外スロー
	 */
	private void setValue(Object entity, String columnNm) throws Throwable {

		// 登録(更新)者設定
		Method methodUserCd = ReflectionUtils.findMethod(entity.getClass(), "set" + columnNm + "Cd", Long.class);
		if (methodUserCd != null) {
			// ログイン情報からユーザーコードを取得しセット
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (authentication.getPrincipal() instanceof AccountUserDetails) {
				// ユーザーコードを取得しエンティティにセット
				AccountUserDetails accountUserDetails = AccountUserDetails.class.cast(authentication.getPrincipal());
				methodUserCd.invoke(entity, accountUserDetails.getUserInfoEntity().getUserCd());
			} else {
				// ログイン情報が取得できない場合は固定文字列をセット
				methodUserCd.invoke(entity, Long.parseLong("999999999"));
			}
		}

		// 登録(更新)日時設定
		Method methodDate = ReflectionUtils.findMethod(entity.getClass(), "set" + columnNm + "Dt", Date.class);
		if (methodDate != null) {
			methodDate.invoke(entity, new Date());
		}
	}

}
