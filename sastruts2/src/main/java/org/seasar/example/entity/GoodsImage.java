package org.seasar.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * GoodsImageエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 19:40:40")
public class GoodsImage implements Serializable {

    private static final long serialVersionUID = 1L;

    /** goodsImageCdプロパティ */
    @Id
    @Column(precision = 12, nullable = false, unique = true)
    public Long goodsImageCd;

    /** goodsCdプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String goodsCd;

    /** fileNmプロパティ */
    @Column(length = 100, nullable = false, unique = false)
    public String fileNm;

    /** imageプロパティ */
    @Lob
    @Column(length = 4000, nullable = false, unique = false)
    public byte[] image;

    /** descriptionプロパティ */
    @Column(length = 200, nullable = true, unique = false)
    public String description;

    /** displayOrderプロパティ */
    @Column(precision = 2, nullable = false, unique = false)
    public Short displayOrder;

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
}