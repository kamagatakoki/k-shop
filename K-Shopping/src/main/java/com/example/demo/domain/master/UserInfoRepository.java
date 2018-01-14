package com.example.demo.domain.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * クラスの説明：ユーザーマスタリポジトリー
 * @author kamagata
 * @since 2018/01/11
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer>, JpaSpecificationExecutor<UserInfoEntity> {

}
