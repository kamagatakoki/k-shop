package jp.co.jreast.common.enums;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.exceptions.JresApplicationException;
import jp.co.jreast.common.interfaces.DFacilityManageData;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * 施設付帯情報詳細イベント列挙型
 * 
 * <pre>
 *   機能概要 ： 施設付帯情報で行われるイベント（操作）を一意に列挙します。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public enum DFacilityManageEvent {

    /** 施設・初期表示 */
    FAC_OPEN {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_MIKAIFU:

                return DJreConstants.FPSTATUS_KAIFU;

            default:
                return outOfRange(data);
            }
        }
    },

    /** 施設・承認依頼 */
    FAC_REQUEST_APPROVE {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHINKI:
            case DJreConstants.FPSTATUS_KAIFU:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU:
            case DJreConstants.FPSTATUS_SASHIMODOSHI:

                return DJreConstants.FPSTATUS_SHONINMACHI;

            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI:
            case DJreConstants.FPSTATUS_SASHIMODOSHI_SAI:

                return DJreConstants.FPSTATUS_SHONINMACHI_SAI;

            default:
                return outOfRange(data);
            }
        }
    },

    /** 施設・一時保存 */
    FAC_TEMPSAVE {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHINKI:
            case DJreConstants.FPSTATUS_KAIFU:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU:
            case DJreConstants.FPSTATUS_SASHIMODOSHI:

                if (data.isValid()) {
                    return DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU;
                } else {
                    return DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU;
                }

            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI:
            case DJreConstants.FPSTATUS_SASHIMODOSHI_SAI:

                if (data.isValid()) {
                    return DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_SAI;
                } else {
                    return DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU_SAI;
                }

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・承認 */
    JRE_APPROVE {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();
            Integer sendDiv = data.getSendDiv();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHONINMACHI:

                return DJreConstants.FPSTATUS_SHONINZUMI;

            case DJreConstants.FPSTATUS_SAIHENSHUCHU_SAI:
            case DJreConstants.FPSTATUS_SHONINMACHI_SAI:

                return DJreConstants.FPSTATUS_SHONINZUMI_SAI;

            case DJreConstants.FPSTATUS_SASHIMODOSHI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU:

                if (DKikakuWebUtil.isFaxSend(sendDiv)) {
                    return DJreConstants.FPSTATUS_SHONINZUMI;
                } else {
                    return outOfRange(data);
                }

            case DJreConstants.FPSTATUS_SASHIMODOSHI_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI:

                if (DKikakuWebUtil.isFaxSend(sendDiv)) {
                    return DJreConstants.FPSTATUS_SHONINZUMI_SAI;
                } else {
                    return DJreConstants.FPSTATUS_SHONINZUMI_SAI;
                }

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・造成WEB連携 */
    JRE_DATA_COORDINATION {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHONINZUMI:

                return DJreConstants.FPSTATUS_ZOUSEIRENKEIMACHI;

            case DJreConstants.FPSTATUS_SHONINZUMI_SAI:

                return DJreConstants.FPSTATUS_ZOUSEIRENKEIMACHI_SAI;

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・送信済データ再編集 */
    JRE_RE_EDITING {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_ZOUSEIRENKEIZUMI:
            case DJreConstants.FPSTATUS_ZOUSEIRENKEIZUMI_SAI:

                return DJreConstants.FPSTATUS_SAIHENSHUCHU_SAI;

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・差戻し */
    JRE_REMAND {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHONINMACHI:

                return DJreConstants.FPSTATUS_SASHIMODOSHI;

            case DJreConstants.FPSTATUS_SAIHENSHUCHU_SAI:
            case DJreConstants.FPSTATUS_SHONINMACHI_SAI:

                return DJreConstants.FPSTATUS_SASHIMODOSHI_SAI;

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・入力依頼（EMail） */
    JRE_REQUEST_INPUT_EMAIL {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHINKI:
            case DJreConstants.FPSTATUS_SAKUSEI:
            case DJreConstants.FPSTATUS_SAKUSEI_HORYU:
            case DJreConstants.FPSTATUS_SOUSHINERROR:
                // 未開封 で再送信した場合
            case DJreConstants.FPSTATUS_MIKAIFU:

                if (data.isSendFailuer()) {
                    return DJreConstants.FPSTATUS_SOUSHINERROR;
                }

                return DJreConstants.FPSTATUS_MIKAIFU;

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・入力依頼（FAX施設） */
    JRE_REQUEST_INPUT_FAX {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHINKI:
            case DJreConstants.FPSTATUS_SAKUSEI:
            case DJreConstants.FPSTATUS_SAKUSEI_HORYU:
            case DJreConstants.FPSTATUS_SOUSHINERROR:

                return DJreConstants.FPSTATUS_SOUSHINMACHI;

            default:
                return outOfRange(data);
            }
        }
    },

    /** JRE・一時保存 */
    JRE_TEMPSAVE {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHINKI:
            case DJreConstants.FPSTATUS_SAKUSEI:
            case DJreConstants.FPSTATUS_SAKUSEI_HORYU:
            case DJreConstants.FPSTATUS_SOUSHINERROR:

                if (data.isValid()) {
                    return DJreConstants.FPSTATUS_SAKUSEI;
                } else {
                    return DJreConstants.FPSTATUS_SAKUSEI_HORYU;
                }

            case DJreConstants.FPSTATUS_KAIFU:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU:

                if (data.isValid()) {
                    return DJreConstants.FPSTATUS_JR_TOUROKUCHU;
                } else {
                    return DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU;
                }

            case DJreConstants.FPSTATUS_SASHIMODOSHI:

                return DJreConstants.FPSTATUS_SASHIMODOSHI;

            case DJreConstants.FPSTATUS_SAIHENSHUCHU_SAI:

                return DJreConstants.FPSTATUS_SAIHENSHUCHU_SAI;

            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_SHISETSU_TOUROKUCHU_HORYU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHU_SAI:
            case DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI:

                if (data.isValid()) {
                    return DJreConstants.FPSTATUS_JR_TOUROKUCHU_SAI;
                } else {
                    return DJreConstants.FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI;
                }

            case DJreConstants.FPSTATUS_SASHIMODOSHI_SAI:

                return DJreConstants.FPSTATUS_SASHIMODOSHI_SAI;

            default:
                return outOfRange(data);
            }
        }
    };

    /**
     * 次の「施設パターン状態」を取得します。
     * 
     * <pre></pre>
     * 
     * @param data
     *            現在の「施設パターン状態」
     * @return 次の「施設パターン状態」
     */
    public abstract Integer getNextFpStatus(DFacilityManageData data);

    /**
     * 「施設パターン状態」範囲外処理。
     * 
     * <pre>
     * 次の「施設パターン状態」を判定した際に、現在の「施設パターン状態」が想定外の値であった場合に実行される処理です。
     * </pre>
     * 
     * @param data
     *            現在の「施設パターン状態」
     * @return 次の「施設パターン状態」
     */
    protected Integer outOfRange(DFacilityManageData data) {
        Integer currentFpStatus = data.getFpStatus();
        throw new JresApplicationException("illegal status " + currentFpStatus
                + " at " + this.name());
    }

}
