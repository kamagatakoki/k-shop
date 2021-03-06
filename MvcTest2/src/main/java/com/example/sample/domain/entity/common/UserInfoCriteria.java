package com.example.sample.domain.entity.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserInfoCriteria {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public UserInfoCriteria() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUserCdIsNull() {
			addCriterion("USR.USER_CD is null");
			return (Criteria) this;
		}

		public Criteria andUserCdIsNotNull() {
			addCriterion("USR.USER_CD is not null");
			return (Criteria) this;
		}

		public Criteria andUserCdEqualTo(Long value) {
			addCriterion("USR.USER_CD =", value, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdNotEqualTo(Long value) {
			addCriterion("USR.USER_CD <>", value, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdGreaterThan(Long value) {
			addCriterion("USR.USER_CD >", value, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdGreaterThanOrEqualTo(Long value) {
			addCriterion("USR.USER_CD >=", value, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdLessThan(Long value) {
			addCriterion("USR.USER_CD <", value, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdLessThanOrEqualTo(Long value) {
			addCriterion("USR.USER_CD <=", value, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdIn(List<Long> values) {
			addCriterion("USR.USER_CD in", values, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdNotIn(List<Long> values) {
			addCriterion("USR.USER_CD not in", values, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdBetween(Long value1, Long value2) {
			addCriterion("USR.USER_CD between", value1, value2, "userCd");
			return (Criteria) this;
		}

		public Criteria andUserCdNotBetween(Long value1, Long value2) {
			addCriterion("USR.USER_CD not between", value1, value2, "userCd");
			return (Criteria) this;
		}

		public Criteria andFirstNmIsNull() {
			addCriterion("USR.FIRST_NM is null");
			return (Criteria) this;
		}

		public Criteria andFirstNmIsNotNull() {
			addCriterion("USR.FIRST_NM is not null");
			return (Criteria) this;
		}

		public Criteria andFirstNmEqualTo(String value) {
			addCriterion("USR.FIRST_NM =", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmNotEqualTo(String value) {
			addCriterion("USR.FIRST_NM <>", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmGreaterThan(String value) {
			addCriterion("USR.FIRST_NM >", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmGreaterThanOrEqualTo(String value) {
			addCriterion("USR.FIRST_NM >=", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmLessThan(String value) {
			addCriterion("USR.FIRST_NM <", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmLessThanOrEqualTo(String value) {
			addCriterion("USR.FIRST_NM <=", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmLike(String value) {
			addCriterion("USR.FIRST_NM like", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmNotLike(String value) {
			addCriterion("USR.FIRST_NM not like", value, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmIn(List<String> values) {
			addCriterion("USR.FIRST_NM in", values, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmNotIn(List<String> values) {
			addCriterion("USR.FIRST_NM not in", values, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmBetween(String value1, String value2) {
			addCriterion("USR.FIRST_NM between", value1, value2, "firstNm");
			return (Criteria) this;
		}

		public Criteria andFirstNmNotBetween(String value1, String value2) {
			addCriterion("USR.FIRST_NM not between", value1, value2, "firstNm");
			return (Criteria) this;
		}

		public Criteria andLastNmIsNull() {
			addCriterion("USR.LAST_NM is null");
			return (Criteria) this;
		}

		public Criteria andLastNmIsNotNull() {
			addCriterion("USR.LAST_NM is not null");
			return (Criteria) this;
		}

		public Criteria andLastNmEqualTo(String value) {
			addCriterion("USR.LAST_NM =", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmNotEqualTo(String value) {
			addCriterion("USR.LAST_NM <>", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmGreaterThan(String value) {
			addCriterion("USR.LAST_NM >", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmGreaterThanOrEqualTo(String value) {
			addCriterion("USR.LAST_NM >=", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmLessThan(String value) {
			addCriterion("USR.LAST_NM <", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmLessThanOrEqualTo(String value) {
			addCriterion("USR.LAST_NM <=", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmLike(String value) {
			addCriterion("USR.LAST_NM like", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmNotLike(String value) {
			addCriterion("USR.LAST_NM not like", value, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmIn(List<String> values) {
			addCriterion("USR.LAST_NM in", values, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmNotIn(List<String> values) {
			addCriterion("USR.LAST_NM not in", values, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmBetween(String value1, String value2) {
			addCriterion("USR.LAST_NM between", value1, value2, "lastNm");
			return (Criteria) this;
		}

		public Criteria andLastNmNotBetween(String value1, String value2) {
			addCriterion("USR.LAST_NM not between", value1, value2, "lastNm");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("USR.EMAIL is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("USR.EMAIL is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("USR.EMAIL =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("USR.EMAIL <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("USR.EMAIL >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("USR.EMAIL >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("USR.EMAIL <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("USR.EMAIL <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("USR.EMAIL like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("USR.EMAIL not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("USR.EMAIL in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("USR.EMAIL not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("USR.EMAIL between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("USR.EMAIL not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("USR.PHONE is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("USR.PHONE is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(Long value) {
			addCriterion("USR.PHONE =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(Long value) {
			addCriterion("USR.PHONE <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(Long value) {
			addCriterion("USR.PHONE >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
			addCriterion("USR.PHONE >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(Long value) {
			addCriterion("USR.PHONE <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(Long value) {
			addCriterion("USR.PHONE <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<Long> values) {
			addCriterion("USR.PHONE in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<Long> values) {
			addCriterion("USR.PHONE not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(Long value1, Long value2) {
			addCriterion("USR.PHONE between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(Long value1, Long value2) {
			addCriterion("USR.PHONE not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("USR.PASSWORD is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("USR.PASSWORD is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("USR.PASSWORD =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("USR.PASSWORD <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("USR.PASSWORD >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("USR.PASSWORD >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("USR.PASSWORD <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("USR.PASSWORD <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("USR.PASSWORD like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("USR.PASSWORD not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("USR.PASSWORD in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("USR.PASSWORD not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("USR.PASSWORD between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("USR.PASSWORD not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andAuthIsNull() {
			addCriterion("USR.AUTH is null");
			return (Criteria) this;
		}

		public Criteria andAuthIsNotNull() {
			addCriterion("USR.AUTH is not null");
			return (Criteria) this;
		}

		public Criteria andAuthEqualTo(String value) {
			addCriterion("USR.AUTH =", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthNotEqualTo(String value) {
			addCriterion("USR.AUTH <>", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthGreaterThan(String value) {
			addCriterion("USR.AUTH >", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthGreaterThanOrEqualTo(String value) {
			addCriterion("USR.AUTH >=", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthLessThan(String value) {
			addCriterion("USR.AUTH <", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthLessThanOrEqualTo(String value) {
			addCriterion("USR.AUTH <=", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthLike(String value) {
			addCriterion("USR.AUTH like", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthNotLike(String value) {
			addCriterion("USR.AUTH not like", value, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthIn(List<String> values) {
			addCriterion("USR.AUTH in", values, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthNotIn(List<String> values) {
			addCriterion("USR.AUTH not in", values, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthBetween(String value1, String value2) {
			addCriterion("USR.AUTH between", value1, value2, "auth");
			return (Criteria) this;
		}

		public Criteria andAuthNotBetween(String value1, String value2) {
			addCriterion("USR.AUTH not between", value1, value2, "auth");
			return (Criteria) this;
		}

		public Criteria andBikoIsNull() {
			addCriterion("USR.BIKO is null");
			return (Criteria) this;
		}

		public Criteria andBikoIsNotNull() {
			addCriterion("USR.BIKO is not null");
			return (Criteria) this;
		}

		public Criteria andBikoEqualTo(String value) {
			addCriterion("USR.BIKO =", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoNotEqualTo(String value) {
			addCriterion("USR.BIKO <>", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoGreaterThan(String value) {
			addCriterion("USR.BIKO >", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoGreaterThanOrEqualTo(String value) {
			addCriterion("USR.BIKO >=", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoLessThan(String value) {
			addCriterion("USR.BIKO <", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoLessThanOrEqualTo(String value) {
			addCriterion("USR.BIKO <=", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoLike(String value) {
			addCriterion("USR.BIKO like", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoNotLike(String value) {
			addCriterion("USR.BIKO not like", value, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoIn(List<String> values) {
			addCriterion("USR.BIKO in", values, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoNotIn(List<String> values) {
			addCriterion("USR.BIKO not in", values, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoBetween(String value1, String value2) {
			addCriterion("USR.BIKO between", value1, value2, "biko");
			return (Criteria) this;
		}

		public Criteria andBikoNotBetween(String value1, String value2) {
			addCriterion("USR.BIKO not between", value1, value2, "biko");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIsNull() {
			addCriterion("USR.DELETE_FLG is null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIsNotNull() {
			addCriterion("USR.DELETE_FLG is not null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgEqualTo(String value) {
			addCriterion("USR.DELETE_FLG =", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotEqualTo(String value) {
			addCriterion("USR.DELETE_FLG <>", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgGreaterThan(String value) {
			addCriterion("USR.DELETE_FLG >", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgGreaterThanOrEqualTo(String value) {
			addCriterion("USR.DELETE_FLG >=", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLessThan(String value) {
			addCriterion("USR.DELETE_FLG <", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLessThanOrEqualTo(String value) {
			addCriterion("USR.DELETE_FLG <=", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLike(String value) {
			addCriterion("USR.DELETE_FLG like", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotLike(String value) {
			addCriterion("USR.DELETE_FLG not like", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIn(List<String> values) {
			addCriterion("USR.DELETE_FLG in", values, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotIn(List<String> values) {
			addCriterion("USR.DELETE_FLG not in", values, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgBetween(String value1, String value2) {
			addCriterion("USR.DELETE_FLG between", value1, value2, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotBetween(String value1, String value2) {
			addCriterion("USR.DELETE_FLG not between", value1, value2, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andInsertDtIsNull() {
			addCriterion("USR.INSERT_DT is null");
			return (Criteria) this;
		}

		public Criteria andInsertDtIsNotNull() {
			addCriterion("USR.INSERT_DT is not null");
			return (Criteria) this;
		}

		public Criteria andInsertDtEqualTo(Date value) {
			addCriterion("USR.INSERT_DT =", value, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtNotEqualTo(Date value) {
			addCriterion("USR.INSERT_DT <>", value, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtGreaterThan(Date value) {
			addCriterion("USR.INSERT_DT >", value, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtGreaterThanOrEqualTo(Date value) {
			addCriterion("USR.INSERT_DT >=", value, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtLessThan(Date value) {
			addCriterion("USR.INSERT_DT <", value, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtLessThanOrEqualTo(Date value) {
			addCriterion("USR.INSERT_DT <=", value, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtIn(List<Date> values) {
			addCriterion("USR.INSERT_DT in", values, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtNotIn(List<Date> values) {
			addCriterion("USR.INSERT_DT not in", values, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtBetween(Date value1, Date value2) {
			addCriterion("USR.INSERT_DT between", value1, value2, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertDtNotBetween(Date value1, Date value2) {
			addCriterion("USR.INSERT_DT not between", value1, value2, "insertDt");
			return (Criteria) this;
		}

		public Criteria andInsertCdIsNull() {
			addCriterion("USR.INSERT_CD is null");
			return (Criteria) this;
		}

		public Criteria andInsertCdIsNotNull() {
			addCriterion("USR.INSERT_CD is not null");
			return (Criteria) this;
		}

		public Criteria andInsertCdEqualTo(Long value) {
			addCriterion("USR.INSERT_CD =", value, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdNotEqualTo(Long value) {
			addCriterion("USR.INSERT_CD <>", value, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdGreaterThan(Long value) {
			addCriterion("USR.INSERT_CD >", value, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdGreaterThanOrEqualTo(Long value) {
			addCriterion("USR.INSERT_CD >=", value, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdLessThan(Long value) {
			addCriterion("USR.INSERT_CD <", value, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdLessThanOrEqualTo(Long value) {
			addCriterion("USR.INSERT_CD <=", value, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdIn(List<Long> values) {
			addCriterion("USR.INSERT_CD in", values, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdNotIn(List<Long> values) {
			addCriterion("USR.INSERT_CD not in", values, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdBetween(Long value1, Long value2) {
			addCriterion("USR.INSERT_CD between", value1, value2, "insertCd");
			return (Criteria) this;
		}

		public Criteria andInsertCdNotBetween(Long value1, Long value2) {
			addCriterion("USR.INSERT_CD not between", value1, value2, "insertCd");
			return (Criteria) this;
		}

		public Criteria andUpdateDtIsNull() {
			addCriterion("USR.UPDATE_DT is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDtIsNotNull() {
			addCriterion("USR.UPDATE_DT is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDtEqualTo(Date value) {
			addCriterion("USR.UPDATE_DT =", value, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtNotEqualTo(Date value) {
			addCriterion("USR.UPDATE_DT <>", value, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtGreaterThan(Date value) {
			addCriterion("USR.UPDATE_DT >", value, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtGreaterThanOrEqualTo(Date value) {
			addCriterion("USR.UPDATE_DT >=", value, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtLessThan(Date value) {
			addCriterion("USR.UPDATE_DT <", value, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtLessThanOrEqualTo(Date value) {
			addCriterion("USR.UPDATE_DT <=", value, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtIn(List<Date> values) {
			addCriterion("USR.UPDATE_DT in", values, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtNotIn(List<Date> values) {
			addCriterion("USR.UPDATE_DT not in", values, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtBetween(Date value1, Date value2) {
			addCriterion("USR.UPDATE_DT between", value1, value2, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateDtNotBetween(Date value1, Date value2) {
			addCriterion("USR.UPDATE_DT not between", value1, value2, "updateDt");
			return (Criteria) this;
		}

		public Criteria andUpdateCdIsNull() {
			addCriterion("USR.UPDATE_CD is null");
			return (Criteria) this;
		}

		public Criteria andUpdateCdIsNotNull() {
			addCriterion("USR.UPDATE_CD is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateCdEqualTo(Long value) {
			addCriterion("USR.UPDATE_CD =", value, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdNotEqualTo(Long value) {
			addCriterion("USR.UPDATE_CD <>", value, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdGreaterThan(Long value) {
			addCriterion("USR.UPDATE_CD >", value, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdGreaterThanOrEqualTo(Long value) {
			addCriterion("USR.UPDATE_CD >=", value, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdLessThan(Long value) {
			addCriterion("USR.UPDATE_CD <", value, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdLessThanOrEqualTo(Long value) {
			addCriterion("USR.UPDATE_CD <=", value, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdIn(List<Long> values) {
			addCriterion("USR.UPDATE_CD in", values, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdNotIn(List<Long> values) {
			addCriterion("USR.UPDATE_CD not in", values, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdBetween(Long value1, Long value2) {
			addCriterion("USR.UPDATE_CD between", value1, value2, "updateCd");
			return (Criteria) this;
		}

		public Criteria andUpdateCdNotBetween(Long value1, Long value2) {
			addCriterion("USR.UPDATE_CD not between", value1, value2, "updateCd");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
	 * This class was generated by MyBatis Generator.
	 * This class corresponds to the database table USER_INFO
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}
}