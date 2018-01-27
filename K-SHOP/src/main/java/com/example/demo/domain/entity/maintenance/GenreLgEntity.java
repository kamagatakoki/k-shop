package com.example.demo.domain.entity.maintenance;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import com.example.demo.domain.entity.CommonColumnEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * タイプの説明：大ジャンルマスタエンティティ
 * @author kamagata
 * @since 2018/01/06
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GENRE_LG")
@EntityListeners(AuditingEntityListener.class)
@Component
public class GenreLgEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@Id
	private String genreLgCd;

	/**
	 * フィールドの説明：大ジャンル名
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(nullable = false, length = 50)
	private String genreLgNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(nullable = false, length = 3)
	private Integer displayOrder;

	/**
	 * フィールドの説明：紐付く中ジャンルエンティティのリスト
	 * @author kamagata
	 * @since 2018/01/23
	 */
	@OneToMany(mappedBy = "genreLgEntity")
	private List<GenreMdEntity> genreMdEntities;
}
