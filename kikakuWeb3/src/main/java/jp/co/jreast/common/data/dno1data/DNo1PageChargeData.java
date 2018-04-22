package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * <pre>
 * No1画面料金データクラス。.
 * 機能概要    ：  NO1画面料金データを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author zang
 * @version 0.1 2006/11/17
 */
public final class DNo1PageChargeData {

    /**
     * 大人金額（仕入額）.
     */
    private String[] adltAmount;

    /**
     * 大人金額（販売額）.
     */
    private String[] adltAmountHanbai;

    /**
     * 大人（東京都宿泊税）
     */
    private String[] adltTyoStayTax;

    /**
     * 料金シーケンス
     */
    private Integer chargeSequence;

    /**
     * 小人金額（仕入額） .
     */
    private String[] childAmount;

    /**
     * 小人金額（販売額） .
     */
    private String[] childAmountHanbai;

    /**
     * 小人（東京都宿泊税）
     */
    private String[] childTyoStayTax;

    /**
     * 大学生金額（仕入額）
     */
    private String[] collegeAmount;

    /**
     * 大学生金額（販売額）
     */
    private String[] collegeAmountHanbai;

    /**
     * 高校生金額（仕入額）
     */
    private String[] highAmount;

    /**
     * 高校生金額（販売額）
     */
    private String[] highAmountHanbai;

    /**
     * 中学生金額（仕入額）
     */
    private String[] juniorHighAmount;

    /**
     * 中学生金額（販売額）
     */
    private String[] juniorHighAmountHanbai;

    /**
     * 一番大人パターン定員 .
     */
    private Integer maxAdltCapaPattern;

    /**
     * 一番小人パターン定員 .
     */
    private Integer maxChildCapaPattern;

    /**
     * 大学生最大定員数
     */
    private Integer maxCollegeCapaPattern;

    /**
     * 高校生最大定員数
     */
    private Integer maxHighCapaPattern;

    /**
     * 中学生最大定員数
     */
    private Integer maxJuniorHighCapaPattern;

    /**
     * シニア最大定員数
     */
    private Integer maxSeniorCapaPattern;

    /**
     * 提供料金
     */
    private String[] offerCharge;

    /**
     * 乗捨料金
     */
    private String[] oneWayCharge;

    /**
     * パターン種別 .
     */
    private String pattern;

    /**
     * シニア金額（仕入額）
     */
    private String[] seniorAmount;

    /**
     * シニア金額（販売額）
     */
    private String[] seniorAmountHanbai;

    /**
     * コンストラクタ.
     */
    public DNo1PageChargeData() {

    }

    /**
     * @param pattern
     *            パターン種別
     * @param capaPatternCount
     *            .
     */
    public DNo1PageChargeData(String pattern, int capaPatternCount) {
        this.pattern = pattern;

        // 大人_仕入額
        adltAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            adltAmount[i] = "";
        }

        // 大人_販売額
        adltAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            adltAmountHanbai[i] = "";
        }

        // 大人_東京都宿泊税
        adltTyoStayTax = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            adltTyoStayTax[i] = "";
        }

        // 小人_仕入額
        childAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            childAmount[i] = "";
        }

        // 小人_販売額
        childAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            childAmountHanbai[i] = "";
        }

        // 小人_東京都宿泊税
        childTyoStayTax = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            childTyoStayTax[i] = "";
        }

        // シニア_仕入額
        seniorAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            seniorAmount[i] = "";
        }
        // シニア_販売額
        seniorAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            seniorAmountHanbai[i] = "";
        }
        // 大学生_仕入額
        collegeAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            collegeAmount[i] = "";
        }
        // 大学生_販売額
        collegeAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            collegeAmountHanbai[i] = "";
        }
        // 高校生_仕入額
        highAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            highAmount[i] = "";
        }
        // 高校生_販売額
        highAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            highAmountHanbai[i] = "";
        }
        // 中学生_仕入額
        juniorHighAmount = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            juniorHighAmount[i] = "";
        }
        // 中学生_販売額
        juniorHighAmountHanbai = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            juniorHighAmountHanbai[i] = "";
        }

        // 提供料金
        offerCharge = new String[capaPatternCount];
        for (int i = 0; i < capaPatternCount; i++) {
            offerCharge[i] = "";
        }
        // 乗捨料金
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
     * @return 大人料金配列.
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

    // -----販売額追加 2010/4/14 加藤 -----------------------------------
    /**
     * @return 大人料金（販売額）
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
     * @return 大人東京都宿泊税
     */
    public String[] getAdltTyoStayTax() {
        return adltTyoStayTax;
    }

    /**
     * @return 大人東京都宿泊税
     */
    public String getAdltTyoStayTax(int i) {
        //return DKikakuWebUtil.formatCharge(adltTyoStayTax[i]);
        return adltTyoStayTax[i];
    }

    /**
     * 料金シーケンスを取得します。
     * 
     * @return 料金シーケンス
     */
    public Integer getChargeSequence() {
        return chargeSequence;
    }

    /**
     * @return 小人料金配列.
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
     * @return 小人料金（販売額）
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
     * @return 小人東京都宿泊税
     */
    public String[] getChildTyoStayTax() {
        return childTyoStayTax;
    }

    /**
     * @return 小人東京都宿泊税
     */
    public String getChildTyoStayTax(int i) {
        return childTyoStayTax[i];
    }

    /**
     * 大学生金額（仕入額）を取得します。
     * 
     * @return 大学生金額（仕入額）
     */
    public String[] getCollegeAmount() {
        return collegeAmount;
    }

    /**
     * 配列から大学生料金（仕入額）を取得します.
     * 
     * @param i
     *            インデックス
     * @return 大学生料金（仕入額）
     */
    public String getCollegeAmount(int i) {
        return DKikakuWebUtil.formatCharge(collegeAmount[i]);
    }

    /**
     * 大学生金額（販売額）を取得します。
     * 
     * @return 大学生金額（販売額）
     */
    public String[] getCollegeAmountHanbai() {
        return collegeAmountHanbai;
    }

    /**
     * 配列から大学生金額（販売額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return 大学生金額（販売額）
     */
    public String getCollegeAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(collegeAmountHanbai[i]);
    }

    /**
     * 高校生金額（仕入額）を取得します。
     * 
     * @return 高校生金額（仕入額）
     */
    public String[] getHighAmount() {
        return highAmount;
    }

    /**
     * 配列から高校生金額（仕入額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return 高校生金額（仕入額）
     */
    public String getHighAmount(int i) {
        return DKikakuWebUtil.formatCharge(highAmount[i]);
    }

    /**
     * 高校生金額（販売額）を取得します。
     * 
     * @return 高校生金額（販売額）
     */
    public String[] getHighAmountHanbai() {
        return highAmountHanbai;
    }

    /**
     * 配列から高校生金額（販売額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return 高校生金額（販売額）
     */
    public String getHighAmountHanbai(int i) {
        return DKikakuWebUtil.formatCharge(highAmountHanbai[i]);
    }

    /**
     * 中学生金額（仕入額）を取得します。
     * 
     * @return 中学生金額（仕入額）
     */
    public String[] getJuniorHighAmount() {
        return juniorHighAmount;
    }

    /**
     * 配列から中学生金額（仕入額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return 中学生金額（仕入額）
     */
    public String getJuniorHighAmount(int i) {
        return DKikakuWebUtil.formatCharge(juniorHighAmount[i]);
    }

    /**
     * 中学生（販売額）を取得します。
     * 
     * @return 中学生（販売額）
     */
    public String[] getJuniorHighAmountHanbai() {
        return juniorHighAmountHanbai;
    }

    /**
     * 配列から中学生（販売額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return 中学生（販売額）
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
     * 大学生最大定員数を取得します。
     * 
     * @return 大学生最大定員数
     */
    public Integer getMaxCollegeCapaPattern() {
        return maxCollegeCapaPattern;
    }

    /**
     * 高校生最大定員数を取得します。
     * 
     * @return 高校生最大定員数
     */
    public Integer getMaxHighCapaPattern() {
        return maxHighCapaPattern;
    }

    /**
     * 中学生最大定員数を取得します。
     * 
     * @return 中学生最大定員数
     */
    public Integer getMaxJuniorHighCapaPattern() {
        return maxJuniorHighCapaPattern;
    }

    /**
     * シニア最大定員数を取得します。
     * 
     * @return シニア最大定員数
     */
    public Integer getMaxSeniorCapaPattern() {
        return maxSeniorCapaPattern;
    }

    /**
     * 提供料金を取得します。
     * 
     * @return 提供料金
     */
    public String[] getOfferCharge() {
        return offerCharge;
    }

    /**
     * 配列から提供料金を取得します。
     * 
     * @param i
     *            インデックス
     * @return 提供料金
     */
    public String getOfferCharge(int i) {
        return offerCharge[i];
    }

    /**
     * 乗捨料金を取得します。
     * 
     * @return 乗捨料金
     */
    public String[] getOneWayCharge() {
        return oneWayCharge;
    }

    /**
     * 配列から乗捨料金を取得します。
     * 
     * @param i
     *            インデックス
     * @return 乗捨料金
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
     * シニア金額（仕入額）を取得します。
     * 
     * @return シニア金額（仕入額）
     */
    public String[] getSeniorAmount() {
        return seniorAmount;
    }

    /**
     * 配列からシニア金額（仕入額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return シニア金額（仕入額）
     */
    public String getSeniorAmount(int i) {
        return DKikakuWebUtil.formatCharge(seniorAmount[i]);
    }

    /**
     * シニア金額（販売額）を取得します。
     * 
     * @return シニア金額（販売額）
     */
    public String[] getSeniorAmountHanbai() {
        return seniorAmountHanbai;
    }

    /**
     * 配列からシニア金額（販売額）を取得します。
     * 
     * @param i
     *            インデックス
     * @return シニア金額（販売額）
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
     *            大人料金（販売額）
     */
    public void setAdltAmountHanbai(String[] adltAmountHanbai) {
        this.adltAmountHanbai = adltAmountHanbai;
    }

    /**
     * @param index
     *            インデックス
     * @param adltTyoStayTax
     *            大人東京都宿泊税
     */
    public void setAdltTyoStayTax(final int index, String adltTyoStayTax) {
        this.adltTyoStayTax[index] = adltTyoStayTax;
    }

    /**
     * @param adltTyoStayTax
     *            大人東京都宿泊税
     */
    public void setAdltTyoStayTax(String[] adltTyoStayTax) {
        this.adltTyoStayTax = adltTyoStayTax;
    }

    /**
     * 料金シーケンスを設定します。
     * 
     * @param chargeSequence
     *            料金シーケンス
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
     *            インデックス
     * @param childTyoStayTax
     *            小人東京都宿泊税
     */
    public void setChildTyoStayTax(final int index, String childTyoStayTax) {
        this.childTyoStayTax[index] = childTyoStayTax;
    }

    /**
     * @param childTyoStayTax
     *            小人東京都宿泊税
     */
    public void setChildTyoStayTax(String[] childTyoStayTax) {
        this.childTyoStayTax = childTyoStayTax;
    }

    /**
     * 配列へ大学生金額（仕入額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param collegeAmount
     *            大学生金額（仕入額）
     */
    public void setCollegeAmount(int idx, String collegeAmount) {
        this.collegeAmount[idx] = collegeAmount;
    }

    /**
     * 大学生金額（仕入額）を設定します。
     * 
     * @param collegeAmount
     *            大学生金額（仕入額）
     */
    public void setCollegeAmount(String[] collegeAmount) {
        this.collegeAmount = collegeAmount;
    }

    /**
     * 配列へ大学生金額（販売額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param collegeAmountHanbai
     *            大学生金額（販売額）
     */
    public void setCollegeAmountHanbai(int idx, String collegeAmountHanbai) {
        this.collegeAmountHanbai[idx] = collegeAmountHanbai;
    }

    /**
     * 大学生金額（販売額）を設定します。
     * 
     * @param collegeAmountHanbai
     *            大学生金額（販売額）
     */
    public void setCollegeAmountHanbai(String[] collegeAmountHanbai) {
        this.collegeAmountHanbai = collegeAmountHanbai;
    }

    /**
     * 配列へ高校生金額（仕入額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param highAmount
     *            高校生金額（仕入額）
     */
    public void setHighAmount(int idx, String highAmount) {
        this.highAmount[idx] = highAmount;
    }

    /**
     * 高校生金額（仕入額）を設定します。
     * 
     * @param highAmount
     *            高校生金額（仕入額）
     */
    public void setHighAmount(String[] highAmount) {
        this.highAmount = highAmount;
    }

    /**
     * 配列へ高校生金額（販売額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param highAmountHanbai
     *            高校生金額（販売額）
     */
    public void setHighAmountHanbai(int idx, String highAmountHanbai) {
        this.highAmountHanbai[idx] = highAmountHanbai;
    }

    /**
     * 高校生金額（販売額）を設定します。
     * 
     * @param highAmountHanbai
     *            高校生金額（販売額）
     */
    public void setHighAmountHanbai(String[] highAmountHanbai) {
        this.highAmountHanbai = highAmountHanbai;
    }

    /**
     * 配列へ中学生金額（仕入額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param juniorHighAmount
     *            中学生金額（仕入額）
     */
    public void setJuniorHighAmount(int idx, String juniorHighAmount) {
        this.juniorHighAmount[idx] = juniorHighAmount;
    }

    /**
     * 中学生金額（仕入額）を設定します。
     * 
     * @param juniorHighAmount
     *            中学生金額（仕入額）
     */
    public void setJuniorHighAmount(String[] juniorHighAmount) {
        this.juniorHighAmount = juniorHighAmount;
    }

    /**
     * 配列へ中学生（販売額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param juniorHighAmountHanbai
     *            中学生（販売額）
     */
    public void setJuniorHighAmountHanbai(int idx, String juniorHighAmountHanbai) {
        this.juniorHighAmountHanbai[idx] = juniorHighAmountHanbai;
    }

    /**
     * 中学生（販売額）を設定します。
     * 
     * @param juniorHighAmountHanbai
     *            中学生（販売額）
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
     * 大学生最大定員数を設定します。
     * 
     * @param maxCollegeCapaPattern
     *            大学生最大定員数
     */
    public void setMaxCollegeCapaPattern(Integer maxCollegeCapaPattern) {
        this.maxCollegeCapaPattern = maxCollegeCapaPattern;
    }

    /**
     * 高校生最大定員数を設定します。
     * 
     * @param maxHighCapaPattern
     *            高校生最大定員数
     */
    public void setMaxHighCapaPattern(Integer maxHighCapaPattern) {
        this.maxHighCapaPattern = maxHighCapaPattern;
    }

    /**
     * 中学生最大定員数を設定します。
     * 
     * @param maxJuniorHighCapaPattern
     *            中学生最大定員数
     */
    public void setMaxJuniorHighCapaPattern(Integer maxJuniorHighCapaPattern) {
        this.maxJuniorHighCapaPattern = maxJuniorHighCapaPattern;
    }

    /**
     * シニア最大定員数を設定します。
     * 
     * @param maxSeniorCapaPattern
     *            シニア最大定員数
     */
    public void setMaxSeniorCapaPattern(Integer maxSeniorCapaPattern) {
        this.maxSeniorCapaPattern = maxSeniorCapaPattern;
    }

    /**
     * 提供料金を設定します。
     * 
     * @param idx
     *            インデックス
     * @param offerCharge
     *            提供料金
     */
    public void setOfferCharge(int idx, String offerCharge) {
        this.offerCharge[idx] = offerCharge;
    }

    /**
     * 提供料金を設定します。
     * 
     * @param offerCharge
     *            提供料金
     */
    public void setOfferCharge(String[] offerCharge) {
        this.offerCharge = offerCharge;
    }

    /**
     * 乗捨料金を設定します。
     * 
     * @param idx
     *            インデックス
     * @param oneWayCharge
     *            乗捨料金
     */
    public void setOneWayCharge(int idx, String oneWayCharge) {
        this.oneWayCharge[idx] = oneWayCharge;
    }

    /**
     * 乗捨料金を設定します。
     * 
     * @param oneWayCharge
     *            乗捨料金
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
     * シニア金額（仕入額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param seniorAmount
     *            シニア金額（仕入額）
     */
    public void setSeniorAmount(int idx, String seniorAmount) {
        this.seniorAmount[idx] = seniorAmount;
    }

    /**
     * シニア金額（仕入額）を設定します。
     * 
     * @param seniorAmount
     *            シニア金額（仕入額）
     */
    public void setSeniorAmount(String[] seniorAmount) {
        this.seniorAmount = seniorAmount;
    }

    /**
     * 配列へシニア金額（販売額）を設定します。
     * 
     * @param idx
     *            インデックス
     * @param seniorAmountHanbai
     *            シニア金額（販売額）
     */
    public void setSeniorAmountHanbai(int idx, String seniorAmountHanbai) {
        this.seniorAmountHanbai[idx] = seniorAmountHanbai;
    }

    /**
     * シニア金額（販売額）を設定します。
     * 
     * @param seniorAmountHanbai
     *            シニア金額（販売額）
     */
    public void setSeniorAmountHanbai(String[] seniorAmountHanbai) {
        this.seniorAmountHanbai = seniorAmountHanbai;
    }

}
