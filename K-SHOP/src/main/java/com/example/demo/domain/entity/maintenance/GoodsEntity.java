package com.example.demo.domain.entity.maintenance;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.example.demo.domain.entity.common.CommonColumnEntity;
import com.example.demo.domain.entity.common.LocalDateConverter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：商品マスタエンティティ
 * @author kamagata
 * @since 2018/01/17
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GOODS")
@EntityListeners(AuditingEntityListener.class)
@Component
public class GoodsEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：商品コード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Id
	@Column(nullable = false, length = 10)
	private String goodsCd;

	/**
	 * フィールドの説明：商品名(メイン)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column(nullable = false, length = 200)
	private String goodsNm;

	/**
	 * フィールドの説明：商品名(サブ)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column(nullable = false, length = 200)
	private String subGoodsNm;

	/**
	 * フィールドの説明：発売日
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column
	@Convert(converter = LocalDateConverter.class)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate releaseDt;

	/**
	 * フィールドの説明：商品概要
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column(nullable = false, length = 200)
	private String overview;

	/**
	 * フィールドの説明：商品詳細
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column(nullable = false, length = 1000)
	private String detail;

	/**
	 * フィールドの説明：メーカー
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column(nullable = false, length = 200)
	private String maker;

	/**
	 * フィールドの説明：サイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Column(nullable = false, length = 200)
	private String goodsSize;

	/**
	 * フィールドの説明：大ジャンルエンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Autowired
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "genreLgCd")
	private GenreLgEntity genreLgEntity;

	/**
	 * フィールドの説明：中ジャンルエンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Autowired
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "genreMdCd")
	private GenreMdEntity genreMdEntity;

	/**
	 * フィールドの説明：小ジャンルエンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	@Autowired
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "genreSmCd")
	private GenreSmEntity genreSmEntity;

	/**
	 * フィールドの説明：商品価格エンティティ
	 * @author kamagata
	 * @since 2018/01/29
	 */
	@OneToMany(mappedBy = "goodsEntityForGoodsPrice")
	private List<GoodsPriceEntity> goodsPriceEntities;

	/**
	 * フィールドの説明：商品画像エンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/23
	 */
	@OneToMany(mappedBy = "goodsEntity", fetch = FetchType.EAGER)
	@OrderBy("displayOrder")
	@Fetch(FetchMode.SUBSELECT)
	private List<GoodsImageEntity> goodsImageEntities;
}
