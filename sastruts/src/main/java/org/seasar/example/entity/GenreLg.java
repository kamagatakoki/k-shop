package org.seasar.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * GenreLgエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 12:11:43")
public class GenreLg implements Serializable {

    private static final long serialVersionUID = 1L;

    /** genreLgCdプロパティ */
    @Id
    @Column(length = 2, nullable = false, unique = true)
    public String genreLgCd;

    /** genreLgNmプロパティ */
    @Column(length = 100, nullable = false, unique = false)
    public String genreLgNm;

    /** displayOrderプロパティ */
    @Column(precision = 3, nullable = false, unique = false)
    public Short displayOrder;

    /** bikoプロパティ */
    @Column(length = 200, nullable = true, unique = false)
    public String biko;

    /** deleteFlgプロパティ */
    @Column(length = 1, nullable = false, unique = false)
    public String deleteFlg;

    /** insertDtプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insertDt;

    /** insertCdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Long insertCd;

    /** updateDtプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp updateDt;

    /** updateCdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Long updateCd;

    /** genreMdList関連プロパティ */
    @OneToMany(mappedBy = "genreLg")
    public List<GenreMd> genreMdList;

    /** genreSmList関連プロパティ */
    @OneToMany(mappedBy = "genreLg")
    public List<GenreSm> genreSmList;
}