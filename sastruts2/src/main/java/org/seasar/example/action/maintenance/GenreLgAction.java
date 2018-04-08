package org.seasar.example.action.maintenance;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.example.entity.GenreLg;
import org.seasar.example.form.GenreLgForm;
import org.seasar.example.service.GenreLgService;
import org.seasar.example.service.GenreMdService;
import org.seasar.framework.beans.util.BeanMap;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;

/**
 * クラスの説明：大ジャンルアクション
 * @author kamagata
 * @since 2018/03/31
 */
public class GenreLgAction {

	/**
	 * フィールドの説明：大ジャンルフォーム
	 * @author kamagata
	 * @since 2018/03/31
	 */
	@Resource
	@ActionForm
	protected GenreLgForm genreLgForm;

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
	 * フィールドの説明：一覧表示用大ジャンルリスト
	 * @author kamagata
	 * @since 2018/03/31
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

		this.genreLgList = genreLgService.findAll();

		return "/maintenance/genrelg_list.jsp";

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
		if (!genreLgForm.searchGenreLgCd.trim().isEmpty()) {
			beanMap.put("genreLgCd", genreLgForm.searchGenreLgCd);
		}
		if (!genreLgForm.searchGenreLgNm.trim().isEmpty()) {
			beanMap.put("genreLgNm", "%" + genreLgForm.searchGenreLgNm + "%");
		}

		this.genreLgList = genreLgService.findByCondition(beanMap);

		return "/maintenance/genrelg_list.jsp";
	}

	/**
	 * メソッドの説明：新規画面表示
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false)
	public String newedit() {

		if (genreLgForm.crud.equals("update")) {
			GenreLg genreLg = genreLgService.findById(genreLgForm.genreLgCd);
			Beans.copy(genreLg, genreLgForm).execute();
		}
		return "/maintenance/genrelg_newedit.jsp";
	}

	/**
	 * メソッドの説明：削除
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = false, input = "/maintenance/genreLg")
	public String delete() {

		// 下位ジャンル存在チェック
		if (genreMdService.countByGenreLgCd(genreLgForm.genreLgCd) > 0) {
			throw new ActionMessagesException("errors.duplicate", true);
		}

		GenreLg genreLg = new GenreLg();
		genreLg.genreLgCd = genreLgForm.genreLgCd;

		genreLgService.delete(genreLg);

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
	@Execute(validator = true, input = "/maintenance/genrelg_newedit.jsp")
	public String insert() {

		// formからentityにコピー
		GenreLg genreLg = new GenreLg();
		Beans.copy(genreLgForm, genreLg).execute();

		// 更新処理
		genreLgService.insert(genreLg);

		return index();
	}

	/**
	 * メソッドの説明：登録ボタン
	 * @author kamagata
	 * @since 2018/03/31
	 * @return 一覧jsp
	 */
	@Execute(validator = true, input = "/maintenance/genrelg_newedit.jsp")
	public String update() {

		// formからentityにコピー
		GenreLg genreLg = new GenreLg();
		Beans.copy(genreLgForm, genreLg).execute();

		// 更新処理
		genreLgService.update(genreLg);

		return index();
	}
}
