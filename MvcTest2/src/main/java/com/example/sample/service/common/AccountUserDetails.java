package com.example.sample.service.common;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.example.sample.domain.entity.common.UserInfoEntity;

import lombok.Getter;

/**
 * クラスの説明：UserDetails(Spring Security)の実装クラス
 * @author kamagata
 * @since 2018/02/25
 */
@Getter
public class AccountUserDetails extends User {

	private final UserInfoEntity userInfoEntity;

	/**
	 * コンストラクタの説明：AccountUserDetailsコンストラクタ
	 * @author kamagata
	 * @param userInfoEntity ユーザー情報エンティティ
	 * @param authorities 権限
	 * @since 2018/02/25
	 */
	public AccountUserDetails(UserInfoEntity userInfoEntity, Collection<GrantedAuthority> authorities) {
		// Userクラスのコンストラクタ
		super(userInfoEntity.getLastNm() + userInfoEntity.getLastNm(), userInfoEntity.getPassword(), authorities);

		this.userInfoEntity = userInfoEntity;
	}

}
