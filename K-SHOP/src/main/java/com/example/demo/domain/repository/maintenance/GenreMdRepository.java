package com.example.demo.domain.repository.maintenance;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.maintenance.GenreMdEntity;

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

	/**
	 * メソッドの説明：大ジャンルコード存在チェック
	 * @author kamagata
	 * @since 2018/01/15
	 * @param genreLgCd 大ジャンルコード
	 * @return True:存在する False:存在しない
	 */
	public boolean existsByGenreLgEntityGenreLgCd(String genreLgCd);

	/**
	 * メソッドの説明：大ジャンル中ジャンルコード存在チェック
	 * @author kamagata
	 * @since 2018/01/15
	 * @param genreLgCd 大ジャンルコード
	 * @param GenreMdCd 中ジャンルコード
	 * @return True:存在する False:存在しない
	 */
	public boolean existsByGenreLgEntityGenreLgCdAndGenreMdCd(String genreLgCd, String GenreMdCd);

}
