package com.example.demo.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.entity.maintenance.GenreMdEntity;
import com.example.demo.domain.entity.maintenance.GenreSmEntity;
import com.example.demo.domain.repository.maintenance.GenreLgRepository;
import com.example.demo.domain.repository.maintenance.GenreMdRepository;
import com.example.demo.domain.repository.maintenance.GenreSmRepository;
import com.example.demo.domain.repository.maintenance.GoodsRepository;

/**
 * クラスの説明：商品マスタサービス
 * @author kamagata
 * @since 2018/01/16
 */
@Service
@Transactional
public class CommonService {

	@Autowired
	GoodsRepository goodsRepository;

	@Autowired
	GenreLgRepository genreLgRepository;

	@Autowired
	GenreMdRepository genreMdRepository;

	@Autowired
	GenreSmRepository genreSmRepository;

	/**
	 * メソッドの説明：大ジャンル要素取得
	 * @author kamagata
	 * @since 2018/01/18
	 * @return List<GenreLgEntity> 大ジャンルエンティティのリスト
	 */
	public List<GenreLgEntity> findGenreLgList() {
		return genreLgRepository.findAll(new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：中ジャンル要素取得
	 * @author kamagata
	 * @param genreLgCd 大ジャンルコード
	 * @since 2018/01/18
	 * @return List<GenreMdEntity> 中ジャンルエンティティのリスト
	 */
	public List<GenreMdEntity> findGenreMdList(String genreLgCd) {
		return genreMdRepository.findByGenreLgEntityGenreLgCd(genreLgCd, new Sort("displayOrder"));
	}

	/**
	 * メソッドの説明：小ジャンル要素取得
	 * @author kamagata
	 * @param genreMdCd 中ジャンルコード
	 * @since 2018/01/18
	 * @return List<GenreSmEntity> 小ジャンルエンティティのリスト
	 */
	public List<GenreSmEntity> findGenreSmList(String genreMdCd) {
		return genreSmRepository.findByGenreMdEntityGenreMdCd(genreMdCd, new Sort("displayOrder"));
	}

}
