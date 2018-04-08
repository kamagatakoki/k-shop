package org.seasar.example.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.example.entity.GoodsNames._GoodsNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link GoodsPrice}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 12:11:44")
public class GoodsPriceNames {

    /**
     * goodsPriceCdのプロパティ名を返します。
     * 
     * @return goodsPriceCdのプロパティ名
     */
    public static PropertyName<String> goodsPriceCd() {
        return new PropertyName<String>("goodsPriceCd");
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
     * applyDtFromのプロパティ名を返します。
     * 
     * @return applyDtFromのプロパティ名
     */
    public static PropertyName<Date> applyDtFrom() {
        return new PropertyName<Date>("applyDtFrom");
    }

    /**
     * applyDtToのプロパティ名を返します。
     * 
     * @return applyDtToのプロパティ名
     */
    public static PropertyName<Date> applyDtTo() {
        return new PropertyName<Date>("applyDtTo");
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
     * goodsのプロパティ名を返します。
     * 
     * @return goodsのプロパティ名
     */
    public static _GoodsNames goods() {
        return new _GoodsNames("goods");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _GoodsPriceNames extends PropertyName<GoodsPrice> {

        /**
         * インスタンスを構築します。
         */
        public _GoodsPriceNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _GoodsPriceNames(final String name) {
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
        public _GoodsPriceNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * goodsPriceCdのプロパティ名を返します。
         *
         * @return goodsPriceCdのプロパティ名
         */
        public PropertyName<String> goodsPriceCd() {
            return new PropertyName<String>(this, "goodsPriceCd");
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
         * applyDtFromのプロパティ名を返します。
         *
         * @return applyDtFromのプロパティ名
         */
        public PropertyName<Date> applyDtFrom() {
            return new PropertyName<Date>(this, "applyDtFrom");
        }

        /**
         * applyDtToのプロパティ名を返します。
         *
         * @return applyDtToのプロパティ名
         */
        public PropertyName<Date> applyDtTo() {
            return new PropertyName<Date>(this, "applyDtTo");
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
         * goodsのプロパティ名を返します。
         * 
         * @return goodsのプロパティ名
         */
        public _GoodsNames goods() {
            return new _GoodsNames(this, "goods");
        }
    }
}