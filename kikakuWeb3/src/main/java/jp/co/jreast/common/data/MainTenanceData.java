package jp.co.jreast.common.data;

import java.util.Date;


/**
 * <pre>
 * NO1_�S���t�f�[�^�N���X�B.
 * �@�\�T�v    �F  �����e�i���X�J��action�̐�p�f�[�^.
 *�@���L����    �F  ����
 * </pre>
 * @author jinhuashi
 * @version 0.1 2006/11/24
 */
public class MainTenanceData {
	/**
	 * �����e�i���X�t���O.
	 */
	private String sysJTI;
	/**
	 * ����.
	 */
	private Date sysTMD;

	/**
	 * @return sysJTI
	 */
	public String getSysJTI() {
		return sysJTI;
	}

	/**
	 * @param sysJTI �ݒ肷�� sysJTI
	 */
	public void setSysJTI(String sysJTI) {
		this.sysJTI = sysJTI;
	}

	/**
	 * @return sysTMD
	 */
	public Date getSysTMD() {
		return sysTMD;
	}

	/**
	 * @param sysTMD �ݒ肷�� sysTMD
	 */
	public void setSysTMD(Date sysTMD) {
		this.sysTMD = sysTMD;
	}
	
}
