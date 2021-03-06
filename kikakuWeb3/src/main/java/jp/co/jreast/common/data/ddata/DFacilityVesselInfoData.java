package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

/**
 * [DP/RM]施設_部屋備品データ
 * 
 * <pre>
 *   機能概要 ： 施設付帯情報単位の全件分の情報を保持します。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityVesselInfoData {

    /**
     * 提供施設情報1
     */
    private DFacilityVesselHistory ves1;

    /**
     * 提供施設情報10
     */
    private DFacilityVesselHistory ves10;

    /**
     * 提供施設情報11
     */
    private DFacilityVesselHistory ves11;

    /**
     * 提供施設情報12
     */
    private DFacilityVesselHistory ves12;

    /**
     * 提供施設情報2
     */
    private DFacilityVesselHistory ves2;

    /**
     * 提供施設情報3
     */
    private DFacilityVesselHistory ves3;

    /**
     * 提供施設情報4
     */
    private DFacilityVesselHistory ves4;

    /**
     * 提供施設情報5
     */
    private DFacilityVesselHistory ves5;

    /**
     * 提供施設情報6
     */
    private DFacilityVesselHistory ves6;

    /**
     * 提供施設情報7
     */
    private DFacilityVesselHistory ves7;

    /**
     * 提供施設情報8
     */
    private DFacilityVesselHistory ves8;

    /**
     * 提供施設情報9
     */
    private DFacilityVesselHistory ves9;

    /**
     * コンストラクタ
     */
    public DFacilityVesselInfoData() {
        super();
        ves1 = new DFacilityVesselHistory();
        ves2 = new DFacilityVesselHistory();
        ves3 = new DFacilityVesselHistory();
        ves4 = new DFacilityVesselHistory();
        ves5 = new DFacilityVesselHistory();
        ves6 = new DFacilityVesselHistory();
        ves7 = new DFacilityVesselHistory();
        ves8 = new DFacilityVesselHistory();
        ves9 = new DFacilityVesselHistory();
        ves10 = new DFacilityVesselHistory();
        ves11 = new DFacilityVesselHistory();
        ves12 = new DFacilityVesselHistory();
    }

    /**
     * 提供施設情報1を取得します。
     * 
     * @return 提供施設情報1
     */
    public DFacilityVesselHistory getVes1() {
        return ves1;
    }

    /**
     * 提供施設情報10を取得します。
     * 
     * @return 提供施設情報10
     */
    public DFacilityVesselHistory getVes10() {
        return ves10;
    }

    /**
     * 提供施設情報11を取得します。
     * 
     * @return 提供施設情報11
     */
    public DFacilityVesselHistory getVes11() {
        return ves11;
    }

    /**
     * 提供施設情報12を取得します。
     * 
     * @return 提供施設情報12
     */
    public DFacilityVesselHistory getVes12() {
        return ves12;
    }

    /**
     * 提供施設情報2を取得します。
     * 
     * @return 提供施設情報2
     */
    public DFacilityVesselHistory getVes2() {
        return ves2;
    }

    /**
     * 提供施設情報3を取得します。
     * 
     * @return 提供施設情報3
     */
    public DFacilityVesselHistory getVes3() {
        return ves3;
    }

    /**
     * 提供施設情報4を取得します。
     * 
     * @return 提供施設情報4
     */
    public DFacilityVesselHistory getVes4() {
        return ves4;
    }

    /**
     * 提供施設情報5を取得します。
     * 
     * @return 提供施設情報5
     */
    public DFacilityVesselHistory getVes5() {
        return ves5;
    }

    /**
     * 提供施設情報6を取得します。
     * 
     * @return 提供施設情報6
     */
    public DFacilityVesselHistory getVes6() {
        return ves6;
    }

    /**
     * 提供施設情報7を取得します。
     * 
     * @return 提供施設情報7
     */
    public DFacilityVesselHistory getVes7() {
        return ves7;
    }

    /**
     * 提供施設情報8を取得します。
     * 
     * @return 提供施設情報8
     */
    public DFacilityVesselHistory getVes8() {
        return ves8;
    }

    /**
     * 提供施設情報9を取得します。
     * 
     * @return 提供施設情報9
     */
    public DFacilityVesselHistory getVes9() {
        return ves9;
    }

    /**
     * 提供施設情報1を設定します。
     * 
     * @param ves1
     *            提供施設情報1
     */
    public void setVes1(DFacilityVesselHistory ves1) {
        this.ves1 = ves1;
    }

    /**
     * 提供施設情報10を設定します。
     * 
     * @param ves10
     *            提供施設情報10
     */
    public void setVes10(DFacilityVesselHistory ves10) {
        this.ves10 = ves10;
    }

    /**
     * 提供施設情報11を設定します。
     * 
     * @param ves11
     *            提供施設情報11
     */
    public void setVes11(DFacilityVesselHistory ves11) {
        this.ves11 = ves11;
    }

    /**
     * 提供施設情報12を設定します。
     * 
     * @param ves12
     *            提供施設情報12
     */
    public void setVes12(DFacilityVesselHistory ves12) {
        this.ves12 = ves12;
    }

    /**
     * 提供施設情報2を設定します。
     * 
     * @param ves2
     *            提供施設情報2
     */
    public void setVes2(DFacilityVesselHistory ves2) {
        this.ves2 = ves2;
    }

    /**
     * 提供施設情報3を設定します。
     * 
     * @param ves3
     *            提供施設情報3
     */
    public void setVes3(DFacilityVesselHistory ves3) {
        this.ves3 = ves3;
    }

    /**
     * 提供施設情報4を設定します。
     * 
     * @param ves4
     *            提供施設情報4
     */
    public void setVes4(DFacilityVesselHistory ves4) {
        this.ves4 = ves4;
    }

    /**
     * 提供施設情報5を設定します。
     * 
     * @param ves5
     *            提供施設情報5
     */
    public void setVes5(DFacilityVesselHistory ves5) {
        this.ves5 = ves5;
    }

    /**
     * 提供施設情報6を設定します。
     * 
     * @param ves6
     *            提供施設情報6
     */
    public void setVes6(DFacilityVesselHistory ves6) {
        this.ves6 = ves6;
    }

    /**
     * 提供施設情報7を設定します。
     * 
     * @param ves7
     *            提供施設情報7
     */
    public void setVes7(DFacilityVesselHistory ves7) {
        this.ves7 = ves7;
    }

    /**
     * 提供施設情報8を設定します。
     * 
     * @param ves8
     *            提供施設情報8
     */
    public void setVes8(DFacilityVesselHistory ves8) {
        this.ves8 = ves8;
    }

    /**
     * 提供施設情報9を設定します。
     * 
     * @param ves9
     *            提供施設情報9
     */
    public void setVes9(DFacilityVesselHistory ves9) {
        this.ves9 = ves9;
    }

    /**
     * 施設_部屋備品 データをListとして取得します。
     * 
     * <pre></pre>
     * 
     * @return 施設_部屋備品リスト
     */
    public List<DFacilityVesselHistory> toList() {
        List<DFacilityVesselHistory> list = new ArrayList<DFacilityVesselHistory>();

        list.add(ves1);
        list.add(ves2);
        list.add(ves3);
        list.add(ves4);
        list.add(ves5);
        list.add(ves6);
        list.add(ves7);
        list.add(ves8);
        list.add(ves9);
        list.add(ves10);
        list.add(ves11);
        list.add(ves12);

        return list;
    }

}
