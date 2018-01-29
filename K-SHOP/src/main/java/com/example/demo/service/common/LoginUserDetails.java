package com.example.demo.service.common;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.example.demo.domain.entity.maintenance.UserInfoEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：ログインユーザー
 * @author kamagata
 * @since 2018/01/29
 */
@Setter
@Getter
public class LoginUserDetails extends User {

	private final UserInfoEntity userInfoEntity;

	/**
	 * コンストラクタの説明：ログインユーザーコンストラクタ
	 * @author kamagata
	 * @since 2018/01/29
	 * @param userInfoEntity ユーザー情報エンティティ
	 */
	public LoginUserDetails(UserInfoEntity userInfoEntity) {
		super(userInfoEntity.getLastNm() + userInfoEntity.getFirstNm(), userInfoEntity.getPassword(),
				AuthorityUtils.createAuthorityList("ROLE_USER"));

		this.userInfoEntity = userInfoEntity;
	}

}
