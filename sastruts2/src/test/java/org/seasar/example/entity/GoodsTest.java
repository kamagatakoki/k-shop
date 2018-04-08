package org.seasar.example.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static org.seasar.example.entity.GoodsNames.*;

/**
 * {@link Goods}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2018/03/31 19:40:43")
public class GoodsTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Goods.class).id("aaa").getSingleResult();
    }

    /**
     * goodsPriceListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_goodsPriceList() throws Exception {
        jdbcManager.from(Goods.class).leftOuterJoin(goodsPriceList()).id("aaa").getSingleResult();
    }
}