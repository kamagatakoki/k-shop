package org.seasar.example.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.example.entity.GenreLgNames._GenreLgNames;
import org.seasar.example.entity.GenreSmNames._GenreSmNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link GenreMd}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 19:40:41")
public class GenreMdNames {

    /**
     * genreMdCdのプロパティ名を返します。
     * 
     * @return genreMdCdのプロパティ名
     */
    public static PropertyName<String> genreMdCd() {
        return new PropertyName<String>("genreMdCd");
    }

    /**
     * genreMdNmのプロパティ名を返します。
     * 
     * @return genreMdNmのプロパティ名
     */
    public static PropertyName<String> genreMdNm() {
        return new PropertyName<String>("genreMdNm");
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
     * genreLgCdのプロパティ名を返します。
     * 
     * @return genreLgCdのプロパティ名
     */
    public static PropertyName<String> genreLgCd() {
        return new PropertyName<String>("genreLgCd");
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
     * genreLgのプロパティ名を返します。
     * 
     * @return genreLgのプロパティ名
     */
    public static _GenreLgNames genreLg() {
        return new _GenreLgNames("genreLg");
    }

    /**
     * genreSmListのプロパティ名を返します。
     * 
     * @return genreSmListのプロパティ名
     */
    public static _GenreSmNames genreSmList() {
        return new _GenreSmNames("genreSmList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _GenreMdNames extends PropertyName<GenreMd> {

        /**
         * インスタンスを構築します。
         */
        public _GenreMdNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _GenreMdNames(final String name) {
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
        public _GenreMdNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * genreMdNmのプロパティ名を返します。
         *
         * @return genreMdNmのプロパティ名
         */
        public PropertyName<String> genreMdNm() {
            return new PropertyName<String>(this, "genreMdNm");
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
         * genreLgCdのプロパティ名を返します。
         *
         * @return genreLgCdのプロパティ名
         */
        public PropertyName<String> genreLgCd() {
            return new PropertyName<String>(this, "genreLgCd");
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
         * genreLgのプロパティ名を返します。
         * 
         * @return genreLgのプロパティ名
         */
        public _GenreLgNames genreLg() {
            return new _GenreLgNames(this, "genreLg");
        }

        /**
         * genreSmListのプロパティ名を返します。
         * 
         * @return genreSmListのプロパティ名
         */
        public _GenreSmNames genreSmList() {
            return new _GenreSmNames(this, "genreSmList");
        }
    }
}