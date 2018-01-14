package com.example.demo.domain.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.demo.domain.CommonColumnEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * タイプの説明：
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
public class GenreLgEntity extends CommonColumnEntity implements Serializable {

	/**
	 * フィールドの説明：ジャンル大コード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GENRE_LG_CD_GEN")
	@SequenceGenerator(name = "SEQ_GENRE_LG_CD_GEN", sequenceName = "SEQ_GENRE_LG_CD", allocationSize = 1)
	private Integer genreLgCd;

	/**
	 * フィールドの説明：ジャンル名
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(nullable = false, length = 50)
	private String genreNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/06
	 */
	@Column(nullable = false, length = 3, unique = true)
	private Integer displayOrder;

}
