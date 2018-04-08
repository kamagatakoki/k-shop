package org.seasar.example.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import org.seasar.example.entity.GoodsPriceNames._GoodsPriceNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Goods}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 19:40:41")
public class GoodsNames {

    /**
     * goodsCdのプロパティ名を返します。
     * 
     * @return goodsCdのプロパティ名
     */
    public static PropertyName<String> goodsCd() {
        return new PropertyName<String>("goodsCd");
    }

    /**
     * goodsNmのプロパティ名を返します。
     * 
     * @return goodsNmのプロパティ名
     */
    public static PropertyName<String> goodsNm() {
        return new PropertyName<String>("goodsNm");
    }

    /**
     * subGoodsNmのプロパティ名を返します。
     * 
     * @return subGoodsNmのプロパティ名
     */
    public static PropertyName<String> subGoodsNm() {
        return new PropertyName<String>("subGoodsNm");
    }

    /**
     * genreLgCdのプロパティ名を返します。
     * 
     * @return genreLgCdのプロパティ名
     */
    public static PropertyName<String> genreLgCd() {
        return new PropertyName<String>("genreLgCd");
    }

    /**
     * genreMdCdのプロパティ名を返します。
     * 
     * @return genreMdCdのプロパティ名
     */
    public static PropertyName<String> genreMdCd() {
        return new PropertyName<String>("genreMdCd");
    }

    /**
     * genreSmCdのプロパティ名を返します。
     * 
     * @return genreSmCdのプロパティ名
     */
    public static PropertyName<String> genreSmCd() {
        return new PropertyName<String>("genreSmCd");
    }

    /**
     * overviewのプロパティ名を返します。
     * 
     * @return overviewのプロパティ名
     */
    public static PropertyName<String> overview() {
        return new PropertyName<String>("overview");
    }

    /**
     * detailのプロパティ名を返します。
     * 
     * @return detailのプロパティ名
     */
    public static PropertyName<String> detail() {
        return new PropertyName<String>("detail");
    }

    /**
     * releaseDtのプロパティ名を返します。
     * 
     * @return releaseDtのプロパティ名
     */
    public static PropertyName<Date> releaseDt() {
        return new PropertyName<Date>("releaseDt");
    }

    /**
     * makerのプロパティ名を返します。
     * 
     * @return makerのプロパティ名
     */
    public static PropertyName<String> maker() {
        return new PropertyName<String>("maker");
    }

    /**
     * goodsSizeのプロパティ名を返します。
     * 
     * @return goodsSizeのプロパティ名
     */
    public static PropertyName<String> goodsSize() {
        return new PropertyName<String>("goodsSize");
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
     * goodsPriceListのプロパティ名を返します。
     * 
     * @return goodsPriceListのプロパティ名
     */
    public static _GoodsPriceNames goodsPriceList() {
        return new _GoodsPriceNames("goodsPriceList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _GoodsNames extends PropertyName<Goods> {

        /**
         * インスタンスを構築します。
         */
        public _GoodsNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _GoodsNames(final String name) {
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
        public _GoodsNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * goodsNmのプロパティ名を返します。
         *
         * @return goodsNmのプロパティ名
         */
        public PropertyName<String> goodsNm() {
            return new PropertyName<String>(this, "goodsNm");
        }

        /**
         * subGoodsNmのプロパティ名を返します。
         *
         * @return subGoodsNmのプロパティ名
         */
        public PropertyName<String> subGoodsNm() {
            return new PropertyName<String>(this, "subGoodsNm");
        }

        /**
         * genreLgCdのプロパティ名を返します。
         *
         * @return genreLgCdのプロパティ名
         */
        public PropertyName<String> genreLgCd() {
            return new PropertyName<String>(this, "genreLgCd");
        }

        /**
         * genreMdCdのプロパティ名を返します。
         *
         * @return genreMdCdのプロパティ名
         */
        public PropertyName<String> genreMdCd() {
            return new PropertyName<String>(this, "genreMdCd");
        }

        /**
         * genreSmCdのプロパティ名を返します。
         *
         * @return genreSmCdのプロパティ名
         */
        public PropertyName<String> genreSmCd() {
            return new PropertyName<String>(this, "genreSmCd");
        }

        /**
         * overviewのプロパティ名を返します。
         *
         * @return overviewのプロパティ名
         */
        public PropertyName<String> overview() {
            return new PropertyName<String>(this, "overview");
        }

        /**
         * detailのプロパティ名を返します。
         *
         * @return detailのプロパティ名
         */
        public PropertyName<String> detail() {
            return new PropertyName<String>(this, "detail");
        }

        /**
         * releaseDtのプロパティ名を返します。
         *
         * @return releaseDtのプロパティ名
         */
        public PropertyName<Date> releaseDt() {
            return new PropertyName<Date>(this, "releaseDt");
        }

        /**
         * makerのプロパティ名を返します。
         *
         * @return makerのプロパティ名
         */
        public PropertyName<String> maker() {
            return new PropertyName<String>(this, "maker");
        }

        /**
         * goodsSizeのプロパティ名を返します。
         *
         * @return goodsSizeのプロパティ名
         */
        public PropertyName<String> goodsSize() {
            return new PropertyName<String>(this, "goodsSize");
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
         * goodsPriceListのプロパティ名を返します。
         * 
         * @return goodsPriceListのプロパティ名
         */
        public _GoodsPriceNames goodsPriceList() {
            return new _GoodsPriceNames(this, "goodsPriceList");
        }
    }
}