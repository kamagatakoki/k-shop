package com.example.sample.service.maintenance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.domain.mapper.maintenance.GenreLgMapper;
import com.example.sample.domain.model.maintenance.GenreLg;
import com.example.sample.domain.model.maintenance.GenreLgExample;
import com.example.sample.domain.model.maintenance.GenreLgExample.Criteria;
import com.example.sample.form.maintenance.GenreLgForm;

/**
 * クラスの説明：大ジャンルマスタ　サービス
 * @author kamagata
 * @since 2018/02/11
 */
@Service
@Scope("prototype")
@Transactional
public class GenreLgService {

	@Autowired
	GenreLgMapper genreLgMapper;

	@Autowired
	GenreLgExample genreLgExample;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @since 2018/02/11
	 * @return List<GenreLg> 大ジャンルマスタのリスト
	 */
	public List<GenreLg> findAll() {
		return genreLgMapper.selectByExample(genreLgExample);
	}

	/**
	 * メソッドの説明：プライマリ検索
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLgCd 大ジャンルコード
	 * @return GenreLg 大ジャンルマスタ
	 */
	public GenreLg findOne(String genreLgCd) {
		return genreLgMapper.selectByPrimaryKey(genreLgCd);
	}

	/**
	 * メソッドの説明：大ジャンルマスタ動的検索
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLgForm 大ジャンルフォーム
	 * @return List<GenreLg> 大ジャンルマスタのリスト
	 */
	public List<GenreLg> findGenreLg(GenreLgForm genreLgForm) {

		Criteria criteria = genreLgExample.createCriteria();

		// 大ジャンルコード
		Optional.ofNullable(genreLgForm.getSearchGenreLgCd())
				.ifPresent(t -> criteria.andGenreLgCdEqualTo(t));
		// 大ジャンル名
		Optional.ofNullable(genreLgForm.getSearchGenreLgNm())
				.ifPresent(t -> criteria.andGenreLgNmLike("%" + t + "%"));

		// ソート
		genreLgExample.setOrderByClause("DISPLAY_ORDER");

		return genreLgMapper.selectByExample(genreLgExample);
	}

	/**
	 * メソッドの説明：登録
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLg 大ジャンルマスタ
	 * @return Integer 成功可否
	 */
	public Integer insert(GenreLg genreLg) {
		return genreLgMapper.insertSelective(genreLg);
	}

	/**
	 * メソッドの説明：更新
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLg 大ジャンルマスタ
	 * @return Integer 成功可否
	 */
	public Integer update(GenreLg genreLg) {
		return genreLgMapper.updateByPrimaryKeySelective(genreLg);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLgCd 大ジャンルコード
	 * @return Integer 成功可否
	 */
	public Integer delete(String genreLgCd) {
		return genreLgMapper.deleteByPrimaryKey(genreLgCd);
	}
}
