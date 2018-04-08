package org.seasar.example.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.example.entity.CartDetailNames._CartDetailNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CartHead}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 19:40:41")
public class CartHeadNames {

    /**
     * cartHeadCdのプロパティ名を返します。
     * 
     * @return cartHeadCdのプロパティ名
     */
    public static PropertyName<String> cartHeadCd() {
        return new PropertyName<String>("cartHeadCd");
    }

    /**
     * userCdのプロパティ名を返します。
     * 
     * @return userCdのプロパティ名
     */
    public static PropertyName<Long> userCd() {
        return new PropertyName<Long>("userCd");
    }

    /**
     * sessionIdのプロパティ名を返します。
     * 
     * @return sessionIdのプロパティ名
     */
    public static PropertyName<String> sessionId() {
        return new PropertyName<String>("sessionId");
    }

    /**
     * bikoのプロパティ名を返します。
     * 
     * @return bikoのプロパティ名
     */
    public static PropertyName<String> biko() {
        return new PropertyName<String>("biko");
    }

    /**
     * deleteFlgのプロパティ名を返します。
     * 
     * @return deleteFlgのプロパティ名
     */
    public static PropertyName<String> deleteFlg() {
        return new PropertyName<String>("deleteFlg");
    }

    /**
     * insertCdのプロパティ名を返します。
     * 
     * @return insertCdのプロパティ名
     */
    public static PropertyName<Long> insertCd() {
        return new PropertyName<Long>("insertCd");
    }

    /**
     * insertDtのプロパティ名を返します。
     * 
     * @return insertDtのプロパティ名
     */
    public static PropertyName<Timestamp> insertDt() {
        return new PropertyName<Timestamp>("insertDt");
    }

    /**
     * updateCdのプロパティ名を返します。
     * 
     * @return updateCdのプロパティ名
     */
    public static PropertyName<Long> updateCd() {
        return new PropertyName<Long>("updateCd");
    }

    /**
     * updateDtのプロパティ名を返します。
     * 
     * @return updateDtのプロパティ名
     */
    public static PropertyName<Timestamp> updateDt() {
        return new PropertyName<Timestamp>("updateDt");
    }

    /**
     * cartDetailListのプロパティ名を返します。
     * 
     * @return cartDetailListのプロパティ名
     */
    public static _CartDetailNames cartDetailList() {
        return new _CartDetailNames("cartDetailList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CartHeadNames extends PropertyName<CartHead> {

        /**
         * インスタンスを構築します。
         */
        public _CartHeadNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CartHeadNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _CartHeadNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * cartHeadCdのプロパティ名を返します。
         *
         * @return cartHeadCdのプロパティ名
         */
        public PropertyName<String> cartHeadCd() {
            return new PropertyName<String>(this, "cartHeadCd");
        }

        /**
         * userCdのプロパティ名を返します。
         *
         * @return userCdのプロパティ名
         */
        public PropertyName<Long> userCd() {
            return new PropertyName<Long>(this, "userCd");
        }

        /**
         * sessionIdのプロパティ名を返します。
         *
         * @return sessionIdのプロパティ名
         */
        public PropertyName<String> sessionId() {
            return new PropertyName<String>(this, "sessionId");
        }

        /**
         * bikoのプロパティ名を返します。
         *
         * @return bikoのプロパティ名
         */
        public PropertyName<String> biko() {
            return new PropertyName<String>(this, "biko");
        }

        /**
         * deleteFlgのプロパティ名を返します。
         *
         * @return deleteFlgのプロパティ名
         */
        public PropertyName<String> deleteFlg() {
            return new PropertyName<String>(this, "deleteFlg");
        }

        /**
         * insertCdのプロパティ名を返します。
         *
         * @return insertCdのプロパティ名
         */
        public PropertyName<Long> insertCd() {
            return new PropertyName<Long>(this, "insertCd");
        }

        /**
         * insertDtのプロパティ名を返します。
         *
         * @return insertDtのプロパティ名
         */
        public PropertyName<Timestamp> insertDt() {
            return new PropertyName<Timestamp>(this, "insertDt");
        }

        /**
         * updateCdのプロパティ名を返します。
         *
         * @return updateCdのプロパティ名
         */
        public PropertyName<Long> updateCd() {
            return new PropertyName<Long>(this, "updateCd");
        }

        /**
         * updateDtのプロパティ名を返します。
         *
         * @return updateDtのプロパティ名
         */
        public PropertyName<Timestamp> updateDt() {
            return new PropertyName<Timestamp>(this, "updateDt");
        }

        /**
         * cartDetailListのプロパティ名を返します。
         * 
         * @return cartDetailListのプロパティ名
         */
        public _CartDetailNames cartDetailList() {
            return new _CartDetailNames(this, "cartDetailList");
        }
    }
}