package com.example.demo;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.example.demo.service.common.LoginUserDetails;

/**
 * クラスの説明：Spring Securityからユーザー情報を取得
 * @author kamagata
 * @since 2018/01/29
 */
public class SpringSecurityAuditorAware implements AuditorAware<Integer> {

	/** オーバーライドの説明：Spring Securityからユーザーコードを取得
	 * @see org.springframework.data.domain.AuditorAware#getCurrentAuditor()
	 * @author kamagata
	 * @since 2018/01/29
	 * @return String
	 */
	@Override
	public Integer getCurrentAuditor() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}

		// ユーザーコードを取得し返却
		return ((LoginUserDetails) authentication.getPrincipal()).getUserInfoEntity().getUserCd();
	}

}
