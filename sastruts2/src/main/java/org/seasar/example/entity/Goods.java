package org.seasar.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Goodsエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 19:40:40")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /** goodsCdプロパティ */
    @Id
    @Column(length = 10, nullable = false, unique = true)
    public String goodsCd;

    /** goodsNmプロパティ */
    @Column(length = 200, nullable = false, unique = false)
    public String goodsNm;

    /** subGoodsNmプロパティ */
    @Column(length = 200, nullable = true, unique = false)
    public String subGoodsNm;

    /** genreLgCdプロパティ */
    @Column(length = 2, nullable = false, unique = false)
    public String genreLgCd;

    /** genreMdCdプロパティ */
    @Column(length = 4, nullable = false, unique = false)
    public String genreMdCd;

    /** genreSmCdプロパティ */
    @Column(length = 6, nullable = false, unique = false)
    public String genreSmCd;

    /** overviewプロパティ */
    @Column(length = 1000, nullable = false, unique = false)
    public String overview;

    /** detailプロパティ */
    @Column(length = 4000, nullable = false, unique = false)
    public String detail;

    /** releaseDtプロパティ */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, unique = false)
    public Date releaseDt;

    /** makerプロパティ */
    @Column(length = 200, nullable = false, unique = false)
    public String maker;

    /** goodsSizeプロパティ */
    @Column(length = 1, nullable = false, unique = false)
    public String goodsSize;

    /** bikoプロパティ */
    @Column(length = 100, nullable = true, unique = false)
    public String biko;

    /** deleteFlgプロパティ */
    @Column(length = 1, nullable = false, unique = false)
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

    /** goodsPriceList関連プロパティ */
    @OneToMany(mappedBy = "goods")
    public List<GoodsPrice> goodsPriceList;
}