package org.seasar.example.action.maintenance;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.example.entity.GenreLg;
import org.seasar.example.entity.GenreMd;
import org.seasar.example.form.GenreMdForm;
import org.seasar.example.service.GenreLgService;
import org.seasar.example.service.GenreMdService;
import org.seasar.example.service.GenreSmService;
import org.seasar.framework.beans.util.BeanMap;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;

/**
 * クラスの説明：中ジャンルアクション
 * @author kamagata
 * @since 2018/03/31
 */
public class GenreMdAction {

	/**
	 * フィールドの説明：大ジャンルフォーム
	 * @author kamagata
	 * @since 2018/03/31
	 */
	@Resource
	@ActionForm
	protected GenreMdForm genreMdForm;

	/**
	 * フィールドの説明：大ジャンルサービス
	 * @author kamagata
	 * @since 2018/03/31
	 */
	@Resource
	protected GenreLgService genreLgService;

	/**
	 * フィールドの説明：中ジャンルサービス
	 * @author kamagata
	 * @since 2018/04/02
	 */
	@Resource
	protected GenreMdService genreMdService;

	/**
	 * フィールドの説明：小ジャンルサービス
	 * @author kamagata
	 * @since 2018/04/02
	 */
	@Resource
	protected GenreSmService genreSmService;

	/**
	 * フィールドの説明：一覧表示用大ジャンルリスト
	 * @author kamagata
	 * @since 2018/03/31
	 */
	public List<GenreMd> genreMdList;

	/**
	 * フィールドの説明：ドロップダウン用大ジャンルリスト
	 * @author kamagata
	 * @since 2018/04/03
	 */
	public List<GenreLg> genreLgList;

	/**
	 * メソッドの説明：一覧表示
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false)
	public String index() {

		this.genreMdList = genreMdService.findAllOrderById();

		return "/maintenance/genremd_list.jsp";

	}

	/**
	 * メソッドの説明：一覧表示
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false)
	public String search() {

		BeanMap beanMap = new BeanMap();
		if (!genreMdForm.searchGenreLgCd.trim().isEmpty()) {
			beanMap.put("genreLgCd", genreMdForm.searchGenreLgCd);
		}
		if (!genreMdForm.searchGenreMdCd.trim().isEmpty()) {
			beanMap.put("genreMdCd", genreMdForm.searchGenreMdCd);
		}
		if (!genreMdForm.searchGenreLgNm.trim().isEmpty()) {
			beanMap.put("genreLg.genreLgNm", genreMdForm.searchGenreLgNm);
		}
		if (!genreMdForm.searchGenreMdNm.trim().isEmpty()) {
			beanMap.put("genreMdNm", genreMdForm.searchGenreMdNm);
		}

		this.genreMdList = genreMdService.findByCondition(beanMap);

		return "/maintenance/genremd_list.jsp";
	}

	/**
	 * メソッドの説明：新規画面表示
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false)
	public String newedit() {

		genreLgList = genreLgService.findAll();

		if (genreMdForm.crud.equals("update")) {
			GenreMd genreMd = genreMdService.findById(genreMdForm.genreMdCd);
			Beans.copy(genreMd, genreMdForm).execute();
		}
		return "/maintenance/genremd_newedit.jsp";
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false, input = "/maintenance/genreMd")
	public String delete() {

		// 下位ジャンル存在チェック
		if (genreSmService.countByGenreMdCd(genreMdForm.genreMdCd) > 0) {
			throw new ActionMessagesException("errors.duplicate", true);
		}

		GenreMd genreMd = new GenreMd();
		genreMd.genreMdCd = genreMdForm.genreMdCd;

		genreMdService.delete(genreMd);

		return index();
	}

	/**
	 * メソッドの説明：戻るボタン
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false)
	public String goToBack() {

		return index();
	}

	/**
	 * メソッドの説明：登録ボタン
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = true, input = "/maintenance/genremd_newedit.jsp")
	public String insert() {

		// formからentityにコピー
		GenreMd genreMd = new GenreMd();
		Beans.copy(genreMdForm, genreMd).execute();

		// 更新処理
		genreMdService.insert(genreMd);

		return index();
	}

	/**
	 * メソッドの説明：登録ボタン
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = true, input = "/maintenance/genremd_newedit.jsp")
	public String update() {

		// formからentityにコピー
		GenreMd genreMd = new GenreMd();
		Beans.copy(genreMdForm, genreMd).execute();

		// 更新処理
		genreMdService.update(genreMd);

		return index();
	}
}
