package com.example.sample.service.common;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sample.domain.entity.common.UserInfoCriteria;
import com.example.sample.domain.entity.common.UserInfoEntity;
import com.example.sample.domain.mapper.common.UserInfoMapper;

/**
 * クラスの説明：ユーザー情報取得
 * @author kamagata
 * @since 2018/02/25
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AccountUserDetailsService implements UserDetailsService {

	@Autowired
	UserInfoMapper userInfoMapper;

	/** オーバーライドの説明：ユーザー情報取得
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 * @author kamagata
	 * @since 2018/02/25
	 * @param email メールアドレス
	 * @return UserDetails ユーザー情報
	 * @throws UsernameNotFoundException 例外
	 */
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		// メールアドレス
		UserInfoCriteria userInfoCriteria = new UserInfoCriteria();
		userInfoCriteria.createCriteria().andEmailEqualTo(email);

		// ユーザー情報取得 該当がなければ例外スロー
		UserInfoEntity userInfoEntity = Optional.ofNullable(userInfoMapper.selectByCriteria(userInfoCriteria).get(0))
				.orElseThrow(() -> new UsernameNotFoundException("ユーザー情報がみつかりません。"));

		return new AccountUserDetails(userInfoEntity, getAuthorities(userInfoEntity));
	}

	/**
	 * メソッドの説明：ユーザー権限取得
	 * @author kamagata
	 * @since 2018/02/25
	 * @param userInfoEntity ユーザー情報
	 * @return Collection<GrantedAuthority> 権限コレクション
	 */
	private Collection<GrantedAuthority> getAuthorities(UserInfoEntity userInfoEntity) {
		if (userInfoEntity.isAdmin()) {
			return AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
		} else {
			return AuthorityUtils.createAuthorityList("ROLE_USER");
		}
	}

}
