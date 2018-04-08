package org.seasar.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * UserInfoエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 12:11:43")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userCdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Long userCd;

    /** firstNmプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String firstNm;

    /** lastNmプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String lastNm;

    /** emailプロパティ */
    @Column(length = 50, nullable = false, unique = false)
    public String email;

    /** phoneプロパティ */
    @Column(precision = 13, nullable = false, unique = false)
    public Long phone;

    /** passwordプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String password;

    /** authプロパティ */
    @Column(length = 1, nullable = false, unique = false)
    public String auth;

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
}