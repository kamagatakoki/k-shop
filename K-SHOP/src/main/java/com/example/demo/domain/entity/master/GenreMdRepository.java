package com.example.demo.domain.entity.master;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * クラスの説明：中ジャンルテーブルリポジトリ
 * @author kamagata
 * @since 2018/01/14
 */
@Repository
public interface GenreMdRepository extends JpaRepository<GenreMdEntity, String>, JpaSpecificationExecutor<GenreMdEntity> {

	/**
	 * メソッドの説明：大ジャンルコード検索
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreLgCd 大ジャンルコード
	 * @param sort ソート
	 * @return List<GenreMdEntity> 中ジャンルマスタエンティティのリスト
	 */
	public List<GenreMdEntity> findByGenreLgEntityGenreLgCd(String genreLgCd, Sort sort);

}
