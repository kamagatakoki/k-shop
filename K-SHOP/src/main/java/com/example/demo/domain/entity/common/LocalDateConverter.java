package com.example.demo.domain.entity.common;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * クラスの説明：日付コンバーター(java.sql.Date⇔java.time.LocalDate)
 * @author kamagata
 * @since 2018/01/17
 */
@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	/** オーバーライドの説明：エンティティからDB登録時にjava.sql.Dateに変換する
	 * @see javax.persistence.AttributeConverter#convertToDatabaseColumn(java.lang.Object)
	 * @author kamagata
	 * @since 2018/01/17
	 * @param localDate java.time.LocalDate
	 * @return java.sql.Date
	 */
	@Override
	public Date convertToDatabaseColumn(LocalDate localDate) {
		return Date.valueOf(localDate);
	}

	/** オーバーライドの説明：DBからエンティティ取得時にjava.time.LocalDateに変換する
	 * @see javax.persistence.AttributeConverter#convertToEntityAttribute(java.lang.Object)
	 * @author kamagata
	 * @since 2018/01/17
	 * @param date java.sql.Date
	 * @return java.time.LocalDate
	 */
	@Override
	public LocalDate convertToEntityAttribute(Date date) {
		return date.toLocalDate();
	}

}
