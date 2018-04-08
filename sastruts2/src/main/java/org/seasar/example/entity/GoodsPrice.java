package org.seasar.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsPriceエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 19:40:40")
public class GoodsPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    /** goodsPriceCdプロパティ */
    @Id
    @Column(length = 10, nullable = false, unique = true)
    public String goodsPriceCd;

    /** goodsCdプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String goodsCd;

    /** applyDtFromプロパティ */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, unique = false)
    public Date applyDtFrom;

    /** applyDtToプロパティ */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, unique = false)
    public Date applyDtTo;

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

    /** goods関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "GOODS_CD", referencedColumnName = "GOODS_CD")
    public Goods goods;
}