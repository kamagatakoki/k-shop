package org.seasar.example.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static org.seasar.example.entity.GoodsPriceNames.*;

/**
 * {@link GoodsPrice}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2018/03/31 19:40:43")
public class GoodsPriceTest extends S2TestCase {

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
        jdbcManager.from(GoodsPrice.class).id("aaa").getSingleResult();
    }

    /**
     * goodsとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_goods() throws Exception {
        jdbcManager.from(GoodsPrice.class).leftOuterJoin(goods()).id("aaa").getSingleResult();
    }
}