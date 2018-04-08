package org.seasar.example.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link GoodsImage}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 19:40:41")
public class GoodsImageNames {

    /**
     * goodsImageCdのプロパティ名を返します。
     * 
     * @return goodsImageCdのプロパティ名
     */
    public static PropertyName<Long> goodsImageCd() {
        return new PropertyName<Long>("goodsImageCd");
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
     * fileNmのプロパティ名を返します。
     * 
     * @return fileNmのプロパティ名
     */
    public static PropertyName<String> fileNm() {
        return new PropertyName<String>("fileNm");
    }

    /**
     * imageのプロパティ名を返します。
     * 
     * @return imageのプロパティ名
     */
    public static PropertyName<byte[]> image() {
        return new PropertyName<byte[]>("image");
    }

    /**
     * descriptionのプロパティ名を返します。
     * 
     * @return descriptionのプロパティ名
     */
    public static PropertyName<String> description() {
        return new PropertyName<String>("description");
    }

    /**
     * displayOrderのプロパティ名を返します。
     * 
     * @return displayOrderのプロパティ名
     */
    public static PropertyName<Short> displayOrder() {
        return new PropertyName<Short>("displayOrder");
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
     * @author S2JDBC-Gen
     */
    public static class _GoodsImageNames extends PropertyName<GoodsImage> {

        /**
         * インスタンスを構築します。
         */
        public _GoodsImageNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _GoodsImageNames(final String name) {
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
        public _GoodsImageNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * goodsImageCdのプロパティ名を返します。
         *
         * @return goodsImageCdのプロパティ名
         */
        public PropertyName<Long> goodsImageCd() {
            return new PropertyName<Long>(this, "goodsImageCd");
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
         * fileNmのプロパティ名を返します。
         *
         * @return fileNmのプロパティ名
         */
        public PropertyName<String> fileNm() {
            return new PropertyName<String>(this, "fileNm");
        }

        /**
         * imageのプロパティ名を返します。
         *
         * @return imageのプロパティ名
         */
        public PropertyName<byte[]> image() {
            return new PropertyName<byte[]>(this, "image");
        }

        /**
         * descriptionのプロパティ名を返します。
         *
         * @return descriptionのプロパティ名
         */
        public PropertyName<String> description() {
            return new PropertyName<String>(this, "description");
        }

        /**
         * displayOrderのプロパティ名を返します。
         *
         * @return displayOrderのプロパティ名
         */
        public PropertyName<Short> displayOrder() {
            return new PropertyName<Short>(this, "displayOrder");
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
    }
}