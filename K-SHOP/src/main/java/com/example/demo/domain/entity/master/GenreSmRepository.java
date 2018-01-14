package com.example.demo.domain.entity.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * クラスの説明：小ジャンルテーブルリポジトリ
 * @author kamagata
 * @since 2018/01/14
 */
@Repository
public interface GenreSmRepository extends JpaRepository<GenreSmEntity, String>, JpaSpecificationExecutor<GenreSmEntity> {
}
