package com.example.demo.domain.repository.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.shop.CartHeadEntity;

/**
 * クラスの説明：カートヘッダ　リポジトリ
 * @author kamagata
 * @since 2018/02/02
 */
@Repository
public interface CartHeadRepository extends JpaRepository<CartHeadEntity, String> {

	/**
	 * メソッドの説明：ユーザーコード存在チェック
	 * @author kamagata
	 * @since 2018/02/03
	 * @param userCd ユーザーコード
	 * @return boolean (True:存在する、False:存在しない)
	 */
	public boolean existsByUserInfoEntityUserCd(Integer userCd);
}
