package com.example.demo.domain.repository.shop;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.shop.CartDetailEntity;

/**
 * クラスの説明：カート詳細　リポジトリ
 * @author kamagata
 * @since 2018/02/04
 */
@Repository
public interface CartDetailRepository extends JpaRepository<CartDetailEntity, Integer> {

	/**
	 * メソッドの説明：カードヘッダコードからカート詳細を検索
	 * @author kamagata
	 * @since 2018/02/04
	 * @param cartHeadCd カートヘッダコード
	 * @return List<CartDetailEntity> カート詳細エンティティのリスト
	 */
	public List<CartDetailEntity> findByCartHeadEntityCartHeadCd(Integer cartHeadCd);
}
