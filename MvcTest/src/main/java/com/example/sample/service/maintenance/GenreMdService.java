package com.example.sample.service.maintenance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.domain.entity.maintenance.GenreMdCriteria;
import com.example.sample.domain.entity.maintenance.GenreMdCriteria.Criteria;
import com.example.sample.domain.entity.maintenance.GenreMdEntity;
import com.example.sample.domain.entity.maintenance.GenreSmCriteria;
import com.example.sample.domain.mapper.maintenance.GenreMdMapper;
import com.example.sample.domain.mapper.maintenance.GenreSmMapper;
import com.example.sample.form.maintenance.GenreMdForm;

/**
 * クラスの説明：中ジャンルマスタサービス
 * @author kamagata
 * @since 2018/02/13
 */
@Service
@Scope("prototype")
@Transactional
public class GenreMdService {

	@Autowired
	GenreMdMapper genreMdMapper;

	@Autowired
	GenreSmMapper genreSmMapper;

	@Autowired
	GenreMdCriteria genreMdCriteria;

	@Autowired
	GenreSmCriteria genreSmCriteria;

	@Autowired
	GenreLgService genreLgService;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @return List<GenreMd> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findAll() {
		return genreMdMapper.selectByExample(genreMdCriteria);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreMdForm 中ジャンルマスタフォーム
	 * @return List<GenreMd> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findGenreMd(GenreMdForm genreMdForm) {

		Criteria criteria = genreMdCriteria.createCriteria();

		// 大ジャンルコード
		Optional.ofNullable(genreMdForm.getSearchGenreLgCd())
				.ifPresent(t -> criteria.andGenreLgCdEqualTo(t));

		// 中ジャンルコード
		Optional.ofNullable(genreMdForm.getSearchGenreMdCd())
				.ifPresent(t -> criteria.andGenreMdCdEqualTo(t));

		// 大ジャンル名
		Optional.ofNullable(genreMdForm.getSearchGenreLgNm())
				.ifPresent(t -> criteria.andGenreLgNmLike("%" + t + "%"));

		// 中ジャンル名
		Optional.ofNullable(genreMdForm.getSearchGenreMdNm())
				.ifPresent(t -> criteria.andGenreMdNmLike("%" + t + "%"));

		// ソート
		genreMdCriteria.setOrderByClause("LG.DISPLAY_ORDER, MD.DISPLAY_ORDER");

		return genreMdMapper.selectGenreLgAndMdByCriteria(genreMdCriteria);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreMdCd 中ジャンルコード
	 * @return GenreMdEntity 中ジャンルエンティティ
	 */
	public GenreMdEntity findOne(String genreMdCd) {
		return genreMdMapper.selectByPrimaryKey(genreMdCd);
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
	public Integer rupdate(GenreMdEntity GenreMd) {
		return genreMdMapper.insert(GenreMd);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreMdCd 中ジャンルコード
	 */
	public void delete(String genreMdCd) {
		genreMdMapper.deleteByPrimaryKey(genreMdCd);
	}

	/**
	 * メソッドの説明：削除時下位データ(小ジャンル)存在チェック
	 * @author kamagata
	 * @since 2018/01/15
	 * @param genreMdCd 中ジャンルコード
	 * @return True:OK False:NG
	 */
	public boolean deleteCheck(String genreMdCd) {

		// 中ジャンルコード
		genreSmCriteria.createCriteria().andGenreMdCdEqualTo(genreMdCd);

		// 存在する場合はエラー
		return !(genreSmMapper.countByExample(genreSmCriteria) == 0);
	}
}
