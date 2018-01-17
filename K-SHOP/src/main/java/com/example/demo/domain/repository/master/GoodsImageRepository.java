package com.example.demo.domain.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.master.GoodsImageEntity;

/**
 * クラスの説明：商品画像マスタリポジトリ
 * @author kamagata
 * @since 2018/01/16
 */
@Repository
public interface GoodsImageRepository
		extends JpaRepository<GoodsImageEntity, Integer>, JpaSpecificationExecutor<GoodsImageEntity> {
}
