package com.example.demo.service.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.entity.shop.CartDetailEntity;
import com.example.demo.domain.entity.shop.CartHeadEntity;
import com.example.demo.domain.repository.shop.CartDetailRepository;
import com.example.demo.domain.repository.shop.CartHeadRepository;

/**
 * クラスの説明：カートサービスクラス
 * @author kamagata
 * @since 2018/02/02
 */
@Service
@Transactional
public class CartService {

	@Autowired
	CartHeadRepository cartHeadRepository;

	@Autowired
	CartDetailRepository cartDetailRepository;

	/**
	 * メソッドの説明：カードヘッダ登録
	 * @author kamagata
	 * @since 2018/02/02
	 * @param cartHeadEntity カートヘッダエンティティ
	 * @return CartHeadEntity カードヘッダーエンティティ
	 */
	public CartHeadEntity updateCartHead(CartHeadEntity cartHeadEntity) {
		return cartHeadRepository.save(cartHeadEntity);
	}

	/**
	 * メソッドの説明：カート詳細登録
	 * @author kamagata
	 * @since 2018/02/04
	 * @param cartDetailEntity カート詳細エンティティ
	 * @return カート詳細エンティティ
	 */
	public CartDetailEntity updateCartDetail(CartDetailEntity cartDetailEntity) {
		return cartDetailRepository.save(cartDetailEntity);
	}

	/**
	 * メソッドの説明：カートヘッダコードからカート詳細取得
	 * @author kamagata
	 * @since 2018/02/04
	 * @param cartHeadCd カートヘッダコード
	 * @return List<CartDetailEntity> カート詳細エンティティのリスト
	 */
	public List<CartDetailEntity> findCartDetail(Integer cartHeadCd) {
		return cartDetailRepository.findByCartHeadEntityCartHeadCd(cartHeadCd);
	}

	/**
	 * メソッドの説明：カート詳細削除
	 * @author kamagata
	 * @since 2018/02/04
	 * @param cartDetailCd カート詳細コード
	 */
	public void delete(Integer cartDetailCd) {
		cartDetailRepository.delete(cartDetailCd);
	}

}
