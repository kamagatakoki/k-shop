package com.example.demo.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.entity.master.GenreMdEntity;
import com.example.demo.domain.entity.master.GenreSmEntity;
import com.example.demo.domain.entity.master.GoodsEntity;
import com.example.demo.domain.repository.master.GenreLgRepository;
import com.example.demo.domain.repository.master.GenreMdRepository;
import com.example.demo.domain.repository.master.GenreSmRepository;
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
public class GoodsService {

	@Autowired
	GoodsRepository goodsRepository;

	@Autowired
	GenreLgRepository genreLgRepository;

	@Autowired
	GenreMdRepository genreMdRepository;

	@Autowired
	GenreSmRepository genreSmRepository;

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
				.where(goodsSpecifications.conditionForStartWith("goodsCd", goodsForm.getSearchGoodsCd()))
				.and(goodsSpecifications.conditionForLike("goodsNm", goodsForm.getSearchGoodsNm()))
				.and(goodsSpecifications.conditionForLike("subGoodsNm", goodsForm.getSearchSubGoodsNm()))
				.and(goodsSpecifications.conditionForStartWith("genreLgEntity", "genreLgCd", goodsForm.getSearchGenreLgCd()))
				.and(goodsSpecifications.conditionForStartWith("genreMdEntity", "genreMdCd", goodsForm.getSearchGenreMdCd()))
				.and(goodsSpecifications.conditionForStartWith("genreSmEntity", "genreSmCd", goodsForm.getSearchGenreSmCd()))
				.and(goodsSpecifications.conditionForLike("overview", goodsForm.getSearchOverview()))
				.and(goodsSpecifications.conditionForLike("detail", goodsForm.getSearchDetail()))
				.and(goodsSpecifications.conditionForLike("maker", goodsForm.getSearchMaker()))
				.and(goodsSpecifications.conditionForEqual("goodsSize", goodsForm.getSearchGoodsSize())), sort);
	}

	/**
	 * メソッドの説明：大ジャンル要素取得
	 * @author kamagata
	 * @since 2018/01/18
	 * @return List<GenreLgEntity> 大ジャンルエンティティのリスト
	 */
	public List<GenreLgEntity> findGenreLgList() {
		return genreLgRepository.findAll(new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：中ジャンル要素取得
	 * @author kamagata
	 * @param genreLgCd 大ジャンルコード
	 * @since 2018/01/18
	 * @return List<GenreMdEntity> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findGenreMdList(String genreLgCd) {
		return genreMdRepository.findByGenreLgEntityGenreLgCd(genreLgCd, new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：小ジャンル要素取得
	 * @author kamagata
	 * @param genreMdCd 中ジャンルコード
	 * @since 2018/01/18
	 * @return List<GenreSmEntity> 小ジャンルエンティティのリスト
	 */
	public List<GenreSmEntity> findGenreSmList(String genreMdCd) {
		return genreSmRepository.findByGenreMdEntityGenreMdCd(genreMdCd, new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：大ジャンル、中ジャンルの組み合わせ存在チェック
	 * @author kamagata
	 * @param genreLgCd 大ジャンルコード
	 * @param genreMdCd 中ジャンルコード
	 * @since 2018/01/18
	 * @return List<GenreSmEntity> 小ジャンルエンティティのリスト
	 */
	public boolean existsByGenreLgCdAndGenreMdCd(String genreLgCd, String genreMdCd) {
		return genreMdRepository.existsByGenreLgEntityGenreLgCdAndGenreMdCd(genreLgCd, genreMdCd);
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

	/**
	 * メソッドの説明：ModelAndViewセット(各種プルダウン要素セット含む)
	 * @author kamagata
	 * @since 2018/01/21
	 * @param modelAndView モデルビュー
	 * @param goodsForm 商品フォーム
	 * @param transitionUrl 遷移先URL
	 * @return ModelAndView モデルビュー
	 */
	public ModelAndView setModelAndView(ModelAndView modelAndView, GoodsForm goodsForm, String transitionUrl) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = findGenreLgList();

		// 中ジャンルプルダウン要素取得
		List<GenreMdEntity> genreMdEntities = findGenreMdList(goodsForm.getGenreLgCd());

		// 小ジャンルプルダウン要素取得
		List<GenreSmEntity> genreSmEntities = findGenreSmList(goodsForm.getGenreMdCd());

		// モデルセット
		modelAndView.addObject("genreLgSelectItems", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdSelectItems", genreMdEntities); // 中ジャンルプルダウン要素
		modelAndView.addObject("genreSmSelectItems", genreSmEntities); // 小ジャンルプルダウン要素
		modelAndView.addObject("goodsForm", goodsForm); // 商品フォーム
		modelAndView.setViewName(transitionUrl); // 遷移先URLセット

		return modelAndView;

	}
}
