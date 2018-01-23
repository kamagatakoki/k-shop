package com.example.demo.domain.entity.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.demo.domain.entity.CommonColumnEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：商品画像マスタエンティティ
 * @author kamagata
 * @since 2018/01/16
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GOODS_IMAGE")
@EntityListeners(AuditingEntityListener.class)
public class GoodsImageEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：商品画像コード
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Id
	@Column(length = 12)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GOODS_IMAGE_GEN")
	@SequenceGenerator(name = "SEQ_GOODS_IMAGE_GEN", sequenceName = "SEQ_GOODS_IMAGE", allocationSize = 1)
	private Integer goodsImageCd;

	/**
	 * フィールドの説明：ファイル名
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Column(nullable = false, length = 100, updatable = false)
	private String fileNm;

	/**
	 * フィールドの説明：画像
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Lob
	@Column(nullable = false, updatable = false)
	private byte[] image;

	/**
	 * フィールドの説明：説明
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Column(length = 200)
	private String description;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Column(nullable = false, length = 2)
	private Integer displayOrder;

	/**
	 * フィールドの説明：商品マスタエンティティ
	 * @author kamagata
	 * @since 2018/01/23
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "goodsCd")
	private GoodsEntity goodsEntity;

}
