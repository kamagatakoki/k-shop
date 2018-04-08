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
 * CartDetailエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 12:11:43")
public class CartDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** cartDetailCdプロパティ */
    @Id
    @Column(length = 10, nullable = false, unique = true)
    public String cartDetailCd;

    /** cartHeadCdプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String cartHeadCd;

    /** goodsCdプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String goodsCd;

    /** quantityプロパティ */
    @Column(precision = 4, nullable = false, unique = false)
    public Short quantity;

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

    /** cartHead関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "CART_HEAD_CD", referencedColumnName = "CART_HEAD_CD")
    public CartHead cartHead;
}