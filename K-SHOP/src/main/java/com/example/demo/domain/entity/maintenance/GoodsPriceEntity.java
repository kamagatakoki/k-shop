package com.example.demo.domain.entity.maintenance;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
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
 * クラスの説明：商品価格マスタエンティティ
 * @author kamagata
 * @since 2018/01/16
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GOODS_PRICE")
@EntityListeners(AuditingEntityListener.class)
@Component
public class GoodsPriceEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：商品価格コード
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Id
	@Column(length = 12)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GOODS_PRICE_GEN")
	@SequenceGenerator(name = "SEQ_GOODS_PRICE_GEN", sequenceName = "SEQ_GOODS_PRICE", allocationSize = 1)
	private Integer goodsPriceCd;

	/**
	 * フィールドの説明：適用開始日
	 * @author kamagata
	 * @since 2018/01/29
	 */
	@Column(nullable = false)
	@Convert(converter = LocalDateConverter.class)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate applyDtFrom;

	/**
	 * フィールドの説明：適用終了日
	 * @author kamagata
	 * @since 2018/01/29
	 */
	@Column(nullable = false)
	@Convert(converter = LocalDateConverter.class)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate applyDtTo;

	/**
	 * フィールドの説明：商品マスタエンティティ
	 * @author kamagata
	 * @since 2018/01/28
	 */
	@Autowired
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "goodsCd")
	private GoodsEntity goodsEntityForGoodsPrice;

}
