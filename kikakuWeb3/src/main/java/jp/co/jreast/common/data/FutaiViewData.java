package jp.co.jreast.common.data;

import jp.co.jreast.common.JreConstants;

public class FutaiViewData {
	/** �Q�ƃt���O(���̏ꍇ�F1�A�t�сF0 */
	private String readFutai=JreConstants.FLG_FALSE;
	/** no3���b�N�񊈐����f */
	private String readNo3=JreConstants.FLG_FALSE;
	/** no5���b�N�񊈐����f */
	private String readNo5=JreConstants.FLG_FALSE;
	//�ǉ��@�{�݃^�C�v�̔��ʍ��ڒǉ��@2010/05/14 s32472
	/** �{�݃^�C�v�̔���(���فA�z�e���A�X�L�[) */
	private String facType;
	/**
	 * @return readFutai
	 */
	public String getReadFutai() {
		return readFutai;
	}
	/**
	 * @param readFutai �ݒ肷�� readFutai
	 */
	public void setReadFutai(String readFutai) {
		this.readFutai = readFutai;
	}
	/**
	 * @return readNo3
	 */
	public String getReadNo3() {
		return readNo3;
	}
	/**
	 * @param readNo3 �ݒ肷�� readNo3
	 */
	public void setReadNo3(String readNo3) {
		this.readNo3 = readNo3;
	}
	/**
	 * @return readNo5
	 */
	public String getReadNo5() {
		return readNo5;
	}
	/**
	 * @param readNo5 �ݒ肷�� readNo5
	 */
	public void setReadNo5(String readNo5) {
		this.readNo5 = readNo5;
	}
	/**
	 * @return facType
	 */
	public String getFacType() {
		return facType;
	}
	/**
	 * @param facType �ݒ肷�� facType
	 */
	public void setFacType(String facType) {
		this.facType = facType;
	} 
}
