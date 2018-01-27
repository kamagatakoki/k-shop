package com.example.demo.service.maintenance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.entity.maintenance.GenreMdEntity;
import com.example.demo.domain.entity.maintenance.GenreSmEntity;
import com.example.demo.domain.repository.maintenance.GenreLgRepository;
import com.example.demo.domain.repository.maintenance.GenreMdRepository;
import com.example.demo.domain.repository.maintenance.GenreSmRepository;
import com.example.demo.specifications.CommonSpecifications;
import com.example.demo.web.form.maintenance.GenreSmForm;

/**
 * クラスの説明：小ジャンルマスタサービス
 * @author kamagata
 * @since 2018/01/14
 */
@Service
@Transactional
public class GenreSmService {

	@Autowired
	GenreMdRepository genreMdRepository;

	@Autowired
	GenreLgRepository genreLgRepository;

	@Autowired
	GenreSmRepository genreSmRepository;

	@Autowired
	CommonSpecifications<GenreSmEntity> genreSmSpecifications;

	/**
	 * メソッドの説明：全件検索
	 * @author kamagata
	 * @param sort ソート
	 * @since 2018/01/14
	 * @return List<GenreMdEntity> 小ジャンルエンティティのリスト
	 */
	public List<GenreSmEntity> findAll(Sort sort) {
		return genreSmRepository.findAll(sort);
	}

	/**
	 * メソッドの説明：検索条件による検索
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreSmForm 小ジャンルマスタフォーム
	 * @param sort ソート
	 * @return List<GenreMdEntity> 小ジャンルエンティティのリスト
	 */
	public List<GenreSmEntity> findAllCustom(GenreSmForm genreSmForm, Sort sort) {
		return genreSmRepository.findAll(Specifications
				.where(genreSmSpecifications.conditionForEqual("genreLgEntity", "genreLgCd",
						genreSmForm.getSearchGenreLgCd()))
				.and(genreSmSpecifications.conditionForStartWith("genreMdEntity", "genreMdCd",
						genreSmForm.getSearchGenreMdCd()))
				.and(genreSmSpecifications.conditionForStartWith("genreSmCd", genreSmForm.getSearchGenreSmCd()))
				.and(genreSmSpecifications.conditionForLike("genreLgEntity", "genreLgNm", genreSmForm.getSearchGenreLgNm()))
				.and(genreSmSpecifications.conditionForLike("genreMdEntity", "genreMdNm", genreSmForm.getSearchGenreMdNm()))
				.and(genreSmSpecifications.conditionForLike("genreSmNm", genreSmForm.getSearchGenreSmNm())), sort);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreSmCd 小ジャンルコード
	 * @return GenreMdEntity 小ジャンルエンティティ
	 */
	public GenreSmEntity findOne(String genreSmCd) {
		return genreSmRepository.findOne(genreSmCd);
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
	 * メソッドの説明：中ジャンル要素取得
	 * @author kamagata
	 * @param genreLgCd 大ジャンルコード
	 * @since 2018/01/14
	 * @return List<GenreMdEntity> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findGenreMdList(String genreLgCd) {
		return genreMdRepository.findByGenreLgEntityGenreLgCd(genreLgCd, new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：登録・更新
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreSmEntity 小ジャンルエンティティ
	 * @return GenreSmEntity 小ジャンルエンティティ
	 */
	public GenreSmEntity update(GenreSmEntity genreSmEntity) {
		return genreSmRepository.save(genreSmEntity);
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreSmCd 小ジャンルコード
	 */
	public void delete(String genreSmCd) {
		genreSmRepository.delete(genreSmCd);
	}
}
