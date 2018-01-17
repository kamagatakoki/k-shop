package com.example.demo.service.master;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.entity.master.GoodsEntity;
import com.example.demo.domain.repository.master.GoodsRepository;
import com.example.demo.specifications.CommonSpecifications;
import com.example.demo.web.form.master.GoodsForm;

/**
 * クラスの説明：商品マスタサービス
 * @author kamagata
 * @since 2018/01/16
 */
@Service
@Transactional
public class GoodsService implements Serializable {

	@Autowired
	GoodsRepository goodsRepository;

	@Autowired
	CommonSpecifications<GoodsEntity> goodsSpecifications;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @param sort ソート
	 * @since 2018/01/16
	 * @return List<GoodsImageEntity> 商品エンティティのリスト
	 */
	public List<GoodsEntity> findAll(Sort sort) {
		return goodsRepository.findAll(sort);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/01/16
	 * @param goodsForm 商品画像マスタフォーム
	 * @param sort ソート
	 * @return List<GoodsEntity> 商品エンティティのリスト
	 */
	public List<GoodsEntity> findAllCustom(GoodsForm goodsForm, Sort sort) {
		return goodsRepository.findAll(Specifications
				.where(goodsSpecifications.conditionForStartWith("goodsCd", goodsForm.getGoodsCd()))
				.and(goodsSpecifications.conditionForLike("goodsNm", goodsForm.getGoodsNm()))
				.and(goodsSpecifications.conditionForLike("subGoodsNm", goodsForm.getSubGoodsNm()))
				.and(goodsSpecifications.conditionForStartWith("genreLgEntity", "genreLgCd", goodsForm.getGenreLgCd()))
				.and(goodsSpecifications.conditionForStartWith("genreMdEntity", "genreMdCd", goodsForm.getGenreMdCd()))
				.and(goodsSpecifications.conditionForStartWith("genreSmEntity", "genreSmCd", goodsForm.getGenreSmCd()))
				.and(goodsSpecifications.conditionForLike("overview", goodsForm.getOverview()))
				.and(goodsSpecifications.conditionForLike("detail", goodsForm.getDetail()))
				.and(goodsSpecifications.conditionForLike("maker", goodsForm.getMaker()))
				.and(goodsSpecifications.conditionForEqual("goodsSize", goodsForm.getGoodsSize())), sort);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/01/16
	 * @param goodsCd 商品コード
	 * @return GoodsEntity 商品エンティティ
	 */
	public GoodsEntity findOne(String goodsCd) {
		return goodsRepository.findOne(goodsCd);
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @param goodsEntity 商品エンティティ
	 * @since 2018/01/16
	 * @return GoodsEntity 商品エンティティ
	 */
	public GoodsEntity update(GoodsEntity goodsEntity) {
		return goodsRepository.save(goodsEntity);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/01/16
	 * @param goodsCd 商品画像コード
	 */
	public void delete(String goodsCd) {
		goodsRepository.delete(goodsCd);
	}

}
