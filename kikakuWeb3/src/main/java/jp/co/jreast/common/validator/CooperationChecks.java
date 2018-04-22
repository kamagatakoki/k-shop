package jp.co.jreast.common.validator;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.Arg;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.springframework.validation.BindingResult;

/**
 * ����WEB�A�g�Ώۍ��ړ��͒l����
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class CooperationChecks extends FMKanJiCheck implements Serializable {

	/** �֎~�����W�� */
	private static final String EXCLUDES = "�����������߁��ہځ恿��";

	/**
	 * �f�t�H���g�o�[�W����ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ���ؑΏۂ̃t�B�[���h�l�𕶎���Ŏ擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @see org.apache.struts.validator.FieldChecks#evaluateBean(Object, Field)
	 * @param bean
	 *            ���ؑΏۂ�Bean
	 * @param field
	 *            �t�B�[���h
	 * @return ���ؑΏۂ̃t�B�[���h�l
	 */
	private static String evaluateBean(Object bean, Field field) {
		if (isString(bean)) {
			return (String) bean;
		} else {
			return ValidatorUtils.getValueAsString(bean, field.getProperty());
		}
	}

	/**
	 * �g�p�\�������؂����{���܂��B
	 *
	 * <pre>
	 * </pre>
	 *
	 * @param value
	 *            ���ؑΏۂ̕�����
	 * @return ����OK�̏ꍇ�͋󕶎���A����NG�̏ꍇ�͊Y������������Ԃ��܂��B�i�Y�����邷�ׂĂ̕�����Ԃ��܂��j
	 */
	public static String findIllegalChar(String value) {

		String input = value;

		if (StringUtils.isEmpty(input)) {
			return "";
		}

		// FM�����`�F�b�N�����{
		String fmKanjiCheckResult = validateOneString(input);

		// �Y�������֎~������ێ�
		StringBuilder illegalChars = new StringBuilder(fmKanjiCheckResult);

		// �ǉ��̋֎~�����`�F�b�N
		char[] excludeChars = EXCLUDES.toCharArray();
		for (char c : excludeChars) {
			// �֎~�����i�ꕶ���j
			String str = String.valueOf(c);

			// ���ؑΏۂɊ܂܂�Ă���ꍇ�͂��̕�����Ԃ�
			if (input.contains(str)) {
				illegalChars.append(str);
			}
		}

		return illegalChars.toString();
	}

	/**
	 * �g�p�\��������
	 *
	 * <pre>
	 * FM�����`�F�b�N�ɉ����AFM�����`�F�b�N�ł͋��e����Ă��܂��ꕔ�̕������֎~���܂��B
	 * </pre>
	 *
	 * @param bean
	 *            ���ؑΏۂ�Bean
	 * @param va
	 *            ValidatorAction
	 * @param field
	 *            �t�B�[���h
	 * @param errors
	 *            ActionMessages
	 * @param validator
	 *            Validator
	 * @param request
	 *            HttpServletRequest
	 * @return ����OK�̏ꍇtrue
	 */
	public static boolean validateIgnoreChars(Object bean, ValidatorAction va,
			Field field, BindingResult errors, Validator validator,
			HttpServletRequest request) {

		String value = evaluateBean(bean, field);

		String illegalChar = findIllegalChar(value);

		if (StringUtils.isEmpty(illegalChar)) {
			// ����OK
			return true;
		}

		// ���؃G���[���b�Z�[�W�̑�2�p�����[�^��ǉ�
		Arg arg = new Arg();
		arg.setName(va.getName());
		arg.setPosition(1);
		arg.setResource(false);
		arg.setKey(illegalChar);
		field.addArg(arg);

		// ���؃G���[���b�Z�[�W���擾
		//		ActionMessage msg = Resources.getActionMessage(validator, request, va,
		//				field);
		//		errors.add(field.getKey(), msg);

		return false;
	}

}
