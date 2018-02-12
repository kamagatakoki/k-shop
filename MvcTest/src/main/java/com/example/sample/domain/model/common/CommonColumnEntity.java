package com.example.sample.domain.model.common;

import java.util.Date;

import lombok.Data;

/**
 * クラスの説明：共通カラムエンティティ
 * @author kamagata
 * @since 2018/01/09
 */
@Data
public class CommonColumnEntity {

	/**
	 * フィールドの説明：備考
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private String biko;

	/**
	 * フィールドの説明：削除区分
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private String deleteFlg;

	/**
	 * フィールドの説明：登録日
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private Date insertDt;

	/**
	 * フィールドの説明：登録者
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private Integer insertCd;

	/**
	 * フィールドの説明：更新日
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private Date updateDt;

	/**
	 * フィールドの説明：更新者
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private Integer updateCd;

}
