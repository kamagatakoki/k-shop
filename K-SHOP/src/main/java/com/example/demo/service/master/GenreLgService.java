package com.example.demo.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.entity.master.GenreLgRepository;

/**
 * クラスの説明：大ジャンルテーブル操作サービスクラス
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
	 * @param genreLgCd 大ジャンルコード
	 * @param genreLgNm 大ジャンル名
	 * @param sort ソート項目
	 * @return 検索結果(大ジャンルテーブルエンティティ)
	 */
	public List<GenreLgEntity> findGenreLg(String genreLgCd, String genreLgNm, Sort sort) {
		return genreLgRepository.findAll(Specifications
				.where(GenreLgSpecifications.genreLgCdContains(genreLgCd))
				.and(GenreLgSpecifications.genreLgNmContains(genreLgNm)), sort);
	}

	/**
	 * メソッドの説明：DB登録・更新
	 * @author kamagata
	 * @since 2018/01/08
	 * @param genreLgEntity 大ジャンルエンティティ
	 * @return 大ジャンルエンティティ
	 */
	public GenreLgEntity update(GenreLgEntity genreLgEntity) {
		return genreLgRepository.save(genreLgEntity);
	}

	/**
	 * メソッドの説明：DB削除
	 * @author kamagata
	 * @since 2018/01/08
	 * @param genreLgCd 大ジャンルコード
	 */
	public void delete(String genreLgCd) {
		genreLgRepository.delete(genreLgCd);
	}

}
