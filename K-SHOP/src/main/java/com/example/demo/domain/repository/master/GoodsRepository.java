package com.example.demo.domain.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.master.GoodsEntity;

/**
 * クラスの説明：商品マスタリポジトリ
 * @author kamagata
 * @since 2018/01/16
 */
@Repository
public interface GoodsRepository
		extends JpaRepository<GoodsEntity, String>, JpaSpecificationExecutor<GoodsEntity> {
}
