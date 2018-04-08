package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;

/**
 * GenreLgエンティティクラス
 *
 */
@Data
public class GenreLg implements Serializable {

	private static final long serialVersionUID = 1L;

	/** genreLgCdプロパティ */
	private String genreLgCd;

	/** genreLgNmプロパティ */
	private String genreLgNm;

	/** displayOrderプロパティ */
	private Integer displayOrder;

	/** bikoプロパティ */
	private String biko;

	/** deleteFlgプロパティ */
	private String deleteFlg;

	/** insertDtプロパティ */
	private Timestamp insertDt;

	/** insertCdプロパティ */
	private Long insertCd;

	/** updateDtプロパティ */
	private Timestamp updateDt;

	/** updateCdプロパティ */
	private Long updateCd;

}