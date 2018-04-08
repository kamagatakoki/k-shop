package org.seasar.example.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.example.entity.CartHeadNames._CartHeadNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CartDetail}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 19:40:41")
public class CartDetailNames {

    /**
     * cartDetailCdのプロパティ名を返します。
     * 
     * @return cartDetailCdのプロパティ名
     */
    public static PropertyName<String> cartDetailCd() {
        return new PropertyName<String>("cartDetailCd");
    }

    /**
     * cartHeadCdのプロパティ名を返します。
     * 
     * @return cartHeadCdのプロパティ名
     */
    public static PropertyName<String> cartHeadCd() {
        return new PropertyName<String>("cartHeadCd");
    }

    /**
     * goodsCdのプロパティ名を返します。
     * 
     * @return goodsCdのプロパティ名
     */
    public static PropertyName<String> goodsCd() {
        return new PropertyName<String>("goodsCd");
    }

    /**
     * quantityのプロパティ名を返します。
     * 
     * @return quantityのプロパティ名
     */
    public static PropertyName<Short> quantity() {
        return new PropertyName<Short>("quantity");
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
     * cartHeadのプロパティ名を返します。
     * 
     * @return cartHeadのプロパティ名
     */
    public static _CartHeadNames cartHead() {
        return new _CartHeadNames("cartHead");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CartDetailNames extends PropertyName<CartDetail> {

        /**
         * インスタンスを構築します。
         */
        public _CartDetailNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CartDetailNames(final String name) {
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
        public _CartDetailNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * cartDetailCdのプロパティ名を返します。
         *
         * @return cartDetailCdのプロパティ名
         */
        public PropertyName<String> cartDetailCd() {
            return new PropertyName<String>(this, "cartDetailCd");
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
         * goodsCdのプロパティ名を返します。
         *
         * @return goodsCdのプロパティ名
         */
        public PropertyName<String> goodsCd() {
            return new PropertyName<String>(this, "goodsCd");
        }

        /**
         * quantityのプロパティ名を返します。
         *
         * @return quantityのプロパティ名
         */
        public PropertyName<Short> quantity() {
            return new PropertyName<Short>(this, "quantity");
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
         * cartHeadのプロパティ名を返します。
         * 
         * @return cartHeadのプロパティ名
         */
        public _CartHeadNames cartHead() {
            return new _CartHeadNames(this, "cartHead");
        }
    }
}