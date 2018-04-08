package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.GenreMd;

import static org.seasar.example.entity.GenreMdNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link GenreMd}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class GenreMdService extends AbstractService<GenreMd> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param genreMdCd
     *            識別子
     * @return エンティティ
     */
    public GenreMd findById(String genreMdCd) {
        return select().id(genreMdCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<GenreMd> findAllOrderById() {
        return select().orderBy(asc(genreMdCd())).getResultList();
    }
}