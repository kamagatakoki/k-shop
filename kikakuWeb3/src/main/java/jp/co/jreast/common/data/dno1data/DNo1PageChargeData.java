package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * <pre>
 * No1��ʗ����f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1��ʗ����f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author zang
 * @version 0.1 2006/11/17
 */
public final class DNo1PageChargeData {

    /**
     * ��l���z�i�d���z�j.
     */
    private String[] adltAmount;

    /**
     * ��l���z�i�̔��z�j.
     */
    private String[] adltAmountHanbai;

    /**
     * ��l�i�����s�h���Łj
     */
    private String[] adltTyoStayTax;

    /**
     * �����V�[�P���X
     */
    private Integer chargeSequence;

    /**
     * ���l���z�i�d���z�j .
     */
    private String[] childAmount;

    /**
     * ���l���z�i�̔��z�j .
     */
    private String[] childAmountHanbai;

    /**
     * ���l�i�����s�h���Łj
     */
    private String[] childTyoStayTax;

    /**
     * ��w�����z�i�d���z�j
     */
    private String[] collegeAmount;

    /**
     * ��w�����z�i�̔��z�j
     */
    private String[] collegeAmountHanbai;

    /**
     * ���Z�����z�i�d���z�j
     */
    private String[] highAmount;

    /**
     * ���Z�����z�i�̔��z�j
     */
    private String[] highAmountHanbai;

    /**
     * ���w�����z�i�d���z�j
     */
    private String[] juniorHighAmount;

    /**
     * ���w�����z�i�̔��z�j
     */
    private String[] juniorHighAmountHanbai;

    /**
     * ��ԑ�l�p�^�[����� .
     */
    private Integer maxAdltCapaPattern;

    /**
     * ��ԏ��l�p�^�[����� .
     */
    private Integer maxChildCapaPattern;

    /**
     * ��w���ő�����
     */
    private Integer maxCollegeCapaPattern;

    /**
     * ���Z���ő�����
     */
    private Integer maxHighCapaPattern;

    /**
     * ���w���ő�����
     */
    private Integer maxJuniorHighCapaPattern;

    /**
     * �V�j�A�ő�����
     */
    private Integer maxSeniorCapaPattern;

    /**
     * �񋟗���
     */
    private String[] offerCharge;

    /**
     * ��̗���
     */
    private String[] oneWayCharge;

    /**
     * �p�^�[����� .
     */
    private String pattern;

    /**
     * �V�j�A���z�i�d���z�j
     */
    private String[] seniorAmount;

    /**
     * �V�j�A���z�i�̔��z�j
     */
    private String[] seniorAmountHanbai;

    /**
     * �R���X�g���N�^.
     */
    public DNo1PageChargeData() {

    }

    /**
     * @param pattern
     *            �p�^�[�����
     * @param capaPatternCount
     *            .
     */
    public DNo1PageChargeData(String pattern, int capaPatternCount) {
        this.pattern = pattern;

        // ��l_�d���z
        adltAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            adltAmount[i] = "";
        }

        // ��l_�̔��z
        adltAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            adltAmountHanbai[i] = "";
        }

        // ��l_�����s�h����
        adltTyoStayTax = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            adltTyoStayTax[i] = "";
        }

        // ���l_�d���z
        childAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            childAmount[i] = "";
        }

        // ���l_�̔��z
        childAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            childAmountHanbai[i] = "";
        }

        // ���l_�����s�h����
        childTyoStayTax = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            childTyoStayTax[i] = "";
        }

        // �V�j�A_�d���z
        seniorAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            seniorAmount[i] = "";
        }
        // �V�j�A_�̔��z
        seniorAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            seniorAmountHanbai[i] = "";
        }
        // ��w��_�d���z
        collegeAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            collegeAmount[i] = "";
        }
        // ��w��_�̔��z
        collegeAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            collegeAmountHanbai[i] = "";
        }
        // ���Z��_�d���z
        highAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            highAmount[i] = "";
        }
        // ���Z��_�̔��z
        highAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            highAmountHanbai[i] = "";
        }
        // ���w��_�d���z
        juniorHighAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            juniorHighAmount[i] = "";
        }
        // ���w��_�̔��z
        juniorHighAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            juniorHighAmountHanbai[i] = "";
        }

        // �񋟗���
        offerCharge = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            offerCharge[i] = "";
        }
        // ��̗���
        oneWayCharge = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            oneWayCharge[i] = "";
        }

        maxAdltCapaPattern = new Integer(capaPatternCount);
        maxChildCapaPattern = new Integer(capaPatternCount);
        maxSeniorCapaPattern = new Integer(capaPatternCount);
        maxCollegeCapaPattern = new Integer(capaPatternCount);
        maxHighCapaPattern = new Integer(capaPatternCount);
        maxJuniorHighCapaPattern = new Integer(capaPatternCount);

    }

    /**
     * @return ��l�����z��.
     */
    public String[] getAdltAmount() {
        return adltAmount;
    }

    /**
     * @param i
     *            .
     * @return .
     */
    public String getAdltAmount(int i) {
        return DKikakuWebUtil.formatCharge(adltAmount[i]);
    }

    // -----�̔��z�ǉ� 2010/4/14 ���� -----------------------------------
    /**
     * @return ��l�����i�̔��z�j
     */
    public String[] getAdltAmountHanbai() {
        return adltAmountHanbai;
    }

    /**
     * @param i
     *            .
     * @return .
     */
    public String getAdltAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(adltAmountHanbai[i]);
    }

    /**
     * @return ��l�����s�h����
     */
    public String[] getAdltTyoStayTax() {
        return adltTyoStayTax;
    }

    /**
     * @return ��l�����s�h����
     */
    public String getAdltTyoStayTax(int i) {
        //return DKikakuWebUtil.formatCharge(adltTyoStayTax[i]);
        return adltTyoStayTax[i];
    }

    /**
     * �����V�[�P���X���擾���܂��B
     * 
     * @return �����V�[�P���X
     */
    public Integer getChargeSequence() {
        return chargeSequence;
    }

    /**
     * @return ���l�����z��.
     */
    public String[] getChildAmount() {
        return childAmount;
    }

    /**
     * @param i
     *            .
     * @return .
     */
    public String getChildAmount(int i) {
        return DKikakuWebUtil.formatCharge(childAmount[i]);
    }

    /**
     * @return ���l�����i�̔��z�j
     */
    public String[] getChildAmountHanbai() {
        return childAmountHanbai;
    }

    /**
     * @param i
     *            .
     * @return .
     */
    public String getChildAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(childAmountHanbai[i]);
    }

    /**
     * @return ���l�����s�h����
     */
    public String[] getChildTyoStayTax() {
        return childTyoStayTax;
    }

    /**
     * @return ���l�����s�h����
     */
    public String getChildTyoStayTax(int i) {
        return childTyoStayTax[i];
    }

    /**
     * ��w�����z�i�d���z�j���擾���܂��B
     * 
     * @return ��w�����z�i�d���z�j
     */
    public String[] getCollegeAmount() {
        return collegeAmount;
    }

    /**
     * �z�񂩂��w�������i�d���z�j���擾���܂�.
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ��w�������i�d���z�j
     */
    public String getCollegeAmount(int i) {
        return DKikakuWebUtil.formatCharge(collegeAmount[i]);
    }

    /**
     * ��w�����z�i�̔��z�j���擾���܂��B
     * 
     * @return ��w�����z�i�̔��z�j
     */
    public String[] getCollegeAmountHanbai() {
        return collegeAmountHanbai;
    }

    /**
     * �z�񂩂��w�����z�i�̔��z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ��w�����z�i�̔��z�j
     */
    public String getCollegeAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(collegeAmountHanbai[i]);
    }

    /**
     * ���Z�����z�i�d���z�j���擾���܂��B
     * 
     * @return ���Z�����z�i�d���z�j
     */
    public String[] getHighAmount() {
        return highAmount;
    }

    /**
     * �z�񂩂獂�Z�����z�i�d���z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ���Z�����z�i�d���z�j
     */
    public String getHighAmount(int i) {
        return DKikakuWebUtil.formatCharge(highAmount[i]);
    }

    /**
     * ���Z�����z�i�̔��z�j���擾���܂��B
     * 
     * @return ���Z�����z�i�̔��z�j
     */
    public String[] getHighAmountHanbai() {
        return highAmountHanbai;
    }

    /**
     * �z�񂩂獂�Z�����z�i�̔��z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ���Z�����z�i�̔��z�j
     */
    public String getHighAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(highAmountHanbai[i]);
    }

    /**
     * ���w�����z�i�d���z�j���擾���܂��B
     * 
     * @return ���w�����z�i�d���z�j
     */
    public String[] getJuniorHighAmount() {
        return juniorHighAmount;
    }

    /**
     * �z�񂩂璆�w�����z�i�d���z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ���w�����z�i�d���z�j
     */
    public String getJuniorHighAmount(int i) {
        return DKikakuWebUtil.formatCharge(juniorHighAmount[i]);
    }

    /**
     * ���w���i�̔��z�j���擾���܂��B
     * 
     * @return ���w���i�̔��z�j
     */
    public String[] getJuniorHighAmountHanbai() {
        return juniorHighAmountHanbai;
    }

    /**
     * �z�񂩂璆�w���i�̔��z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ���w���i�̔��z�j
     */
    public String getJuniorHighAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(juniorHighAmountHanbai[i]);
    }

    /**
     * @return .
     */
    public Integer getMaxAdltCapaPattern() {
        return maxAdltCapaPattern;
    }

    /**
     * @return .
     */
    public Integer getMaxChildCapaPattern() {
        return maxChildCapaPattern;
    }

    /**
     * ��w���ő��������擾���܂��B
     * 
     * @return ��w���ő�����
     */
    public Integer getMaxCollegeCapaPattern() {
        return maxCollegeCapaPattern;
    }

    /**
     * ���Z���ő��������擾���܂��B
     * 
     * @return ���Z���ő�����
     */
    public Integer getMaxHighCapaPattern() {
        return maxHighCapaPattern;
    }

    /**
     * ���w���ő��������擾���܂��B
     * 
     * @return ���w���ő�����
     */
    public Integer getMaxJuniorHighCapaPattern() {
        return maxJuniorHighCapaPattern;
    }

    /**
     * �V�j�A�ő��������擾���܂��B
     * 
     * @return �V�j�A�ő�����
     */
    public Integer getMaxSeniorCapaPattern() {
        return maxSeniorCapaPattern;
    }

    /**
     * �񋟗������擾���܂��B
     * 
     * @return �񋟗���
     */
    public String[] getOfferCharge() {
        return offerCharge;
    }

    /**
     * �z�񂩂�񋟗������擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return �񋟗���
     */
    public String getOfferCharge(int i) {
        return offerCharge[i];
    }

    /**
     * ��̗������擾���܂��B
     * 
     * @return ��̗���
     */
    public String[] getOneWayCharge() {
        return oneWayCharge;
    }

    /**
     * �z�񂩂��̗������擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return ��̗���
     */
    public String getOneWayCharge(int i) {
        return oneWayCharge[i];
    }

    /**
     * @return pattern.
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * �V�j�A���z�i�d���z�j���擾���܂��B
     * 
     * @return �V�j�A���z�i�d���z�j
     */
    public String[] getSeniorAmount() {
        return seniorAmount;
    }

    /**
     * �z�񂩂�V�j�A���z�i�d���z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return �V�j�A���z�i�d���z�j
     */
    public String getSeniorAmount(int i) {
        return DKikakuWebUtil.formatCharge(seniorAmount[i]);
    }

    /**
     * �V�j�A���z�i�̔��z�j���擾���܂��B
     * 
     * @return �V�j�A���z�i�̔��z�j
     */
    public String[] getSeniorAmountHanbai() {
        return seniorAmountHanbai;
    }

    /**
     * �z�񂩂�V�j�A���z�i�̔��z�j���擾���܂��B
     * 
     * @param i
     *            �C���f�b�N�X
     * @return �V�j�A���z�i�̔��z�j
     */
    public String getSeniorAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(seniorAmountHanbai[i]);
    }

    /**
     * @param index
     *            .
     * @param adltAmount
     *            .
     */
    public void setAdltAmount(final int index, final String adltAmount) {
        this.adltAmount[index] = adltAmount;
    }

    /**
     * @param adltAmount
     *            .
     */
    public void setAdltAmount(final String[] adltAmount) {
        this.adltAmount = adltAmount;
    }

    /**
     * @param index
     *            .
     * @param adltAmountHanbai
     *            .
     */
    public void setAdltAmountHanbai(final int index,
            final String adltAmountHanbai) {
        this.adltAmountHanbai[index] = adltAmountHanbai;
    }

    /**
     * @param adltAmountHanbai
     *            ��l�����i�̔��z�j
     */
    public void setAdltAmountHanbai(String[] adltAmountHanbai) {
        this.adltAmountHanbai = adltAmountHanbai;
    }

    /**
     * @param index
     *            �C���f�b�N�X
     * @param adltTyoStayTax
     *            ��l�����s�h����
     */
    public void setAdltTyoStayTax(final int index, String adltTyoStayTax) {
        this.adltTyoStayTax[index] = adltTyoStayTax;
    }

    /**
     * @param adltTyoStayTax
     *            ��l�����s�h����
     */
    public void setAdltTyoStayTax(String[] adltTyoStayTax) {
        this.adltTyoStayTax = adltTyoStayTax;
    }

    /**
     * �����V�[�P���X��ݒ肵�܂��B
     * 
     * @param chargeSequence
     *            �����V�[�P���X
     */
    public void setChargeSequence(Integer chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    /**
     * @param index
     *            .
     * @param childAmount
     *            .
     */
    public void setChildAmount(final int index, final String childAmount) {
        this.childAmount[index] = childAmount;
    }

    /**
     * @param childAmount
     *            .
     */
    public void setChildAmount(final String[] childAmount) {
        this.childAmount = childAmount;
    }

    /**
     * @param index
     *            .
     * @param childAmountHanbai
     *            .
     */
    public void setChildAmountHanbai(final int index,
            final String childAmountHanbai) {
        this.childAmountHanbai[index] = childAmountHanbai;
    }

    /**
     * @param childAmountHanbai
     *            .
     */
    public void setChildAmountHanbai(String[] childAmountHanbai) {
        this.childAmountHanbai = childAmountHanbai;
    }

    /**
     * @param index
     *            �C���f�b�N�X
     * @param childTyoStayTax
     *            ���l�����s�h����
     */
    public void setChildTyoStayTax(final int index, String childTyoStayTax) {
        this.childTyoStayTax[index] = childTyoStayTax;
    }

    /**
     * @param childTyoStayTax
     *            ���l�����s�h����
     */
    public void setChildTyoStayTax(String[] childTyoStayTax) {
        this.childTyoStayTax = childTyoStayTax;
    }

    /**
     * �z��֑�w�����z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param collegeAmount
     *            ��w�����z�i�d���z�j
     */
    public void setCollegeAmount(int idx, String collegeAmount) {
        this.collegeAmount[idx] = collegeAmount;
    }

    /**
     * ��w�����z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param collegeAmount
     *            ��w�����z�i�d���z�j
     */
    public void setCollegeAmount(String[] collegeAmount) {
        this.collegeAmount = collegeAmount;
    }

    /**
     * �z��֑�w�����z�i�̔��z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param collegeAmountHanbai
     *            ��w�����z�i�̔��z�j
     */
    public void setCollegeAmountHanbai(int idx, String collegeAmountHanbai) {
        this.collegeAmountHanbai[idx] = collegeAmountHanbai;
    }

    /**
     * ��w�����z�i�̔��z�j��ݒ肵�܂��B
     * 
     * @param collegeAmountHanbai
     *            ��w�����z�i�̔��z�j
     */
    public void setCollegeAmountHanbai(String[] collegeAmountHanbai) {
        this.collegeAmountHanbai = collegeAmountHanbai;
    }

    /**
     * �z��֍��Z�����z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param highAmount
     *            ���Z�����z�i�d���z�j
     */
    public void setHighAmount(int idx, String highAmount) {
        this.highAmount[idx] = highAmount;
    }

    /**
     * ���Z�����z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param highAmount
     *            ���Z�����z�i�d���z�j
     */
    public void setHighAmount(String[] highAmount) {
        this.highAmount = highAmount;
    }

    /**
     * �z��֍��Z�����z�i�̔��z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param highAmountHanbai
     *            ���Z�����z�i�̔��z�j
     */
    public void setHighAmountHanbai(int idx, String highAmountHanbai) {
        this.highAmountHanbai[idx] = highAmountHanbai;
    }

    /**
     * ���Z�����z�i�̔��z�j��ݒ肵�܂��B
     * 
     * @param highAmountHanbai
     *            ���Z�����z�i�̔��z�j
     */
    public void setHighAmountHanbai(String[] highAmountHanbai) {
        this.highAmountHanbai = highAmountHanbai;
    }

    /**
     * �z��֒��w�����z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param juniorHighAmount
     *            ���w�����z�i�d���z�j
     */
    public void setJuniorHighAmount(int idx, String juniorHighAmount) {
        this.juniorHighAmount[idx] = juniorHighAmount;
    }

    /**
     * ���w�����z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param juniorHighAmount
     *            ���w�����z�i�d���z�j
     */
    public void setJuniorHighAmount(String[] juniorHighAmount) {
        this.juniorHighAmount = juniorHighAmount;
    }

    /**
     * �z��֒��w���i�̔��z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param juniorHighAmountHanbai
     *            ���w���i�̔��z�j
     */
    public void setJuniorHighAmountHanbai(int idx, String juniorHighAmountHanbai) {
        this.juniorHighAmountHanbai[idx] = juniorHighAmountHanbai;
    }

    /**
     * ���w���i�̔��z�j��ݒ肵�܂��B
     * 
     * @param juniorHighAmountHanbai
     *            ���w���i�̔��z�j
     */
    public void setJuniorHighAmountHanbai(String[] juniorHighAmountHanbai) {
        this.juniorHighAmountHanbai = juniorHighAmountHanbai;
    }

    // -------------------------------------------------------------------

    /**
     * @param maxAdltCapaPattern
     *            .
     */
    public void setMaxAdltCapaPattern(Integer maxAdltCapaPattern) {
        this.maxAdltCapaPattern = maxAdltCapaPattern;
    }

    /**
     * @param maxChildCapaPattern
     *            .
     */
    public void setMaxChildCapaPattern(Integer maxChildCapaPattern) {
        this.maxChildCapaPattern = maxChildCapaPattern;
    }

    /**
     * ��w���ő�������ݒ肵�܂��B
     * 
     * @param maxCollegeCapaPattern
     *            ��w���ő�����
     */
    public void setMaxCollegeCapaPattern(Integer maxCollegeCapaPattern) {
        this.maxCollegeCapaPattern = maxCollegeCapaPattern;
    }

    /**
     * ���Z���ő�������ݒ肵�܂��B
     * 
     * @param maxHighCapaPattern
     *            ���Z���ő�����
     */
    public void setMaxHighCapaPattern(Integer maxHighCapaPattern) {
        this.maxHighCapaPattern = maxHighCapaPattern;
    }

    /**
     * ���w���ő�������ݒ肵�܂��B
     * 
     * @param maxJuniorHighCapaPattern
     *            ���w���ő�����
     */
    public void setMaxJuniorHighCapaPattern(Integer maxJuniorHighCapaPattern) {
        this.maxJuniorHighCapaPattern = maxJuniorHighCapaPattern;
    }

    /**
     * �V�j�A�ő�������ݒ肵�܂��B
     * 
     * @param maxSeniorCapaPattern
     *            �V�j�A�ő�����
     */
    public void setMaxSeniorCapaPattern(Integer maxSeniorCapaPattern) {
        this.maxSeniorCapaPattern = maxSeniorCapaPattern;
    }

    /**
     * �񋟗�����ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param offerCharge
     *            �񋟗���
     */
    public void setOfferCharge(int idx, String offerCharge) {
        this.offerCharge[idx] = offerCharge;
    }

    /**
     * �񋟗�����ݒ肵�܂��B
     * 
     * @param offerCharge
     *            �񋟗���
     */
    public void setOfferCharge(String[] offerCharge) {
        this.offerCharge = offerCharge;
    }

    /**
     * ��̗�����ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param oneWayCharge
     *            ��̗���
     */
    public void setOneWayCharge(int idx, String oneWayCharge) {
        this.oneWayCharge[idx] = oneWayCharge;
    }

    /**
     * ��̗�����ݒ肵�܂��B
     * 
     * @param oneWayCharge
     *            ��̗���
     */
    public void setOneWayCharge(String[] oneWayCharge) {
        this.oneWayCharge = oneWayCharge;
    }

    /**
     * @param pattern
     *            .
     */
    public void setPattern(final String pattern) {
        this.pattern = pattern;
    }

    /**
     * �V�j�A���z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param seniorAmount
     *            �V�j�A���z�i�d���z�j
     */
    public void setSeniorAmount(int idx, String seniorAmount) {
        this.seniorAmount[idx] = seniorAmount;
    }

    /**
     * �V�j�A���z�i�d���z�j��ݒ肵�܂��B
     * 
     * @param seniorAmount
     *            �V�j�A���z�i�d���z�j
     */
    public void setSeniorAmount(String[] seniorAmount) {
        this.seniorAmount = seniorAmount;
    }

    /**
     * �z��փV�j�A���z�i�̔��z�j��ݒ肵�܂��B
     * 
     * @param idx
     *            �C���f�b�N�X
     * @param seniorAmountHanbai
     *            �V�j�A���z�i�̔��z�j
     */
    public void setSeniorAmountHanbai(int idx, String seniorAmountHanbai) {
        this.seniorAmountHanbai[idx] = seniorAmountHanbai;
    }

    /**
     * �V�j�A���z�i�̔��z�j��ݒ肵�܂��B
     * 
     * @param seniorAmountHanbai
     *            �V�j�A���z�i�̔��z�j
     */
    public void setSeniorAmountHanbai(String[] seniorAmountHanbai) {
        this.seniorAmountHanbai = seniorAmountHanbai;
    }

}
