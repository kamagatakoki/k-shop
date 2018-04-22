package com.example.demo.web.controller.shop;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.maintenance.GoodsEntity;
import com.example.demo.service.maintenance.GoodsService;

import Test.Blog;
import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;

/**
 * クラスの説明：ショップ　トップ画面コントローラー(
 * @author kamagata
 * @since 2018/01/23
 */
@Controller
@RequestMapping("/")
public class TopController {

	@Autowired
	MessageSource messageSource;

	@Autowired
	GoodsService goodsService;

	@Autowired
	List<GoodsEntity> goodsEntities;

	/**
	 * メソッドの説明：トップ画面表示
	 * @author kamagata
	 * @since 2018/01/27
	 * @param modelAndView モデルビュー
	 * @return ModelAndView モデルビュー
	 * @throws SQLException
	 */
	@GetMapping(path = "/")
	ModelAndView list(ModelAndView modelAndView) throws SQLException {

		System.out.println(messageSource.getMessage("typeMismatch", null, Locale.getDefault()));

		//		System.out.println(Greet.greet());
		//		DaoManagerDelegate.init("dao.xml");
		//
		//		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		//
		//		GenreLgEntity genreLgEntity = (GenreLgEntity) dao.queryForObject("getGenreLg", null);

		DaoManagerDelegate.startTransaction();

		IDao dao = DaoManagerDelegate.createDao(IDao.class);

		Blog blog = (Blog) dao.queryForObject("BlogMapper.selectBlogOne", null);
		System.out.println(blog.getGenreLgCd());

		List<Blog> blogs = dao.queryForList("BlogMapper.selectBlogAll", null);
		blogs.stream().forEach(System.out::println);

		Blog blog2 = new Blog();
		blog2.setGenreLgCd("88");
		blog2.setGenreLgNm("grjeiow");
		blog2.setDisplayOrder(77);
		blog2.setBiko("");
		blog2.setDeleteFlg("0");
		blog2.setInsertDt(new Date());
		blog2.setInsertCd(1113);
		blog2.setUpdateDt(new Date());
		blog2.setUpdateCd(null);

		dao.insert("insertBlog", blog2);

		DaoManagerDelegate.commitTransaction();

		blog2.setGenreLgNm("***********");

		dao.update("updateBlog", blog2);

		DaoManagerDelegate.commitTransaction();

		blog2.setGenreLgNm("------------");

		dao.update("updateBlog", blog2);

		DaoManagerDelegate.endTransaction();

		//		GenreLgEntity genreLgEntity = (GenreLgEntity) sqlMap.queryForObject("getGenreLg");

		// 商品情報取得
		List<GoodsEntity> goodsEntities = goodsService.findAll(new Sort("goodsCd"));

		// 遷移先画面
		modelAndView.addObject("items", goodsEntities);
		modelAndView.setViewName("shop/top");

		// 検索処理
		return modelAndView;
	}

	/**
	 * メソッドの説明：ジャンル検索
	 * @author kamagata
	 * @since 2018/01/27
	 * @param modelAndView モデル
	 * @param genreCd ジャンルコード(大、中、小いずれか)
	 * @return ModelAndView モデルビュー
	 */
	@GetMapping(path = "/shop/{genreCd}")
	ModelAndView searchGenreCd(ModelAndView modelAndView, @PathVariable String genreCd) {

		// 商品情報取得 パラメータの桁数でどのジャンルで検索するか判断する
		goodsEntities = goodsService.findBySomeGenreCd(genreCd);

		// 遷移先画面
		modelAndView.addObject("items", goodsEntities);
		modelAndView.setViewName("shop/top");

		// 検索処理
		return modelAndView;
	}

}
