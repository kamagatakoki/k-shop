package org.seasar.example.service;

import java.util.List;
import javax.annotation.Generated;
import org.seasar.example.entity.UserInfo;

import static org.seasar.example.entity.UserInfoNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link UserInfo}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/03/31 19:40:43")
public class UserInfoService extends AbstractService<UserInfo> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userCd
     *            識別子
     * @return エンティティ
     */
    public UserInfo findById(Long userCd) {
        return select().id(userCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<UserInfo> findAllOrderById() {
        return select().orderBy(asc(userCd())).getResultList();
    }
}