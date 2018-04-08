package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.CartDetail;

import static org.seasar.example.entity.CartDetailNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link CartDetail}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class CartDetailService extends AbstractService<CartDetail> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param cartDetailCd
     *            識別子
     * @return エンティティ
     */
    public CartDetail findById(String cartDetailCd) {
        return select().id(cartDetailCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<CartDetail> findAllOrderById() {
        return select().orderBy(asc(cartDetailCd())).getResultList();
    }
}