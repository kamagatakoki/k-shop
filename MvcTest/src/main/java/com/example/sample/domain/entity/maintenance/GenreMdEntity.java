package com.example.sample.domain.entity.maintenance;

import java.io.Serializable;

import com.example.sample.domain.entity.common.CommonColumnEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * クラスの説明：中ジャンルエンティティ
 * @author kamagata
 * @since 2018/02/15
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table GENRE_MD
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class GenreMdEntity extends CommonColumnEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GENRE_MD.GENRE_MD_CD
	 * @mbg.generated
	 */
	private String genreMdCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GENRE_MD.GENRE_MD_NM
	 * @mbg.generated
	 */
	private String genreMdNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GENRE_MD.DISPLAY_ORDER
	 * @mbg.generated
	 */
	private Integer displayOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GENRE_MD.GENRE_LG_CD
	 * @mbg.generated
	 */
	private String genreLgCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table GENRE_MD
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * フィールドの説明：大ジャンルエンティティ
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private GenreLgEntity genreLgEntity;
}