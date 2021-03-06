package com.example.demo.service.maintenance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.entity.maintenance.UserInfoEntity;
import com.example.demo.domain.repository.maintenance.UserInfoRepository;
import com.example.demo.specifications.CommonSpecifications;
import com.example.demo.web.form.maintenance.UserInfoForm;

/**
 * クラスの説明：ユーザーマスタサービス
 * @author kamagata
 * @since 2018/01/11
 */
@Service
@Transactional
public class UserInfoService {
	@Autowired
	UserInfoRepository userInfoRepository;

	@Autowired
	CommonSpecifications<UserInfoEntity> userInfoSpecifications;

	/**
	 * メソッドの説明：全件検索実行
	 * @author kamagata
	 * @since 2018/01/11
	 * @return UserInfoEntity ユーザーマスタエンティティ
	 */
	public List<UserInfoEntity> findAll() {
		return userInfoRepository.findAll();
	}

	/**
	 * メソッドの説明：検索条件による動的検索実行
	 * @author kamagata
	 * @param userInfoForm ユーザーマスタフォーム
	 * @since 2018/01/11
	 * @param sort ソート
	 * @return UserInfoEntity ユーザーマスタエンティティ
	 */
	public List<UserInfoEntity> findAllCustom(UserInfoForm userInfoForm, Sort sort) {
		return userInfoRepository.findAll(Specifications
				.where(userInfoSpecifications.conditionForLike("firstNm", userInfoForm.getSearchFirstNm()))
				.and(userInfoSpecifications.conditionForLike("lastNm", userInfoForm.getSearchLastNm()))
				.and(userInfoSpecifications.conditionForLike("email", userInfoForm.getSearchEmail()))
				.and(userInfoSpecifications.conditionForLike("phone", userInfoForm.getSearchPhone())), sort);
	}

	/**
	 * メソッドの説明：主キー検索
	 * @author kamagata
	 * @param userCd ユーザーコード
	 * @since 2018/01/13
	 * @return UserInfoEntity ユーザーマスタエンティティ
	 */
	public UserInfoEntity findOne(Integer userCd) {
		return userInfoRepository.findOne(userCd);
	}

	/**
	 * メソッドの説明：登録・更新実行
	 * @author kamagata
	 * @since 2018/01/11
	 * @param userInfoEntity ユーザーマスタエンティティ
	 * @return ユーザーマスタエンティティ
	 */
	public UserInfoEntity update(UserInfoEntity userInfoEntity) {
		return userInfoRepository.save(userInfoEntity);
	}

	/**
	 * メソッドの説明：削除実行
	 * @author kamagata
	 * @since 2018/01/11
	 * @param userCd ユーザーコード
	 */
	public void delete(Integer userCd) {
		userInfoRepository.delete(userCd);
	}
}
