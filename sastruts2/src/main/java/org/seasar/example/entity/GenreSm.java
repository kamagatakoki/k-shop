package org.seasar.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * GenreSmエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 19:40:40")
public class GenreSm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** genreSmCdプロパティ */
    @Id
    @Column(length = 6, nullable = false, unique = true)
    public String genreSmCd;

    /** genreSmNmプロパティ */
    @Column(length = 100, nullable = false, unique = false)
    public String genreSmNm;

    /** displayOrderプロパティ */
    @Column(precision = 2, nullable = false, unique = false)
    public Short displayOrder;

    /** genreLgCdプロパティ */
    @Column(length = 2, nullable = false, unique = false)
    public String genreLgCd;

    /** genreMdCdプロパティ */
    @Column(length = 4, nullable = false, unique = false)
    public String genreMdCd;

    /** bikoプロパティ */
    @Column(length = 200, nullable = true, unique = false)
    public String biko;

    /** deleteFlgプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String deleteFlg;

    /** insertCdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Long insertCd;

    /** insertDtプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp insertDt;

    /** updateCdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Long updateCd;

    /** updateDtプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp updateDt;

    /** genreLg関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "GENRE_LG_CD", referencedColumnName = "GENRE_LG_CD")
    public GenreLg genreLg;

    /** genreMd関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "GENRE_MD_CD", referencedColumnName = "GENRE_MD_CD")
    public GenreMd genreMd;
}