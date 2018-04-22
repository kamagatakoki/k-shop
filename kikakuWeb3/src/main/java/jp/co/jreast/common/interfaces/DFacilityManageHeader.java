package jp.co.jreast.common.interfaces;

/**
 * �{�ݕt�я��w�b�_ �C���^�[�t�F�[�X
 * 
 * <pre>
 *   �@�\�T�v �F �{�ݕt�я��w�b�_���ځi����јA������j�f�[�^�̃C���^�[�t�F�[�X�ł��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public interface DFacilityManageHeader extends PlanAnsKey, FacilityManageKey {

    /**
     * �x�ЃR�[�h���擾���܂��B
     * 
     * @return �x�ЃR�[�h
     */
    String getBranchCd();

    /**
     * �x�Ж��̂��擾���܂��B�i����{�}�X�^�Q�Ɓj
     * 
     * @return �x�Ж���
     */
    String getBranchNm();

    /**
     * �{�݃R�[�h�̐擪1���ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̐擪1����
     */
    String getFacilityCd1();

    /**
     * �{�݃R�[�h�̐擪2���ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̐擪2����
     */
    String getFacilityCd2();

    /**
     * �{�݃R�[�h�̐擪3���ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̐擪3����
     */
    String getFacilityCd3();

    /**
     * �{�݃R�[�h�̐擪4���ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̐擪4����
     */
    String getFacilityCd4();

    /**
     * �{�݃R�[�h�̐擪5���ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̐擪5����
     */
    String getFacilityCd5();

    /**
     * �{�݃R�[�h�̐擪6���ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̐擪6����
     */
    String getFacilityCd6();

    /**
     * �{�ݖ��̂��擾���܂��B
     * 
     * @return �{�ݖ���
     */
    String getFacilityNm();

    /**
     * �{�݃p�^�[���̐擪1���ڂ��擾���܂��B
     * 
     * @return �{�݃p�^�[���̐擪1����
     */
    String getFacilityPattern1();

    /**
     * �{�݃p�^�[���̐擪2���ڂ��擾���܂��B
     * 
     * @return �{�݃p�^�[���̐擪2����
     */
    String getFacilityPattern2();

    /**
     * �{�݃p�^�[���̐擪3���ڂ��擾���܂��B
     * 
     * @return �{�݃p�^�[���̐擪3����
     */
    String getFacilityPattern3();

    /**
     * �{�݃p�^�[���̐擪4���ڂ��擾���܂��B
     * 
     * @return �{�݃p�^�[���̐擪4����
     */
    String getFacilityPattern4();

    /**
     * �{�݃p�^�[���̐擪5���ڂ��擾���܂��B
     * 
     * @return �{�݃p�^�[���̐擪5����
     */
    String getFacilityPattern5();

    /**
     * �{�݃p�^�[���̐擪6���ڂ��擾���܂��B
     * 
     * @return �{�݃p�^�[���̐擪6����
     */
    String getFacilityPattern6();

    /**
     * �{�݃p�^�[�����̂��擾���܂��B
     * 
     * @return �{�݃p�^�[������
     */
    String getFacilityPatternNm();

    /**
     * ���t��i�񓚏�/�t�я��j���擾���܂��B
     * 
     * @return ���t��i�񓚏�/�t�я��j
     */
    String getFacilitySendAddr();

    /**
     * ��� �iNO3��� �܂��� NO5��ԁj���擾���܂��B
     * 
     * @return ��� �iNO3��� �܂��� NO5��ԁj
     */
    Integer getFpStatus();

    /**
     * ��Ԗ��́iNO3��� �܂��� NO5��ԁj���擾���܂��B�i����{�}�X�^�Q�Ɓj
     * 
     * @return ��Ԗ���
     */
    String getFpStatusNm();

    /**
     * ���i���̂��擾���܂��B
     * 
     * @return ���i����
     */
    String getGoodsNm();

    /**
     * �񓚏���ʖ��̂��擾���܂��B�i����{�}�X�^�Q�Ɓj
     * 
     * @return �񓚏���ʖ���
     */
    String getKindNm();

    /**
     * ��� �i���񓚏��j���擾���܂��B
     * 
     * @return ��� �i���񓚏��j
     */
    Integer getPaStatus();

    /**
     * ��Ԗ��́i���񓚏��j���擾���܂��B�i����{�}�X�^�Q�Ɓj
     * 
     * @return ��Ԗ���
     */
    String getPaStatusNm();

    /**
     * ���ʔԁi�����{�j���擾���܂��B
     * 
     * @return ���ʔԁi�����{�j
     */
    String getPlanNoEJp();

    /**
     * ���ʔԁi�����{�j�̐擪1���ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̐擪1����
     */
    String getPlanNoEJp1();

    /**
     * ���ʔԁi�����{�j�̐擪2���ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̐擪2����
     */
    String getPlanNoEJp2();

    /**
     * ���ʔԁi�����{�j�̐擪3���ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̐擪3����
     */
    String getPlanNoEJp3();

    /**
     * ���ʔԁi�����{�j�̐擪4���ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̐擪4����
     */
    String getPlanNoEJp4();

    /**
     * ���ʔԁi�����{�j�̐擪5���ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̐擪5����
     */
    String getPlanNoEJp5();

    /**
     * ���ʔԁi�����{�j�̐擪6���ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̐擪6����
     */
    String getPlanNoEJp6();

    /**
     * �V�[�Y���敪���擾���܂��B
     * 
     * @return �V�[�Y���敪
     */
    String getSeasonDiv();

    /**
     * �V�[�Y�����̂��擾���܂��B�i����{�}�X�^�Q�Ɓj
     * 
     * @return �V�[�Y������
     */
    String getSeasonNm();

    /**
     * ���t�敪���擾���܂��B
     * 
     * @return ���t�敪
     */
    Integer getSendDiv();

    /**
     * ���t�A����e�`�w���擾���܂��B
     * 
     * @return ���t�A����e�`�w
     */
    String getSenderFax();

    /**
     * ���t�S���Җ����擾���܂��B
     * 
     * @return ���t�S���Җ�
     */
    String getSenderNm();

    /**
     * ���t�A����d�b���擾���܂��B
     * 
     * @return ���t�A����d�b
     */
    String getSenderTel();

    /**
     * ���t��Ԃ��擾���܂��B
     * 
     * @return ���t���
     */
    String getSendStatus();

    /**
     * �X�V�N�������擾���܂��B
     * 
     * @return �X�V�N����
     */
    String getUpYmd();

    /**
     * �X�V�N�����iyyyy/MM/dd�j���擾���܂��B
     * 
     * @return �X�V�N�����iyyyy/MM/dd�j
     */
    String getUpYmdDisp();

    /**
     * �N�x���擾���܂��B
     * 
     * @return �N�x
     */
    String getYear();

    /**
     * �x�ЃR�[�h��ݒ肵�܂��B
     * 
     * @param branchCd
     *            �x�ЃR�[�h
     */
    void setBranchCd(String branchCd);

    /**
     * �{�ݖ��̂�ݒ肵�܂��B
     * 
     * @param facilityNm
     *            �{�ݖ���
     */
    void setFacilityNm(String facilityNm);

    /**
     * �{�݃p�^�[�����̂�ݒ肵�܂��B
     * 
     * @param facilityPatternNm
     *            �{�݃p�^�[������
     */
    void setFacilityPatternNm(String facilityPatternNm);

    /**
     * ���t��i�񓚏�/�t�я��j��ݒ肵�܂��B
     * 
     * @param facilitySendAddr
     *            ���t��i�񓚏�/�t�я��j
     */
    void setFacilitySendAddr(String facilitySendAddr);

    /**
     * ��� �iNO3��� �܂��� NO5��ԁj��ݒ肵�܂��B
     * 
     * @param fpStatus
     *            ��� �iNO3��� �܂��� NO5��ԁj
     */
    void setFpStatus(Integer fpStatus);

    /**
     * ���i���̂�ݒ肵�܂��B
     * 
     * @param goodsNm
     *            ���i����
     */
    void setGoodsNm(String goodsNm);

    /**
     * ��� �i���񓚏��j��ݒ肵�܂��B
     * 
     * @param paStatus
     *            ��� �i���񓚏��j
     */
    void setPaStatus(Integer paStatus);

    /**
     * ���ʔԁi�����{�j��ݒ肵�܂��B
     * 
     * @param planNoEJp
     *            ���ʔԁi�����{�j
     */
    void setPlanNoEJp(String planNoEJp);

    /**
     * �V�[�Y���敪��ݒ肵�܂��B
     * 
     * @param seasonDiv
     *            �V�[�Y���敪
     */
    void setSeasonDiv(String seasonDiv);

    /**
     * ���t�敪��ݒ肵�܂��B
     * 
     * @param sendDiv
     *            ���t�敪
     */
    void setSendDiv(Integer sendDiv);

    /**
     * ���t�A����e�`�w��ݒ肵�܂��B
     * 
     * @param senderFax
     *            ���t�A����e�`�w
     */
    void setSenderFax(String senderFax);

    /**
     * ���t�S���Җ���ݒ肵�܂��B
     * 
     * @param senderNm
     *            ���t�S���Җ�
     */
    void setSenderNm(String senderNm);

    /**
     * ���t�A����d�b��ݒ肵�܂��B
     * 
     * @param senderTel
     *            ���t�A����d�b
     */
    void setSenderTel(String senderTel);

    /**
     * ���t��Ԃ�ݒ肵�܂��B
     * 
     * @param sendStatus
     *            ���t���
     */
    void setSendStatus(String sendStatus);

    /**
     * �X�V�N������ݒ肵�܂��B
     * 
     * @param upYmd
     *            �X�V�N����
     */
    void setUpYmd(String upYmd);

    /**
     * �N�x��ݒ肵�܂��B
     * 
     * @param year
     *            �N�x
     */
    void setYear(String year);

}
