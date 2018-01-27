package com.example.demo.service.maintenance;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.entity.maintenance.GoodsImageEntity;
import com.example.demo.domain.repository.maintenance.GoodsImageRepository;
import com.example.demo.specifications.CommonSpecifications;
import com.example.demo.web.form.maintenance.GoodsImageForm;

/**
 * クラスの説明：商品画像マスタサービス
 * @author kamagata
 * @since 2018/01/16
 */
@Service
@Transactional
public class GoodsImageService implements Serializable {

	@Autowired
	GoodsImageRepository goodsImageRepository;

	@Autowired
	CommonSpecifications<GoodsImageEntity> goodsImageSpecifications;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @param sort ソート
	 * @since 2018/01/16
	 * @return List<GoodsImageEntity> 商品画像エンティティのリスト
	 */
	public List<GoodsImageEntity> findAll(Sort sort) {
		return goodsImageRepository.findAll(sort);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/01/16
	 * @param goodsImageForm 商品画像マスタフォーム
	 * @param sort ソート
	 * @return List<GoodsImageEntity> 商品画像エンティティのリスト
	 */
	public List<GoodsImageEntity> findAllCustom(GoodsImageForm goodsImageForm, Sort sort) {
		return goodsImageRepository.findAll(Specifications
				.where(goodsImageSpecifications.conditionForEqual("goodsImageCd", goodsImageForm.getSearchGoodsImageCd()))
				.and(goodsImageSpecifications.conditionForLike("goodsEntity", "goodsCd", goodsImageForm.getSearchGoodsCd()))
				.and(goodsImageSpecifications.conditionForLike("fileNm", goodsImageForm.getSearchFileNm()))
				.and(goodsImageSpecifications.conditionForLike("description", goodsImageForm.getSearchDescription())), sort);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/01/16
	 * @param goodsImageCd 商品画像コード
	 * @return GoodsImageEntity 商品画像エンティティ
	 */
	public GoodsImageEntity findOne(Integer goodsImageCd) {
		return goodsImageRepository.findOne(goodsImageCd);
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @param goodsImageEntity 商品画像エンティティ
	 * @since 2018/01/16
	 * @return GoodsImageEntity 商品画像エンティティ
	 */
	public GoodsImageEntity update(GoodsImageEntity goodsImageEntity) {
		return goodsImageRepository.save(goodsImageEntity);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/01/16
	 * @param goodsImageCd 商品画像コード
	 */
	public void delete(Integer goodsImageCd) {
		goodsImageRepository.delete(goodsImageCd);
	}

	/**
	 * メソッドの説明：画像ファイルをByte配列に変換
	 * @author kamagata
	 * @since 2018/01/17
	 * @param image 画像ファイル
	 * @return byte[] 変換後のバイト配列
	 * @throws IOException IO例外
	 */
	public byte[] convertImageToBytes(MultipartFile image) throws IOException {

		InputStream is = null;

		try {

			// 画像ファイル読み込み
			is = image.getInputStream();

			// 画像ファイルをバイト配列に変換
			return IOUtils.toByteArray(is);

		} catch (IOException e) {
			// 例外をスロー
			e.printStackTrace();
			throw e;

		} finally {
			// ファイルクローズ
			IOUtils.closeQuietly(is);
		}
	}

	/**
	 * メソッドの説明：商品コード検索
	 * @author kamagata
	 * @since 2018/01/23
	 * @param goodsCd 商品コード
	 * @return List<GoodsImageEntity> 商品画像エンティティのリスト
	 */
	public List<GoodsImageEntity> findByGoodsCd(String goodsCd) {
		return goodsImageRepository.findByGoodsEntityGoodsCd(goodsCd);
	}

}
