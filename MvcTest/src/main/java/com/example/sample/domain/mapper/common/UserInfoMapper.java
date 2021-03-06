package com.example.sample.domain.mapper.common;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import com.example.sample.domain.entity.common.UserInfoCriteria;
import com.example.sample.domain.entity.common.UserInfoEntity;

@Mapper
public interface UserInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	long countByCriteria(UserInfoCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	int deleteByCriteria(UserInfoCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	@Delete({ "delete from USER_INFO", "where USER_CD = #{userCd,jdbcType=DECIMAL}" })
	int deleteByPrimaryKey(Long userCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	@Insert({ "insert into USER_INFO (USER_CD, FIRST_NM, ", "LAST_NM, EMAIL, PHONE, ", "PASSWORD, AUTH, BIKO, ",
			"DELETE_FLG, INSERT_DT, ", "INSERT_CD, UPDATE_DT, ", "UPDATE_CD)",
			"values (#{userCd,jdbcType=DECIMAL}, #{firstNm,jdbcType=VARCHAR}, ",
			"#{lastNm,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{phone,jdbcType=DECIMAL}, ",
			"#{password,jdbcType=VARCHAR}, #{auth,jdbcType=CHAR}, #{biko,jdbcType=VARCHAR}, ",
			"#{deleteFlg,jdbcType=CHAR}, #{insertDt,jdbcType=TIMESTAMP}, ",
			"#{insertCd,jdbcType=DECIMAL}, #{updateDt,jdbcType=TIMESTAMP}, ", "#{updateCd,jdbcType=DECIMAL})" })
	int insert(UserInfoEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	int insertSelective(UserInfoEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	List<UserInfoEntity> selectByCriteriaWithRowbounds(UserInfoCriteria example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	List<UserInfoEntity> selectByCriteria(UserInfoCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	@Select({ "select", "USR.USER_CD as USR_USER_CD, USR.FIRST_NM as USR_FIRST_NM, USR.LAST_NM as USR_LAST_NM, ",
			"USR.EMAIL as USR_EMAIL, USR.PHONE as USR_PHONE, USR.PASSWORD as USR_PASSWORD, ",
			"USR.AUTH as USR_AUTH, USR.BIKO as USR_BIKO, USR.DELETE_FLG as USR_DELETE_FLG, ",
			"USR.INSERT_DT as USR_INSERT_DT, USR.INSERT_CD as USR_INSERT_CD, USR.UPDATE_DT as USR_UPDATE_DT, ",
			"USR.UPDATE_CD as USR_UPDATE_CD", "from USER_INFO USR", "where USR.USER_CD = #{userCd,jdbcType=DECIMAL}" })
	@ResultMap("com.example.sample.domain.mapper.common.UserInfoMapper.BaseResultMap")
	UserInfoEntity selectByPrimaryKey(Long userCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	int updateByCriteriaSelective(@Param("record") UserInfoEntity record, @Param("example") UserInfoCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	int updateByCriteria(@Param("record") UserInfoEntity record, @Param("example") UserInfoCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(UserInfoEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table USER_INFO
	 * @mbg.generated
	 */
	@Update({ "update USER_INFO", "set FIRST_NM = #{firstNm,jdbcType=VARCHAR},", "LAST_NM = #{lastNm,jdbcType=VARCHAR},",
			"EMAIL = #{email,jdbcType=VARCHAR},", "PHONE = #{phone,jdbcType=DECIMAL},",
			"PASSWORD = #{password,jdbcType=VARCHAR},", "AUTH = #{auth,jdbcType=CHAR},", "BIKO = #{biko,jdbcType=VARCHAR},",
			"DELETE_FLG = #{deleteFlg,jdbcType=CHAR},", "INSERT_DT = #{insertDt,jdbcType=TIMESTAMP},",
			"INSERT_CD = #{insertCd,jdbcType=DECIMAL},", "UPDATE_DT = #{updateDt,jdbcType=TIMESTAMP},",
			"UPDATE_CD = #{updateCd,jdbcType=DECIMAL}", "where USER_CD = #{userCd,jdbcType=DECIMAL}" })
	int updateByPrimaryKey(UserInfoEntity record);
}