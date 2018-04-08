package org.seasar.example.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.example.entity.GenreMdNames._GenreMdNames;
import org.seasar.example.entity.GenreSmNames._GenreSmNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link GenreLg}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 19:40:41")
public class GenreLgNames {

    /**
     * genreLgCdのプロパティ名を返します。
     * 
     * @return genreLgCdのプロパティ名
     */
    public static PropertyName<String> genreLgCd() {
        return new PropertyName<String>("genreLgCd");
    }

    /**
     * genreLgNmのプロパティ名を返します。
     * 
     * @return genreLgNmのプロパティ名
     */
    public static PropertyName<String> genreLgNm() {
        return new PropertyName<String>("genreLgNm");
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
     * insertDtのプロパティ名を返します。
     * 
     * @return insertDtのプロパティ名
     */
    public static PropertyName<Timestamp> insertDt() {
        return new PropertyName<Timestamp>("insertDt");
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
     * updateDtのプロパティ名を返します。
     * 
     * @return updateDtのプロパティ名
     */
    public static PropertyName<Timestamp> updateDt() {
        return new PropertyName<Timestamp>("updateDt");
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
     * genreMdListのプロパティ名を返します。
     * 
     * @return genreMdListのプロパティ名
     */
    public static _GenreMdNames genreMdList() {
        return new _GenreMdNames("genreMdList");
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
    public static class _GenreLgNames extends PropertyName<GenreLg> {

        /**
         * インスタンスを構築します。
         */
        public _GenreLgNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _GenreLgNames(final String name) {
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
        public _GenreLgNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * genreLgNmのプロパティ名を返します。
         *
         * @return genreLgNmのプロパティ名
         */
        public PropertyName<String> genreLgNm() {
            return new PropertyName<String>(this, "genreLgNm");
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
         * insertDtのプロパティ名を返します。
         *
         * @return insertDtのプロパティ名
         */
        public PropertyName<Timestamp> insertDt() {
            return new PropertyName<Timestamp>(this, "insertDt");
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
         * updateDtのプロパティ名を返します。
         *
         * @return updateDtのプロパティ名
         */
        public PropertyName<Timestamp> updateDt() {
            return new PropertyName<Timestamp>(this, "updateDt");
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
         * genreMdListのプロパティ名を返します。
         * 
         * @return genreMdListのプロパティ名
         */
        public _GenreMdNames genreMdList() {
            return new _GenreMdNames(this, "genreMdList");
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