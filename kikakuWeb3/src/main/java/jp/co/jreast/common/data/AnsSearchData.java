package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;


/**
 * <pre>
 * ��挟���f�[�^�N���X�B.
 * �@�\�T�v    �F  ��挟���f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/10/27
 */
public class AnsSearchData extends PlanAnsBaseData implements InData{
	/**
	 * ���.
	 */
	private String kindFlg;

	/**
	 * @return Returns the kindFlg.
	 */
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * @param kindFlg The kindFlg to set.
	 */
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}
	
	//no1��ʂ���No2�f�[�^�̃R�s�[�������s���ꍇ�ˎ{�݃^�C�v��ʂ̂���(�^�C�v�ɂ���ĕۑ��悪�Ⴄ)�A�ǉ� s30873 START
	private String no2Type;

	/**
	 * @return no2Type
	 */
	public String getNo2Type() {
		return no2Type;
	}

	/**
	 * @param no2Type �ݒ肷�� no2Type
	 */
	public void setNo2Type(String no2Type) {
		this.no2Type = no2Type;
	}
	
	//no1��ʂ���No2�f�[�^�̃R�s�[�������s���ꍇ�ˎ{�݃^�C�v��ʂ̂���(�^�C�v�ɂ���ĕۑ��悪�Ⴄ)�A�ǉ� s30873 E N D
}
