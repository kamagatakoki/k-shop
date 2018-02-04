package com.example.demo.domain.entity.shop;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.demo.domain.entity.common.CommonColumnEntity;
import com.example.demo.domain.entity.maintenance.GoodsEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：カート(詳細)エンティティ
 * @author kamagata
 * @since 2018/01/28
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CART_DETAIL")
@EntityListeners(AuditingEntityListener.class)
public class CartDetailEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：カート詳細コード
	 * @author kamagata
	 * @since 2018/01/28
	 */
	@Id
	@Column(nullable = false, length = 10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CART_DETAIL_GEN")
	@SequenceGenerator(name = "SEQ_CART_DETAIL_GEN", sequenceName = "SEQ_CART_DETAIL", allocationSize = 1)
	private Integer cartDetailCd;

	/**
	 * フィールドの説明：商品マスタエンティティ
	 * @author kamagata
	 * @since 2018/01/29
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "goodsCd")
	private GoodsEntity goodsEntity;

	/**
	 * フィールドの説明：カート(ヘッダー)エンティティ
	 * @author kamagata
	 * @since 2018/01/29
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cartHeadCd")
	private CartHeadEntity cartHeadEntity;

	/**
	 * フィールドの説明：数量
	 * @author kamagata
	 * @since 2018/02/04
	 */
	@Column(nullable = false, length = 4)
	private Integer quantity;

}
