package com.example.demo.domain.master;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * クラスの説明：ジャンルLテーブルリポジトリ
 * @author kamagata
 * @since 2018/01/06
 */
public interface GenreLgRepository extends JpaRepository<GenreLgEntity, Integer>, JpaSpecificationExecutor<GenreLgEntity> {

	/**
	 * メソッドの説明：全件取得、ソート：表示順、ジャンル大コード
	 * @author kamagata
	 * @since 2018/01/09
	 * @return GenreLgEntity ジャンル大エンティティ
	 */
	public List<GenreLgEntity> findByOrderByDisplayOrderAscGenreLgCdAsc();
}
