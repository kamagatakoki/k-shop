package com.example.sample.service.maintenance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.domain.entity.maintenance.GenreLgCriteria;
import com.example.sample.domain.entity.maintenance.GenreLgCriteria.Criteria;
import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.domain.entity.maintenance.GenreMdCriteria;
import com.example.sample.domain.mapper.maintenance.GenreLgMapper;
import com.example.sample.domain.mapper.maintenance.GenreMdMapper;
import com.example.sample.form.maintenance.GenreLgForm;

/**
 * クラスの説明：大ジャンルマスタ　サービス
 * @author kamagata
 * @since 2018/02/11
 */
@Service
@Transactional
public class GenreLgService {

	@Autowired
	GenreLgMapper genreLgMapper;

	@Autowired
	GenreMdMapper genreMdMapper;

	@Lookup
	GenreMdCriteria genreMdCriteria() {
		return null;
	}

	@Lookup
	GenreLgCriteria genreLgCriteria() {
		return null;
	}

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @since 2018/02/11
	 * @return List<GenreLg> 大ジャンルマスタのリスト
	 */
	public List<GenreLgEntity> findAll() {
		GenreLgCriteria genreLgCriteria = genreLgCriteria();
		return genreLgMapper.selectByCriteria(genreLgCriteria);
	}

	/**
	 * メソッドの説明：プライマリ検索
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLgCd 大ジャンルコード
	 * @return GenreLg 大ジャンルマスタ
	 */
	public GenreLgEntity findOne(String genreLgCd) {
		return genreLgMapper.selectByPrimaryKey(genreLgCd);
	}

	/**
	 * メソッドの説明：大ジャンルマスタ動的検索
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLgForm 大ジャンルフォーム
	 * @return List<GenreLg> 大ジャンルマスタのリスト
	 */
	public List<GenreLgEntity> findGenreLgCriteria(GenreLgForm genreLgForm) {

		GenreLgCriteria genreLgCriteria = genreLgCriteria();
		Criteria criteria = genreLgCriteria.createCriteria();

		// 大ジャンルコード
		Optional.ofNullable(genreLgForm.getSearchGenreLgCd())
				.ifPresent(t -> criteria.andGenreLgCdEqualTo(t));
		// 大ジャンル名
		Optional.ofNullable(genreLgForm.getSearchGenreLgNm())
				.ifPresent(t -> criteria.andGenreLgNmLike("%" + t + "%"));

		// ソート
		genreLgCriteria.setOrderByClause("DISPLAY_ORDER");

		return genreLgMapper.selectByCriteria(genreLgCriteria);
	}

	/**
	 * メソッドの説明：登録
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLg 大ジャンルマスタ
	 * @return Integer 成功可否
	 */
	public Integer insert(GenreLgEntity genreLg) {
		return genreLgMapper.insertSelective(genreLg);
	}

	/**
	 * メソッドの説明：更新
	 * @author kamagata
	 * @since 2018/02/11
	 * @param genreLg 大ジャンルマスタ
	 * @return Integer 成功可否
	 */
	public Integer update(GenreLgEntity genreLg) {
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

	/**
	 * メソッドの説明：削除時下位データ(中ジャンル)存在チェック
	 * @author kamagata
	 * @since 2018/01/15
	 * @param genreLgCd 大ジャンルコード
	 * @return True:OK False:NG
	 */
	public boolean deleteCheck(String genreLgCd) {

		// 中ジャンルコード
		GenreMdCriteria genreMdCriteria = genreMdCriteria();
		genreMdCriteria.createCriteria().andGenreLgCdEqualTo(genreLgCd);

		// 存在する場合はエラー
		return !(genreMdMapper.countByCriteria(genreMdCriteria) == 0);
	}

}
