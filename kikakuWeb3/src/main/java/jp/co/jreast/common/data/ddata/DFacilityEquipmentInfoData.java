package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.EquipmentKind;

/**
 * [DP/RM]�{��_�ݔ� �f�[�^
 * 
 * <pre>
 *   �@�\�T�v �F  �{�ݕt�я��P�ʂ̑S�����̏���ێ����܂��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityEquipmentInfoData {

    /** �ٓ��ɃR���r�j�L�� */
    private DFacilityEquipmentHistory convenience;

    /** �t�B�b�g�l�X�{�ݗL�� */
    private DFacilityEquipmentHistory fitness;

    /** �Q�[���R�[�i�[�L�� */
    private DFacilityEquipmentHistory gameCorner;

    /** �ٓ��ɔ��X���� */
    private DFacilityEquipmentHistory inHouseStand;

    /** �C���^�[�l�b�g�ڑ����޽�L�� */
    private DFacilityEquipmentHistory internet;

    /** �J���I�PBOX�L�� */
    private DFacilityEquipmentHistory karaokeBox;

    /** �����h���[�T�[�r�X */
    private DFacilityEquipmentHistory laundryService;

    /** �}�b�T�[�W�T�[�r�X */
    private DFacilityEquipmentHistory massageService;

    /** �����ɐV���T�[�r�X�L�� */
    private DFacilityEquipmentHistory news;

    /** ���ԏ�i�����j�L�� */
    private DFacilityEquipmentHistory parkFree;

    /** ���ԏ�i�L���j�L�� */
    private DFacilityEquipmentHistory parkPay;

    /** �v�[���L��i�����j */
    private DFacilityEquipmentHistory poolIndoor;

    /** �v�[���L��i���O�j */
    private DFacilityEquipmentHistory poolOutside;

    /** ������݂��o�� */
    private DFacilityEquipmentHistory rentalHumidifier;

    /** �d�C�X�^���h�݂��o�� */
    private DFacilityEquipmentHistory rentalLamp;

    /** ���H�{�� */
    private DFacilityEquipmentHistory restaurant;

    /** ���[���T�[�r�X */
    private DFacilityEquipmentHistory roomService;

    /** SUICA���p�\�{�ݗL�� */
    private DFacilityEquipmentHistory suica;

    /** �싅��L�� */
    private DFacilityEquipmentHistory tableTennis;

    /** �M�ِ�p�e�j�X�R�[�g�L�� */
    private DFacilityEquipmentHistory tennisCourt;

    /** �Y�{���v���b�T�[�L�� */
    private DFacilityEquipmentHistory trouserPress;

    /**
     * �R���X�g���N�^
     */
    public DFacilityEquipmentInfoData() {
        super();
        this.karaokeBox = new DFacilityEquipmentHistory(
                EquipmentKind.KARAOKE_BOX.code());
        this.gameCorner = new DFacilityEquipmentHistory(
                EquipmentKind.GAME_CORNER.code());
        this.tennisCourt = new DFacilityEquipmentHistory(
                EquipmentKind.TENNIS_COURT.code());
        this.tableTennis = new DFacilityEquipmentHistory(
                EquipmentKind.TABLE_TENNIS.code());
        this.poolOutside = new DFacilityEquipmentHistory(
                EquipmentKind.POOL_OUTSIDE.code());
        this.poolIndoor = new DFacilityEquipmentHistory(
                EquipmentKind.POOL_INDOOR.code());
        this.fitness = new DFacilityEquipmentHistory(
                EquipmentKind.FITNESS.code());
        this.news = new DFacilityEquipmentHistory(EquipmentKind.NEWS.code());
        this.parkFree = new DFacilityEquipmentHistory(
                EquipmentKind.PARK_FREE.code());
        this.parkPay = new DFacilityEquipmentHistory(
                EquipmentKind.PARK_PAY.code());

        this.convenience = new DFacilityEquipmentHistory(
                EquipmentKind.CONVENIENCE.code());
        this.trouserPress = new DFacilityEquipmentHistory(
                EquipmentKind.TROUSER_PRESS.code());
        this.suica = new DFacilityEquipmentHistory(EquipmentKind.SUICA.code());
        this.internet = new DFacilityEquipmentHistory(
                EquipmentKind.INTERNET.code());
        this.inHouseStand = new DFacilityEquipmentHistory(
                EquipmentKind.IN_HOUSE_STAND.code());
        this.restaurant = new DFacilityEquipmentHistory(
                EquipmentKind.RESTAURANT.code());
        this.laundryService = new DFacilityEquipmentHistory(
                EquipmentKind.LAUNDRY_SERVICE.code());
        this.roomService = new DFacilityEquipmentHistory(
                EquipmentKind.ROOM_SERVICE.code());

        this.massageService = new DFacilityEquipmentHistory(
                EquipmentKind.MASSAGE_SERVICE.code());
        this.rentalHumidifier = new DFacilityEquipmentHistory(
                EquipmentKind.RENTAL_HUMIDIFIER.code());
        this.rentalLamp = new DFacilityEquipmentHistory(
                EquipmentKind.RENTAL_LAMP.code());
    }

    /**
     * �ٓ��ɃR���r�j�L����擾���܂��B
     * 
     * @return �ٓ��ɃR���r�j�L��
     */
    public DFacilityEquipmentHistory getConvenience() {
        return convenience;
    }

    /**
     * �u�ݔ���ʁv����{��_�ݔ����擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param equipmentKind
     *            �ݔ����
     * @return �{��_�ݔ�
     */
    public DFacilityEquipmentHistory getEquipment(int equipmentKind) {

        EquipmentKind enm = EquipmentKind.codeOf(equipmentKind);

        if (enm == null) {
            return new DFacilityEquipmentHistory(equipmentKind);
        }

        switch (enm) {
        case KARAOKE_BOX:
            return getKaraokeBox();
        case GAME_CORNER:
            return getGameCorner();
        case TENNIS_COURT:
            return getTennisCourt();
        case TABLE_TENNIS:
            return getTableTennis();
        case POOL_OUTSIDE:
            return getPoolOutside();
        case POOL_INDOOR:
            return getPoolIndoor();
        case FITNESS:
            return getFitness();
        case NEWS:
            return getNews();
        case PARK_FREE:
            return getParkFree();
        case PARK_PAY:
            return getParkPay();

        case CONVENIENCE:
            return getConvenience();
        case TROUSER_PRESS:
            return getTrouserPress();
        case SUICA:
            return getSuica();
        case INTERNET:
            return getInternet();
        case IN_HOUSE_STAND:
            return getInHouseStand();
        case RESTAURANT:
            return getRestaurant();
        case LAUNDRY_SERVICE:
            return getLaundryService();
        case ROOM_SERVICE:
            return getRoomService();

        case MASSAGE_SERVICE:
            return getMassageService();
        case RENTAL_HUMIDIFIER:
            return getRentalHumidifier();
        case RENTAL_LAMP:
            return getRentalLamp();

        default:
            return new DFacilityEquipmentHistory(enm.code());
        }

    }

    /**
     * �t�B�b�g�l�X�{�ݗL����擾���܂��B
     * 
     * @return �t�B�b�g�l�X�{�ݗL��
     */
    public DFacilityEquipmentHistory getFitness() {
        return fitness;
    }

    /**
     * �Q�[���R�[�i�[�L����擾���܂��B
     * 
     * @return �Q�[���R�[�i�[�L��
     */
    public DFacilityEquipmentHistory getGameCorner() {
        return gameCorner;
    }

    /**
     * �ٓ��ɔ��X������擾���܂��B
     * 
     * @return �ٓ��ɔ��X����
     */
    public DFacilityEquipmentHistory getInHouseStand() {
        return inHouseStand;
    }

    /**
     * �C���^�[�l�b�g�ڑ����޽�L����擾���܂��B
     * 
     * @return �C���^�[�l�b�g�ڑ����޽�L��
     */
    public DFacilityEquipmentHistory getInternet() {
        return internet;
    }

    /**
     * �J���I�PBOX�L����擾���܂��B
     * 
     * @return �J���I�PBOX�L��
     */
    public DFacilityEquipmentHistory getKaraokeBox() {
        return karaokeBox;
    }

    /**
     * �����h���[�T�[�r�X���擾���܂��B
     * 
     * @return �����h���[�T�[�r�X
     */
    public DFacilityEquipmentHistory getLaundryService() {
        return laundryService;
    }

    /**
     * �}�b�T�[�W�T�[�r�X���擾���܂��B
     * 
     * @return �}�b�T�[�W�T�[�r�X
     */
    public DFacilityEquipmentHistory getMassageService() {
        return massageService;
    }

    /**
     * �����ɐV���T�[�r�X�L����擾���܂��B
     * 
     * @return �����ɐV���T�[�r�X�L��
     */
    public DFacilityEquipmentHistory getNews() {
        return news;
    }

    /**
     * ���ԏ�i�����j�L����擾���܂��B
     * 
     * @return ���ԏ�i�����j�L��
     */
    public DFacilityEquipmentHistory getParkFree() {
        return parkFree;
    }

    /**
     * ���ԏ�i�L���j�L����擾���܂��B
     * 
     * @return ���ԏ�i�L���j�L��
     */
    public DFacilityEquipmentHistory getParkPay() {
        return parkPay;
    }

    /**
     * �v�[���L��i�����j���擾���܂��B
     * 
     * @return �v�[���L��i�����j
     */
    public DFacilityEquipmentHistory getPoolIndoor() {
        return poolIndoor;
    }

    /**
     * �v�[���L��i���O�j���擾���܂��B
     * 
     * @return �v�[���L��i���O�j
     */
    public DFacilityEquipmentHistory getPoolOutside() {
        return poolOutside;
    }

    /**
     * ������݂��o�����擾���܂��B
     * 
     * @return ������݂��o��
     */
    public DFacilityEquipmentHistory getRentalHumidifier() {
        return rentalHumidifier;
    }

    /**
     * �d�C�X�^���h�݂��o�����擾���܂��B
     * 
     * @return �d�C�X�^���h�݂��o��
     */
    public DFacilityEquipmentHistory getRentalLamp() {
        return rentalLamp;
    }

    /**
     * ���H�{�݂��擾���܂��B
     * 
     * @return ���H�{��
     */
    public DFacilityEquipmentHistory getRestaurant() {
        return restaurant;
    }

    /**
     * ���[���T�[�r�X���擾���܂��B
     * 
     * @return ���[���T�[�r�X
     */
    public DFacilityEquipmentHistory getRoomService() {
        return roomService;
    }

    /**
     * SUICA���p�\�{�ݗL����擾���܂��B
     * 
     * @return SUICA���p�\�{�ݗL��
     */
    public DFacilityEquipmentHistory getSuica() {
        return suica;
    }

    /**
     * �싅��L����擾���܂��B
     * 
     * @return �싅��L��
     */
    public DFacilityEquipmentHistory getTableTennis() {
        return tableTennis;
    }

    /**
     * �M�ِ�p�e�j�X�R�[�g�L����擾���܂��B
     * 
     * @return �M�ِ�p�e�j�X�R�[�g�L��
     */
    public DFacilityEquipmentHistory getTennisCourt() {
        return tennisCourt;
    }

    /**
     * �Y�{���v���b�T�[�L����擾���܂��B
     * 
     * @return �Y�{���v���b�T�[�L��
     */
    public DFacilityEquipmentHistory getTrouserPress() {
        return trouserPress;
    }

    /**
     * �ٓ��ɃR���r�j�L���ݒ肵�܂��B
     * 
     * @param convenience
     *            �ٓ��ɃR���r�j�L��
     */
    public void setConvenience(DFacilityEquipmentHistory convenience) {
        this.convenience = convenience;
    }

    /**
     * �t�B�b�g�l�X�{�ݗL���ݒ肵�܂��B
     * 
     * @param fitness
     *            �t�B�b�g�l�X�{�ݗL��
     */
    public void setFitness(DFacilityEquipmentHistory fitness) {
        this.fitness = fitness;
    }

    /**
     * �Q�[���R�[�i�[�L���ݒ肵�܂��B
     * 
     * @param gameCorner
     *            �Q�[���R�[�i�[�L��
     */
    public void setGameCorner(DFacilityEquipmentHistory gameCorner) {
        this.gameCorner = gameCorner;
    }

    /**
     * �ٓ��ɔ��X�����ݒ肵�܂��B
     * 
     * @param inHouseStand
     *            �ٓ��ɔ��X����
     */
    public void setInHouseStand(DFacilityEquipmentHistory inHouseStand) {
        this.inHouseStand = inHouseStand;
    }

    /**
     * �C���^�[�l�b�g�ڑ����޽�L���ݒ肵�܂��B
     * 
     * @param internet
     *            �C���^�[�l�b�g�ڑ����޽�L��
     */
    public void setInternet(DFacilityEquipmentHistory internet) {
        this.internet = internet;
    }

    /**
     * �J���I�PBOX�L���ݒ肵�܂��B
     * 
     * @param karaokeBox
     *            �J���I�PBOX�L��
     */
    public void setKaraokeBox(DFacilityEquipmentHistory karaokeBox) {
        this.karaokeBox = karaokeBox;
    }

    /**
     * �����h���[�T�[�r�X��ݒ肵�܂��B
     * 
     * @param laundryService
     *            �����h���[�T�[�r�X
     */
    public void setLaundryService(DFacilityEquipmentHistory laundryService) {
        this.laundryService = laundryService;
    }

    /**
     * �}�b�T�[�W�T�[�r�X��ݒ肵�܂��B
     * 
     * @param massageService
     *            �}�b�T�[�W�T�[�r�X
     */
    public void setMassageService(DFacilityEquipmentHistory massageService) {
        this.massageService = massageService;
    }

    /**
     * �����ɐV���T�[�r�X�L���ݒ肵�܂��B
     * 
     * @param news
     *            �����ɐV���T�[�r�X�L��
     */
    public void setNews(DFacilityEquipmentHistory news) {
        this.news = news;
    }

    /**
     * ���ԏ�i�����j�L���ݒ肵�܂��B
     * 
     * @param parkFree
     *            ���ԏ�i�����j�L��
     */
    public void setParkFree(DFacilityEquipmentHistory parkFree) {
        this.parkFree = parkFree;
    }

    /**
     * ���ԏ�i�L���j�L���ݒ肵�܂��B
     * 
     * @param parkPay
     *            ���ԏ�i�L���j�L��
     */
    public void setParkPay(DFacilityEquipmentHistory parkPay) {
        this.parkPay = parkPay;
    }

    /**
     * �v�[���L��i�����j��ݒ肵�܂��B
     * 
     * @param poolIndoor
     *            �v�[���L��i�����j
     */
    public void setPoolIndoor(DFacilityEquipmentHistory poolIndoor) {
        this.poolIndoor = poolIndoor;
    }

    /**
     * �v�[���L��i���O�j��ݒ肵�܂��B
     * 
     * @param poolOutside
     *            �v�[���L��i���O�j
     */
    public void setPoolOutside(DFacilityEquipmentHistory poolOutside) {
        this.poolOutside = poolOutside;
    }

    /**
     * ������݂��o����ݒ肵�܂��B
     * 
     * @param rentalHumidifier
     *            ������݂��o��
     */
    public void setRentalHumidifier(DFacilityEquipmentHistory rentalHumidifier) {
        this.rentalHumidifier = rentalHumidifier;
    }

    /**
     * �d�C�X�^���h�݂��o����ݒ肵�܂��B
     * 
     * @param rentalLamp
     *            �d�C�X�^���h�݂��o��
     */
    public void setRentalLamp(DFacilityEquipmentHistory rentalLamp) {
        this.rentalLamp = rentalLamp;
    }

    /**
     * ���H�{�݂�ݒ肵�܂��B
     * 
     * @param restaurant
     *            ���H�{��
     */
    public void setRestaurant(DFacilityEquipmentHistory restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * ���[���T�[�r�X��ݒ肵�܂��B
     * 
     * @param roomService
     *            ���[���T�[�r�X
     */
    public void setRoomService(DFacilityEquipmentHistory roomService) {
        this.roomService = roomService;
    }

    /**
     * SUICA���p�\�{�ݗL���ݒ肵�܂��B
     * 
     * @param suica
     *            SUICA���p�\�{�ݗL��
     */
    public void setSuica(DFacilityEquipmentHistory suica) {
        this.suica = suica;
    }

    /**
     * �싅��L���ݒ肵�܂��B
     * 
     * @param tableTennis
     *            �싅��L��
     */
    public void setTableTennis(DFacilityEquipmentHistory tableTennis) {
        this.tableTennis = tableTennis;
    }

    /**
     * �M�ِ�p�e�j�X�R�[�g�L���ݒ肵�܂��B
     * 
     * @param tennisCourt
     *            �M�ِ�p�e�j�X�R�[�g�L��
     */
    public void setTennisCourt(DFacilityEquipmentHistory tennisCourt) {
        this.tennisCourt = tennisCourt;
    }

    /**
     * �Y�{���v���b�T�[�L���ݒ肵�܂��B
     * 
     * @param trouserPress
     *            �Y�{���v���b�T�[�L��
     */
    public void setTrouserPress(DFacilityEquipmentHistory trouserPress) {
        this.trouserPress = trouserPress;
    }

    /**
     * �{��_�ݔ� �f�[�^��List�Ƃ��Ď擾���܂��B
     * 
     * <pre></pre>
     * 
     * @return �{��_�ݔ����X�g
     */
    public List<DFacilityEquipmentHistory> toList() {
        List<DFacilityEquipmentHistory> list = new ArrayList<DFacilityEquipmentHistory>();

        list.add(karaokeBox);
        list.add(gameCorner);
        list.add(tennisCourt);
        list.add(tableTennis);
        list.add(poolOutside);
        list.add(poolIndoor);
        list.add(fitness);
        list.add(news);
        list.add(parkFree);
        list.add(parkPay);

        list.add(convenience);
        list.add(trouserPress);
        list.add(suica);
        list.add(internet);
        list.add(inHouseStand);
        list.add(restaurant);
        list.add(laundryService);
        list.add(roomService);

        list.add(massageService);
        list.add(rentalHumidifier);
        list.add(rentalLamp);

        return list;
    }

}
