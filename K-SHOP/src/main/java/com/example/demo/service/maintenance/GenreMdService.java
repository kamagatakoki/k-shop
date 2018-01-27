package com.example.demo.service.maintenance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.entity.maintenance.GenreMdEntity;
import com.example.demo.domain.repository.maintenance.GenreLgRepository;
import com.example.demo.domain.repository.maintenance.GenreMdRepository;
import com.example.demo.domain.repository.maintenance.GenreSmRepository;
import com.example.demo.specifications.CommonSpecifications;
import com.example.demo.web.form.maintenance.GenreMdForm;

/**
 * クラスの説明：中ジャンルマスタサービス
 * @author kamagata
 * @since 2018/01/14
 */
@Service
@Transactional
public class GenreMdService {

	@Autowired
	GenreMdRepository genreMdRepository;

	@Autowired
	GenreLgRepository genreLgRepository;

	@Autowired
	GenreSmRepository genreSmRepository;

	@Autowired
	CommonSpecifications<GenreMdEntity> commonSpecifications;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @param sort ソート
	 * @since 2018/01/14
	 * @return List<GenreMdEntity> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findAll(Sort sort) {
		return genreMdRepository.findAll(sort);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreMdForm 中ジャンルマスタフォーム
	 * @param sort ソート
	 * @return List<GenreMdEntity> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findAllCustom(GenreMdForm genreMdForm, Sort sort) {
		return genreMdRepository.findAll(Specifications
				.where(commonSpecifications.conditionForEqual("genreLgEntity", "genreLgCd", genreMdForm.getSearchGenreLgCd()))
				.and(commonSpecifications.conditionForStartWith("genreMdCd", genreMdForm.getSearchGenreMdCd()))
				.and(commonSpecifications.conditionForLike("genreLgNm", genreMdForm.getSearchGenreLgNm()))
				.and(commonSpecifications.conditionForLike("genreMdNm", genreMdForm.getSearchGenreMdNm())), sort);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreMdCd 中ジャンルコード
	 * @return GenreMdEntity 中ジャンルエンティティ
	 */
	public GenreMdEntity findOne(String genreMdCd) {
		return genreMdRepository.findOne(genreMdCd);
	}

	/**
	 * メソッドの説明：大ジャンル要素取得
	 * @author kamagata
	 * @since 2018/01/14
	 * @return List<GenreLgEntity> 大ジャンルエンティティのリスト
	 */
	public List<GenreLgEntity> findGenreLgList() {
		return genreLgRepository.findAll(new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreMdEntity 中ジャンルエンティティ
	 * @return GenreMdEntity 中ジャンルエンティティ
	 */
	public GenreMdEntity update(GenreMdEntity genreMdEntity) {
		return genreMdRepository.save(genreMdEntity);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreMdCd 中ジャンルコード
	 */
	public void delete(String genreMdCd) {
		genreMdRepository.delete(genreMdCd);
	}

	/**
	 * メソッドの説明：削除時チェック
	 * @author kamagata
	 * @since 2018/01/15
	 * @param genreMdCd 中ジャンルコード
	 * @return True:OK False:NG
	 */
	public boolean deleteCheck(String genreMdCd) {

		return genreSmRepository.existsByGenreMdEntityGenreMdCd(genreMdCd);
	}
}
