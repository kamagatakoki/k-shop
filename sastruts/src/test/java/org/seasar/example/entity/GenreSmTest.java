package org.seasar.example.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static org.seasar.example.entity.GenreSmNames.*;

/**
 * {@link GenreSm}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2018/03/31 12:11:46")
public class GenreSmTest extends S2TestCase {

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
        jdbcManager.from(GenreSm.class).id("aaa").getSingleResult();
    }

    /**
     * genreLgとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_genreLg() throws Exception {
        jdbcManager.from(GenreSm.class).leftOuterJoin(genreLg()).id("aaa").getSingleResult();
    }

    /**
     * genreMdとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_genreMd() throws Exception {
        jdbcManager.from(GenreSm.class).leftOuterJoin(genreMd()).id("aaa").getSingleResult();
    }
}