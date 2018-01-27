package com.example.demo.domain.entity.maintenance;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import com.example.demo.domain.entity.CommonColumnEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * クラスの説明：中ジャンルマスタエンティティ
 * @author kamagata
 * @since 2018/01/13
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GENRE_MD")
@EntityListeners(AuditingEntityListener.class)
@Component
public class GenreMdEntity extends CommonColumnEntity {

	/**
	 * フィールドの説明：中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/13
	 */
	@Id
	@Column(length = 4)
	private String genreMdCd;

	/**
	 * フィールドの説明：中ジャンル名称
	 * @author kamagata
	 * @since 2018/01/13
	 */
	@Column(nullable = false, length = 100)
	private String genreMdNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/13
	 */
	@Column(nullable = false, length = 2)
	private Integer displayOrder;

	/**
	 * フィールドの説明：大ジャンルエンティティ(外部キー)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	@Autowired
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "genreLgCd")
	private GenreLgEntity genreLgEntity;

	/**
	 * フィールドの説明：紐付く小ジャンルエンティティのリスト
	 * @author kamagata
	 * @since 2018/01/23
	 */
	@OneToMany(mappedBy = "genreMdEntity")
	private List<GenreSmEntity> genreSmEntities;

}
