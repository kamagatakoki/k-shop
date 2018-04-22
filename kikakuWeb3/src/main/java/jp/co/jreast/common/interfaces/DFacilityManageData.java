package jp.co.jreast.common.interfaces;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.data.ddata.FacilityAckStatusData;
import jp.co.jreast.common.support.LabelValueBean;

/**
 * �{�ݕt�я��f�[�^ �C���^�[�t�F�[�X
 *
 * <pre>
 *   �@�\�T�v �F �{�ݕt�я��̋��ʍ��ڂ�ێ�����f�[�^�̃C���^�[�t�F�[�X�ł��B
 *   ���L���� �F
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public interface DFacilityManageData extends InData, OutData,
		DFacilityManageHeader {

	/**
	 * ���M�R�����g���擾���܂��B
	 *
	 * @return ���M�R�����g
	 */
	String getCmtTmpl();

	/**
	 * ���ፀ�ڃ��X�g���擾���܂��B
	 *
	 * @return ���ፀ�ڃ��X�g
	 */
	List<String> getDifferentProperties();

	/**
	 * �{�ݑ����F��񃊃X�g���擾���܂��B
	 *
	 * @return �{�ݑ����F��񃊃X�g
	 */
	List<FacilityAckStatusData> getFacilityAckStatusList();

	/**
	 * �{�݃^�C�v���擾���܂��B
	 *
	 * @return �{�݃^�C�v
	 */
	String getFacilityType();

	/**
	 * JR�����F��񃊃X�g���擾���܂��B
	 *
	 * @return JR�����F��񃊃X�g
	 */
	List<FacilityAckStatusData> getJrAckStatusList();

	/**
	 * �ŐV�̎{�ݑ����F�����擾���܂��B
	 *
	 * @return �ŐV�̎{�ݑ����F���
	 */
	FacilityAckStatusData getLatestFacilityAckStatus();

	/**
	 * �ŐV��JR�����F�����擾���܂��B
	 *
	 * @return �ŐV��JR�����F���
	 */
	FacilityAckStatusData getLatestJrAckStatus();

	/**
	 * �ӔC�҂��擾���܂��B
	 *
	 * @return �ӔC��
	 */
	String getResponsibler();

	/**
	 * �����������������f�[�^���擾���܂��B
	 *
	 * @return �����������������f�[�^
	 */
	DFacilityManageSearchData getSearchData();

	/**
	 * ���M�R�����g�e���v���[�g�i�Z���N�g�^�O�\���p�_�~�[�j���擾���܂��B
	 *
	 * @return ���M�R�����g�e���v���[�g�i�Z���N�g�^�O�\���p�_�~�[�j
	 */
	String getSendCmtTmpl();

	/**
	 * ���M�R�����g�e���v���[�g���X�g���擾���܂��B
	 *
	 * @return ���M�R�����g�e���v���[�g���X�g
	 */
	List<LabelValueBean> getSendCmtTmplList();

	/**
	 * �S���҂��擾���܂��B
	 *
	 * @return �S����
	 */
	String getTantousya();

	/**
	 * ���[�U�����擾���܂��B
	 *
	 * @return ���[�U���
	 */
	UserData getUserData();

	/**
	 * ���b�Z�[�W�iMail/Fax�j���M���s�i���M���s�����ꍇtrue�j���擾���܂��B
	 *
	 * @return ���b�Z�[�W�iMail/Fax�j���M���s�i���M���s�����ꍇtrue�j
	 */
	boolean isSendFailuer();

	/**
	 * ���͌��ؐ��ہi�G���[�������ꍇtrue�j���擾���܂��B
	 *
	 * @return ���͌��ؐ��ہi�G���[�������ꍇtrue�j
	 */
	boolean isValid();

	/**
	 * ���M�R�����g��ݒ肵�܂��B
	 *
	 * @param cmtTmpl
	 *            ���M�R�����g
	 */
	void setCmtTmpl(String cmtTmpl);

	/**
	 * �{�ݑ����F��񃊃X�g��ݒ肵�܂��B
	 *
	 * @param facilityAckStatusList
	 *            �{�ݑ����F��񃊃X�g
	 */
	void setFacilityAckStatusList(
			List<FacilityAckStatusData> facilityAckStatusList);

	/**
	 * �{�݃^�C�v��ݒ肵�܂��B
	 *
	 * @param facilityType
	 *            �{�݃^�C�v
	 */
	void setFacilityType(String facilityType);

	/**
	 * JR�����F��񃊃X�g��ݒ肵�܂��B
	 *
	 * @param jrAckStatusList
	 *            JR�����F��񃊃X�g
	 */
	void setJrAckStatusList(List<FacilityAckStatusData> jrAckStatusList);

	/**
	 * �ӔC�҂�ݒ肵�܂��B
	 *
	 * @param responsibler
	 *            �ӔC��
	 */
	void setResponsibler(String responsibler);

	/**
	 * �����������������f�[�^��ݒ肵�܂��B
	 *
	 * @param searchData
	 *            �����������������f�[�^
	 */
	void setSearchData(DFacilityManageSearchData searchData);

	/**
	 * ���M�R�����g�e���v���[�g�i�Z���N�g�^�O�\���p�_�~�[�j��ݒ肵�܂��B
	 *
	 * @param sendCmtTmpl
	 *            ���M�R�����g�e���v���[�g�i�Z���N�g�^�O�\���p�_�~�[�j
	 */
	void setSendCmtTmpl(String sendCmtTmpl);

	/**
	 * ���M�R�����g�e���v���[�g���X�g��ݒ肵�܂��B
	 *
	 * @param sendCmtTmplList
	 *            ���M�R�����g�e���v���[�g���X�g
	 */
	void setSendCmtTmplList(List<LabelValueBean> sendCmtTmplList);

	/**
	 * ���b�Z�[�W�iMail/Fax�j���M���s�i���M���s�����ꍇtrue�j��ݒ肵�܂��B
	 *
	 * @param sendFailuer
	 *            ���b�Z�[�W�iMail/Fax�j���M���s�i���M���s�����ꍇtrue�j
	 */
	void setSendFailuer(boolean sendFailuer);

	/**
	 * �S���҂�ݒ肵�܂��B
	 *
	 * @param tantousya
	 *            �S����
	 */
	void setTantousya(String tantousya);

	/**
	 * ���[�U����ݒ肵�܂��B
	 *
	 * @param userData
	 *            ���[�U���
	 */
	void setUserData(UserData userData);

	/**
	 * ���͌��ؐ��ہi�G���[�������ꍇtrue�j��ݒ肵�܂��B
	 *
	 * @param valid
	 *            ���͌��ؐ��ہi�G���[�������ꍇtrue�j
	 */
	void setValid(boolean valid);

}
