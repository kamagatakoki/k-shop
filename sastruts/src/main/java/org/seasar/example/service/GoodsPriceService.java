package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.GoodsPrice;

import static org.seasar.example.entity.GoodsPriceNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link GoodsPrice}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class GoodsPriceService extends AbstractService<GoodsPrice> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param goodsPriceCd
     *            識別子
     * @return エンティティ
     */
    public GoodsPrice findById(String goodsPriceCd) {
        return select().id(goodsPriceCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<GoodsPrice> findAllOrderById() {
        return select().orderBy(asc(goodsPriceCd())).getResultList();
    }
}