package com.example.demo.domain.repository.maintenance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.maintenance.UserInfoEntity;

/**
 * クラスの説明：ユーザーマスタリポジトリー
 * @author kamagata
 * @since 2018/01/11
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer>, JpaSpecificationExecutor<UserInfoEntity> {

	/**
	 * メソッドの説明：メールアドレス検索(完全一致)
	 * @author kamagata
	 * @since 2018/01/29
	 * @param email メールアドレス
	 * @return UserInfoEntity
	 */
	public UserInfoEntity findByEmail(String email);
}
