package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.GoodsImage;

import static org.seasar.example.entity.GoodsImageNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link GoodsImage}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class GoodsImageService extends AbstractService<GoodsImage> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param goodsImageCd
     *            識別子
     * @return エンティティ
     */
    public GoodsImage findById(Long goodsImageCd) {
        return select().id(goodsImageCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<GoodsImage> findAllOrderById() {
        return select().orderBy(asc(goodsImageCd())).getResultList();
    }
}