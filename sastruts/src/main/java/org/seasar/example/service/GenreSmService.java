package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.GenreSm;

import static org.seasar.example.entity.GenreSmNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link GenreSm}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 12:11:45")
public class GenreSmService extends AbstractService<GenreSm> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param genreSmCd
     *            識別子
     * @return エンティティ
     */
    public GenreSm findById(String genreSmCd) {
        return select().id(genreSmCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<GenreSm> findAllOrderById() {
        return select().orderBy(asc(genreSmCd())).getResultList();
    }
}