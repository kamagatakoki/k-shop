package com.example.demo.domain.entity.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.demo.domain.entity.CommonColumnEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：小ジャンルマスタエンティティ
 * @author kamagata
 * @since 2018/01/14
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GENRE_SM")
@EntityListeners(AuditingEntityListener.class)
public class GenreSmEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：小ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@Id
	@Column(length = 6)
	private String genreSmCd;

	/**
	 * フィールドの説明：小ジャンル名称
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@Column(nullable = false, length = 100)
	private String genreSmNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@Column(nullable = false, length = 2)
	private Integer displayOrder;

	/**
	 * フィールドの説明：大ジャンルエンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "genreLgCd")
	private GenreLgEntity genreLgEntity;

	/**
	 * フィールドの説明：中ジャンルエンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "genreMdCd")
	private GenreMdEntity genreMdEntity;

}
