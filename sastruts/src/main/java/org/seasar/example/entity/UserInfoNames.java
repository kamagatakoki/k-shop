package org.seasar.example.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link UserInfo}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/03/31 12:11:44")
public class UserInfoNames {

    /**
     * userCdのプロパティ名を返します。
     * 
     * @return userCdのプロパティ名
     */
    public static PropertyName<Long> userCd() {
        return new PropertyName<Long>("userCd");
    }

    /**
     * firstNmのプロパティ名を返します。
     * 
     * @return firstNmのプロパティ名
     */
    public static PropertyName<String> firstNm() {
        return new PropertyName<String>("firstNm");
    }

    /**
     * lastNmのプロパティ名を返します。
     * 
     * @return lastNmのプロパティ名
     */
    public static PropertyName<String> lastNm() {
        return new PropertyName<String>("lastNm");
    }

    /**
     * emailのプロパティ名を返します。
     * 
     * @return emailのプロパティ名
     */
    public static PropertyName<String> email() {
        return new PropertyName<String>("email");
    }

    /**
     * phoneのプロパティ名を返します。
     * 
     * @return phoneのプロパティ名
     */
    public static PropertyName<Long> phone() {
        return new PropertyName<Long>("phone");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * authのプロパティ名を返します。
     * 
     * @return authのプロパティ名
     */
    public static PropertyName<String> auth() {
        return new PropertyName<String>("auth");
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
     * @author S2JDBC-Gen
     */
    public static class _UserInfoNames extends PropertyName<UserInfo> {

        /**
         * インスタンスを構築します。
         */
        public _UserInfoNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UserInfoNames(final String name) {
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
        public _UserInfoNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * firstNmのプロパティ名を返します。
         *
         * @return firstNmのプロパティ名
         */
        public PropertyName<String> firstNm() {
            return new PropertyName<String>(this, "firstNm");
        }

        /**
         * lastNmのプロパティ名を返します。
         *
         * @return lastNmのプロパティ名
         */
        public PropertyName<String> lastNm() {
            return new PropertyName<String>(this, "lastNm");
        }

        /**
         * emailのプロパティ名を返します。
         *
         * @return emailのプロパティ名
         */
        public PropertyName<String> email() {
            return new PropertyName<String>(this, "email");
        }

        /**
         * phoneのプロパティ名を返します。
         *
         * @return phoneのプロパティ名
         */
        public PropertyName<Long> phone() {
            return new PropertyName<Long>(this, "phone");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * authのプロパティ名を返します。
         *
         * @return authのプロパティ名
         */
        public PropertyName<String> auth() {
            return new PropertyName<String>(this, "auth");
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
    }
}