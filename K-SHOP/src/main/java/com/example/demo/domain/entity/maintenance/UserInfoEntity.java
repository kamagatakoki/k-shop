package com.example.demo.domain.entity.maintenance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

import com.example.demo.domain.entity.CommonColumnEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：ユーザーマスタエンティティ
 * @author kamagata
 * @since 2018/01/11
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_INFO")
@EntityListeners(AuditingEntityListener.class)
public class UserInfoEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：ユーザーコード
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_INFO_GEN")
	@SequenceGenerator(name = "SEQ_USER_INFO_GEN", sequenceName = "SEQ_USER_INFO", allocationSize = 1)
	private Integer userCd;

	/**
	 * フィールドの説明：名前
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@Column(nullable = false, length = 10)
	private String firstNm;

	/**
	 * フィールドの説明：苗字
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@Column(nullable = false, length = 10)
	private String lastNm;

	/**
	 * フィールドの説明：Eメールアドレス
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@Column(nullable = false, length = 50)
	@Email
	private String email;

	/**
	 * フィールドの説明：電話番号
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@Column(nullable = false, length = 13)
	private String phone;

	/**
	 * フィールドの説明：パスワード(更新は対象外)
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@Column(nullable = false, length = 255, updatable = false)
	private String password;

	/**
	 * メソッドの説明：ハッシュ化パスワード設定
	 * @author kamagata
	 * @since 2018/01/11
	 * @param inputPassword 変換前パスワード
	 */
	public void setPassword(String inputPassword) {
		// 入力したパスワードをハッシュ化する
		password = new Pbkdf2PasswordEncoder().encode(inputPassword).toString();
	}
}
