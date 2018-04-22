package jp.co.jreast.common.validator;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.springframework.validation.BindingResult;

/**
 * FM�����`�F�b�N.
 * @author jinhuashi
 * 2007.1.15
 */
public class FMKanJiCheck implements Serializable {
	/**
	 * FM���������؂���.
	 * @param bean bean
	 * @param va ValidatorAction
	 * @param field ���؂�field
	 * @param errors �G���[�̏W��
	 * @param validator validator
	 * @param request request
	 * @return boolean
	 */
	public static boolean validateFMKanJi(Object bean, ValidatorAction va, Field field,
			BindingResult errors, Validator validator, HttpServletRequest request) {
		String value = null;
		//String�̃f�[�^���擾
		if (isString(bean)) {
			value = (String) bean;

		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}
		//�e�l���������؂���
		String rtn = validateOneString(value);
		if (rtn.length() < 1) { //�G���[���Ȃ��̏ꍇ
			//if (rtn.length() < 1 || rtn.trim().equals("")) { //�G���[���Ȃ��̏ꍇ
			return true;
		} else { //�G���[���L��̏ꍇ
			//	        	ActionMessage ams = Resources.getActionMessage(validator, request, va, field);
			//	        	String[] strings = (String[]) ams.getValues();
			//	        	errors.add(field.getKey(),  new ActionMessage("errors.FMKanji", strings[0], rtn
			//	        			.replaceAll("&", "&amp;")
			//	        			.replaceAll("<","&lt;")
			//	        			.replaceAll(">","&gt;")
			//	        			.replaceAll("\"","&quot;")
			//	        			.replaceAll("'","&#39;")
			//	        			));
			//errors.add(field.getKey(),  new ActionMessage("errors.FMKanji", rtn));
		}

		return true;
	}

	/**
	 * �ЂƂ�����FM���������؂���.
	 * @param input ���؂���������String
	 * @return FM�����ł͂Ȃ�����
	 */
	public static String validateOneString(String input) {
		byte[] bstr = null;
		int kjCode = 0xffff;
		String moji;
		String rtn = "";

		for (int i = 0; i < input.length(); i++) {
			moji = input.substring(i, i + 1);

			try {
				bstr = moji.getBytes("MS932");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			// 1�޲Ă̕���
			if (bstr.length < 2) {
				rtn = rtn + moji;
				continue;
			}

			// 2�޲Ă̕�������
			kjCode = bstr[0] << 8 & 0xffff ^ bstr[1] & 0xff;

			if (kjCode >= 0x8140 && kjCode <= 0x84BE
					|| kjCode >= 0x889F && kjCode <= 0x9872
					|| kjCode >= 0x989F && kjCode <= 0x9FFC
					|| kjCode >= 0xE040 && kjCode <= 0xEAA4) {
				continue;
			} else {
				rtn = rtn + moji;
			}
		}
		//���s�R�[�h�Ɣ��p�X�y�[�X�̃G���[���b�Z�[�W��u������
		rtn = rtn.replaceFirst("(\\r\\n)", "���s");
		rtn = rtn.replaceFirst(" ", "���p�X�y�[�X");
		rtn = rtn.replaceAll("(\\r\\n)", "");
		rtn = rtn.replaceAll(" ", "");
		return rtn;
	}

	/**
	    * �����񂩔ۂ����f����B Null�̏ꍇ��True�B.
	    *
	    * @param o �I�u�W�F�N�g
	    * @return �����񂩔ۂ�
	    */
	protected static boolean isString(Object o) {

		return o == null ? true : String.class.isInstance(o);
	}

	/**
	 * �f�t�H���g�o�[�W����ID�B.
	 */
	private static final long serialVersionUID = 1L;
}
