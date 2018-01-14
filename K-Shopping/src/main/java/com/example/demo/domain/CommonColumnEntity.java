package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

/**
 * クラスの説明：共通カラムエンティティ
 * @author kamagata
 * @since 2018/01/09
 */
@MappedSuperclass
@Data
public class CommonColumnEntity {

	/**
	 * フィールドの説明：備考
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(length = 100)
	private String biko;

	/**
	 * フィールドの説明：削除区分
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(nullable = false, insertable = false, updatable = false)
	@Generated(GenerationTime.ALWAYS)
	@ColumnDefault("0")
	private String deleteFlg;

	/**
	 * フィールドの説明：登録日
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(updatable = false)
	@CreatedDate
	private Date insertDt;

	/**
	 * フィールドの説明：登録者
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(updatable = false)
	@CreatedBy
	private String insertCd;

	/**
	 * フィールドの説明：更新日
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(insertable = false)
	@LastModifiedDate
	private Date updateDt;

	/**
	 * フィールドの説明：更新者
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(insertable = false)
	@LastModifiedBy
	private String updateCd;

}
