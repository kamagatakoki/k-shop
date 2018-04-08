package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.CartHead;

import static org.seasar.example.entity.CartHeadNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link CartHead}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 19:40:43")
public class CartHeadService extends AbstractService<CartHead> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param cartHeadCd
     *            識別子
     * @return エンティティ
     */
    public CartHead findById(String cartHeadCd) {
        return select().id(cartHeadCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<CartHead> findAllOrderById() {
        return select().orderBy(asc(cartHeadCd())).getResultList();
    }
}