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
import com.example.demo.domain.entity.maintenance.UserInfoEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：カート(ヘッダー)エンティティ
 * @author kamagata
 * @since 2018/01/28
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CART_HEAD")
@EntityListeners(AuditingEntityListener.class)
public class CartHeadEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：カートコード
	 * @author kamagata
	 * @since 2018/01/28
	 */
	@Id
	@Column(nullable = false, length = 10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CART_HEAD_GEN")
	@SequenceGenerator(name = "SEQ_CART_HEAD_GEN", sequenceName = "SEQ_CART_HEAD", allocationSize = 1)
	private Integer cartHeadCd;

	/**
	 * フィールドの説明：セッションID
	 * @author kamagata
	 * @since 2018/02/02
	 */
	private String sessionId;

	/**
	 * フィールドの説明：ユーザー情報エンティティ
	 * @author kamagata
	 * @since 2018/01/29
	 */
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "userCd")
	private UserInfoEntity userInfoEntity;

}
