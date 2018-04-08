package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.GenreLg;

import static org.seasar.example.entity.GenreLgNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link GenreLg}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class GenreLgService extends AbstractService<GenreLg> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param genreLgCd
     *            識別子
     * @return エンティティ
     */
    public GenreLg findById(String genreLgCd) {
        return select().id(genreLgCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<GenreLg> findAllOrderById() {
        return select().orderBy(asc(genreLgCd())).getResultList();
    }
}