package com.example.sample.domain.entity.common;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * クラスの説明：共通カラムエンティティ
 * @author kamagata
 * @since 2018/01/09
 */
@Data
@NoArgsConstructor
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
	@Value("0")
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
	private Long insertCd;

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
	private Long updateCd;

}
