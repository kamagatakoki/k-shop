package com.example.demo.domain.repository.maintenance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.maintenance.GoodsImageEntity;

/**
 * クラスの説明：商品画像マスタリポジトリ
 * @author kamagata
 * @since 2018/01/16
 */
@Repository
public interface GoodsImageRepository
		extends JpaRepository<GoodsImageEntity, Integer>, JpaSpecificationExecutor<GoodsImageEntity> {

	/**
	 * メソッドの説明：商品コード検索
	 * @author kamagata
	 * @since 2018/01/23
	 * @param goodsCd 商品コード
	 * @return List<GoodsImageEntity> 商品画像エンティティのリスト
	 */
	public List<GoodsImageEntity> findByGoodsEntityGoodsCd(String goodsCd);
}
