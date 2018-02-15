package com.example.sample.service.maintenance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.domain.mapper.maintenance.GenreMdMapper;
import com.example.sample.domain.model.maintenance.GenreLg;
import com.example.sample.domain.model.maintenance.GenreMd;
import com.example.sample.domain.model.maintenance.GenreMdExample;
import com.example.sample.domain.model.maintenance.GenreMdExample.Criteria;
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
	GenreMdExample genreMdExample;

	@Autowired
	GenreLgService genreLgService;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @return List<GenreMd> 中ジャンルエンティティのリスト
	 */
	public List<GenreMd> findAll() {
		return genreMdMapper.selectByExample(genreMdExample);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreMdForm 中ジャンルマスタフォーム
	 * @return List<GenreMd> 中ジャンルエンティティのリスト
	 */
	public List<GenreMd> findGenreMd(GenreMdForm genreMdForm) {

		Criteria criteria = genreMdExample.createCriteria();

		// 中ジャンルコード
		Optional.ofNullable(genreMdForm.getSearchGenreMdCd())
				.ifPresent(t -> criteria.andGenreMdCdEqualTo(t));

		// 中ジャンル名
		Optional.ofNullable(genreMdForm.getSearchGenreMdNm())
				.ifPresent(t -> criteria.andGenreMdNmLike("%" + t + "%"));

		// ソート
		genreMdExample.setOrderByClause("l.DISPLAY_ORDER, m.DISPLAY_ORDER");

		return genreMdMapper.selectGenreLgAndMdByExample(genreMdExample);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/02/13
	 * @param genreMdCd 中ジャンルコード
	 * @return GenreMd 中ジャンルエンティティ
	 */
	public GenreMd findOne(String genreMdCd) {
		return genreMdMapper.selectByPrimaryKey(genreMdCd);
	}

	/**
	 * メソッドの説明：大ジャンル要素取得
	 * @author kamagata
	 * @since 2018/02/13
	 * @return List<GenreLgEntity> 大ジャンルエンティティのリスト
	 */
	public List<GenreLg> findGenreLgList() {
		return genreLgService.findAll();
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @since 2018/02/13
	 * @param GenreMd 中ジャンルエンティティ
	 * @return GenreMd 中ジャンルエンティティ
	 */
	public Integer rupdate(GenreMd GenreMd) {
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

	//	/**
	//	 * メソッドの説明：削除時チェック
	//	 * @author kamagata
	//	 * @since 2018/01/15
	//	 * @param genreMdCd 中ジャンルコード
	//	 * @return True:OK False:NG
	//	 */
	//	public boolean deleteCheck(String genreMdCd) {
	//
	//		return genreSmRepository.existsByGenreMdGenreMdCd(genreMdCd);
	//	}
}
