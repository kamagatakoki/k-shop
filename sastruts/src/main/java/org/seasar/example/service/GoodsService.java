package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.Goods;

import static org.seasar.example.entity.GoodsNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Goods}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class GoodsService extends AbstractService<Goods> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param goodsCd
     *            識別子
     * @return エンティティ
     */
    public Goods findById(String goodsCd) {
        return select().id(goodsCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Goods> findAllOrderById() {
        return select().orderBy(asc(goodsCd())).getResultList();
    }
}