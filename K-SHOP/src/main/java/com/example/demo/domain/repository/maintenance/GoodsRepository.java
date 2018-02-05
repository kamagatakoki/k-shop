package com.example.demo.domain.repository.maintenance;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.maintenance.GoodsEntity;

/**
 * クラスの説明：商品マスタリポジトリ
 * @author kamagata
 * @since 2018/01/16
 */
@Repository
public interface GoodsRepository
		extends JpaRepository<GoodsEntity, String>, JpaSpecificationExecutor<GoodsEntity> {

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/01/27
	 * @param genreSmCd 小ジャンルコード
	 * @param sort ソート
	 * @return List<GoodsEntity> 商品エンティティのリスト
	 */
	public List<GoodsEntity> findByGenreSmEntityGenreSmCd(String genreSmCd, Sort sort);

	/** オーバーライドの説明：全件取得
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 * @author kamagata
	 * @since 2018/02/04
	 * @return List<GoodsEntity> 商品エンティティのリスト
	 */
	@Override
	@Query("SELECT DISTINCT g FROM GoodsEntity g "
			+ "JOIN FETCH g.goodsImageEntities "
			+ "JOIN FETCH g.genreLgEntity "
			+ "JOIN FETCH g.genreMdEntity "
			+ "JOIN FETCH g.genreSmEntity")
	public List<GoodsEntity> findAll(Sort sort);
}
