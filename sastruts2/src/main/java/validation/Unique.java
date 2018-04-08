package validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Validator;

/**
 * クラスの説明：一意チェック用アノテーション
 * @author kamagata
 * @since 2018/04/02
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Validator("unique")
public @interface Unique {

	String tableNm() default "";

	String columnNm() default "";

	Msg msg() default @Msg(key = "errors.unique");

	//	Arg arg0() default @Arg(key = "");
	//
	//	Arg arg1() default @Arg(key = "${var:baisu}", resource = false);

	String target() default "";

}
