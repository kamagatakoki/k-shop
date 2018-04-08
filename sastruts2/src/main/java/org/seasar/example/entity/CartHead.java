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
 * CartHeadエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/03/31 19:40:40")
public class CartHead implements Serializable {

    private static final long serialVersionUID = 1L;

    /** cartHeadCdプロパティ */
    @Id
    @Column(length = 10, nullable = false, unique = true)
    public String cartHeadCd;

    /** userCdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Long userCd;

    /** sessionIdプロパティ */
    @Column(length = 100, nullable = true, unique = false)
    public String sessionId;

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

    /** cartDetailList関連プロパティ */
    @OneToMany(mappedBy = "cartHead")
    public List<CartDetail> cartDetailList;
}