package com.example.demo.domain.repository.maintenance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;

/**
 * クラスの説明：大ジャンルテーブルリポジトリ
 * @author kamagata
 * @since 2018/01/06
 */
public interface GenreLgRepository extends JpaRepository<GenreLgEntity, String>, JpaSpecificationExecutor<GenreLgEntity> {

}
