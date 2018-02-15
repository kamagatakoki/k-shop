package com.example.sample.service.maintenance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.domain.entity.maintenance.GenreSmCriteria;
import com.example.sample.domain.entity.maintenance.GenreSmCriteria.Criteria;
import com.example.sample.domain.entity.maintenance.GenreSmEntity;
import com.example.sample.domain.mapper.maintenance.GenreSmMapper;
import com.example.sample.form.maintenance.GenreSmForm;

/**
 * クラスの説明：中ジャンルマスタサービス
 * @author kamagata
 * @since 2018/02/13
 */
@Service
@Scope("prototype")
@Transactional
public class GenreSmService {

	@Autowired
	GenreSmMapper genreSmMapper;

	@Autowired
	GenreSmCriteria genreSmCriteria;

	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GenreMdService genreMdService;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @return List<GenreMd> 中ジャンルエンティティのリスト
	 */
	public List<GenreSmEntity> findAll() {
		return genreSmMapper.selectByCriteria(genreSmCriteria);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreSmForm 中ジャンルマスタフォーム
	 * @return List<GenreMd> 中ジャンルエンティティのリスト
	 */
	public List<GenreSmEntity> findGenreSm(GenreSmForm genreSmForm) {

		Criteria criteria = genreSmCriteria.createCriteria();

		// 大ジャンルコード
		Optional.ofNullable(genreSmForm.getSearchGenreLgCd())
				.ifPresent(t -> criteria.andGenreLgCdEqualTo(t));

		// 中ジャンルコード
		Optional.ofNullable(genreSmForm.getSearchGenreMdCd())
				.ifPresent(t -> criteria.andGenreMdCdEqualTo(t));

		// 小ジャンルコード
		Optional.ofNullable(genreSmForm.getSearchGenreSmCd())
				.ifPresent(t -> criteria.andGenreSmCdEqualTo(t));

		// 大ジャンル名
		Optional.ofNullable(genreSmForm.getSearchGenreLgNm())
				.ifPresent(t -> criteria.andGenreLgNmLike("%" + t + "%"));

		// 中ジャンル名
		Optional.ofNullable(genreSmForm.getSearchGenreMdNm())
				.ifPresent(t -> criteria.andGenreMdNmLike("%" + t + "%"));

		// 中ジャンル名
		Optional.ofNullable(genreSmForm.getSearchGenreSmNm())
				.ifPresent(t -> criteria.andGenreSmNmLike("%" + t + "%"));

		// ソート
		genreSmCriteria.setOrderByClause("LG.DISPLAY_ORDER, MD.DISPLAY_ORDER, SM.DISPLAY_ORDER");

		// 検索実行
		return genreSmMapper.selectGenreLgMdSmByCriteria(genreSmCriteria);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreSmCd 小ジャンルコード
	 * @return GenreSmEntity 小ジャンルエンティティ
	 */
	public GenreSmEntity findOne(String genreSmCd) {
		return genreSmMapper.selectByPrimaryKey(genreSmCd);
	}

	/**
	 * メソッドの説明：大ジャンル要素取得
	 * @author kamagata
	 * @since 2018/02/13
	 * @return List<GenreLgEntity> 大ジャンルエンティティのリスト
	 */
	public List<GenreLgEntity> findGenreLgList() {
		return genreLgService.findAll();
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @since 2018/02/13
	 * @param GenreMd 中ジャンルエンティティ
	 * @return GenreMd 中ジャンルエンティティ
	 */
	public Integer rupdate(GenreSmEntity GenreMd) {
		return genreSmMapper.insert(GenreMd);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreSmCd 中ジャンルコード
	 */
	public void delete(String genreSmCd) {
		genreSmMapper.deleteByPrimaryKey(genreSmCd);
	}
}
