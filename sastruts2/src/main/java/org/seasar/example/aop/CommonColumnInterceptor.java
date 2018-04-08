package org.seasar.example.aop;

import java.lang.reflect.Field;
import java.sql.Timestamp;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.framework.util.tiger.ReflectionUtil;

public class CommonColumnInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		String classNm = getTargetClass(invocation).getName();
		String methodNm = invocation.getMethod().getName();

		if (!classNm.endsWith("Service")) {
			invocation.proceed();
			return null;
		}

		if (!methodNm.startsWith("insert") && !methodNm.startsWith("update")) {
			invocation.proceed();
			return null;
		}

		Object args[] = invocation.getArguments();
		Object entity = args[0];

		// 削除区分
		Field deleteFlg = ReflectionUtil.getField(entity.getClass(), "deleteFlg");
		deleteFlg.set(entity, "0");

		if (methodNm.startsWith("insert")) {
			// 作成者
			Field insertCd = ReflectionUtil.getField(entity.getClass(), "insertCd");
			insertCd.set(entity, Long.parseLong("999999999"));

			// 作成日時
			Field insertDt = ReflectionUtil.getField(entity.getClass(), "insertDt");
			insertDt.set(entity, new Timestamp(System.currentTimeMillis()));
		}

		if (methodNm.startsWith("update")) {
			// 作成者
			Field insertCd = ReflectionUtil.getField(entity.getClass(), "updateCd");
			insertCd.set(entity, Long.parseLong("999999999"));

			// 作成日時
			Field insertDt = ReflectionUtil.getField(entity.getClass(), "updateDt");
			insertDt.set(entity, new Timestamp(System.currentTimeMillis()));
		}

		invocation.proceed();

		return null;
	}
}
