package com.example.demo.domain.repository.master;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.master.GenreSmEntity;

/**
 * クラスの説明：小ジャンルテーブルリポジトリ
 * @author kamagata
 * @since 2018/01/14
 */
@Repository
public interface GenreSmRepository extends JpaRepository<GenreSmEntity, String>, JpaSpecificationExecutor<GenreSmEntity> {

	/**
	 * メソッドの説明：中ジャンルコード検索
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreMdCd 中ジャンルコード
	 * @param sort ソート
	 * @return List<GenreMdEntity> 小ジャンルマスタエンティティのリスト
	 */
	public List<GenreSmEntity> findByGenreMdEntityGenreMdCd(String genreMdCd, Sort sort);

	/**
	 * メソッドの説明：中ジャンルコード存在チェック
	 * @author kamagata
	 * @since 2018/01/15
	 * @param genreMdCd 中ジャンルコード
	 * @return True:存在する False:存在しない
	 */
	public boolean existsByGenreMdEntityGenreMdCd(String genreMdCd);

}
