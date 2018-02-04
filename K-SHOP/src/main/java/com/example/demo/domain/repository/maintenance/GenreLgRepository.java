package com.example.demo.domain.repository.maintenance;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;

/**
 * クラスの説明：大ジャンルテーブルリポジトリ
 * @author kamagata
 * @since 2018/01/06
 */
public interface GenreLgRepository extends JpaRepository<GenreLgEntity, String>, JpaSpecificationExecutor<GenreLgEntity> {

	/** オーバーライドの説明：全件取得
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll(org.springframework.data.domain.Sort)
	 * @author kamagata
	 * @since 2018/02/04
	 * @param sort ソート
	 * @return List<GenreLgEntity> 大ジャンルエンティティのリスト
	 */
	@Override
	@Query("SELECT DISTINCT l FROM GenreLgEntity l JOIN FETCH l.genreMdEntities")
	public List<GenreLgEntity> findAll(Sort sort);
}
