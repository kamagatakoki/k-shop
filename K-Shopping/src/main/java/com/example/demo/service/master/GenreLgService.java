package com.example.demo.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.example.demo.domain.master.GenreLgEntity;
import com.example.demo.domain.master.GenreLgRepository;

/**
 * クラスの説明：ジャンル大テーブル操作サービスクラス
 * @author kamagata
 * @since 2018/01/06
 */
@Service
public class GenreLgService {
	@Autowired
	GenreLgRepository genreLgRepository;

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/01/06
	 * @param genreLgCd ジャンル大コード
	 * @param genreNm ジャンル名
	 * @param sort ソート項目
	 * @return 検索結果(ジャンル大テーブルエンティティ)
	 */
	public List<GenreLgEntity> findGenreLg(Integer genreLgCd, String genreNm, Sort sort) {
		return genreLgRepository.findAll(Specifications
				.where(GenreLgSpecifications.genreLgCdContains(genreLgCd))
				.and(GenreLgSpecifications.genreNmContains(genreNm)), sort);
	}

	/**
	 * メソッドの説明：DB登録・更新
	 * @author kamagata
	 * @since 2018/01/08
	 * @param genreLgEntity ジャンル大エンティティ
	 * @return ジャンル大エンティティ
	 */
	public GenreLgEntity update(GenreLgEntity genreLgEntity) {
		return genreLgRepository.save(genreLgEntity);
	}

	/**
	 * メソッドの説明：DB削除
	 * @author kamagata
	 * @since 2018/01/08
	 * @param genreLgCd ジャンル大コード
	 */
	public void delete(Integer genreLgCd) {
		genreLgRepository.delete(genreLgCd);
	}

}
