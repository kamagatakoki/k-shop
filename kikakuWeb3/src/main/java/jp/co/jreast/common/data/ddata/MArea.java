package jp.co.jreast.common.data.ddata;

/**
 * �n��}�X�^ �G���e�B�e�B
 * 
 * <pre>
 *   �@�\�T�v �F 
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class MArea {

    /**
     * �n��R�[�h
     */
    private String areaCd;

    /**
     * �n�於�́i�J�i�j
     */

    private String areaKana;

    /**
     * �n�於��
     */
    private String areaNm;

    /**
     * �n��R�[�h���擾���܂��B
     * 
     * @return �n��R�[�h
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * �n�於�́i�J�i�j���擾���܂��B
     * 
     * @return �n�於�́i�J�i�j
     */
    public String getAreaKana() {
        return areaKana;
    }

    /**
     * �n�於�̂��擾���܂��B
     * 
     * @return �n�於��
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * �n��R�[�h��ݒ肵�܂��B
     * 
     * @param areaCd
     *            �n��R�[�h
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * �n�於�́i�J�i�j��ݒ肵�܂��B
     * 
     * @param areaKana
     *            �n�於�́i�J�i�j
     */
    public void setAreaKana(String areaKana) {
        this.areaKana = areaKana;
    }

    /**
     * �n�於�̂�ݒ肵�܂��B
     * 
     * @param areaNm
     *            �n�於��
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

}
