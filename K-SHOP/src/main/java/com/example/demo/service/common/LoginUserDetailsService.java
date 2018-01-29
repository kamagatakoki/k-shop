package com.example.demo.service.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.maintenance.UserInfoEntity;
import com.example.demo.domain.repository.maintenance.UserInfoRepository;

/**
 * クラスの説明：ログインユーザー
 * @author kamagata
 * @since 2018/01/29
 */
@Service
public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	UserInfoRepository userInfoRepository;

	/** オーバーライドの説明：メールアドレスからユーザー情報を取得しログイン情報を返す
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 * @author kamagata
	 * @since 2018/01/29
	 * @param email メールアドレス
	 * @return UserDetails ユーザー情報
	 * @throws UsernameNotFoundException メールアドレス不一致例外
	 */
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		UserInfoEntity userInfoEntity = userInfoRepository.findByEmail(email);

		if (userInfoEntity == null) {
			throw new UsernameNotFoundException("メールアドレスが間違っています。");
		}

		return new LoginUserDetails(userInfoEntity);
	}
}
