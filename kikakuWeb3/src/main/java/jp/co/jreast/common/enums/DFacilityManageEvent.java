package jp.co.jreast.common.enums;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.exceptions.JresApplicationException;
import jp.co.jreast.common.interfaces.DFacilityManageData;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * �{�ݕt�я��ڍ׃C�x���g�񋓌^
 * 
 * <pre>
 *   �@�\�T�v �F �{�ݕt�я��ōs����C�x���g�i����j����ӂɗ񋓂��܂��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public enum DFacilityManageEvent {

    /** �{�݁E�����\�� */
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

    /** �{�݁E���F�˗� */
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

    /** �{�݁E�ꎞ�ۑ� */
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

    /** JRE�E���F */
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

    /** JRE�E����WEB�A�g */
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

    /** JRE�E���M�σf�[�^�ĕҏW */
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

    /** JRE�E���߂� */
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

    /** JRE�E���͈˗��iEMail�j */
    JRE_REQUEST_INPUT_EMAIL {
        @Override
        public Integer getNextFpStatus(DFacilityManageData data) {
            Integer currentFpStatus = data.getFpStatus();

            switch (currentFpStatus) {
            case DJreConstants.FPSTATUS_SHINKI:
            case DJreConstants.FPSTATUS_SAKUSEI:
            case DJreConstants.FPSTATUS_SAKUSEI_HORYU:
            case DJreConstants.FPSTATUS_SOUSHINERROR:
                // ���J�� �ōđ��M�����ꍇ
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

    /** JRE�E���͈˗��iFAX�{�݁j */
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

    /** JRE�E�ꎞ�ۑ� */
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
     * ���́u�{�݃p�^�[����ԁv���擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param data
     *            ���݂́u�{�݃p�^�[����ԁv
     * @return ���́u�{�݃p�^�[����ԁv
     */
    public abstract Integer getNextFpStatus(DFacilityManageData data);

    /**
     * �u�{�݃p�^�[����ԁv�͈͊O�����B
     * 
     * <pre>
     * ���́u�{�݃p�^�[����ԁv�𔻒肵���ۂɁA���݂́u�{�݃p�^�[����ԁv���z��O�̒l�ł������ꍇ�Ɏ��s����鏈���ł��B
     * </pre>
     * 
     * @param data
     *            ���݂́u�{�݃p�^�[����ԁv
     * @return ���́u�{�݃p�^�[����ԁv
     */
    protected Integer outOfRange(DFacilityManageData data) {
        Integer currentFpStatus = data.getFpStatus();
        throw new JresApplicationException("illegal status " + currentFpStatus
                + " at " + this.name());
    }

}
