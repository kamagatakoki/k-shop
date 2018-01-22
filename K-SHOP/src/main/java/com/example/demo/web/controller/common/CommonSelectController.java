package com.example.demo.web.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.common.CommonService;

/**
 * クラスの説明：画像表示用RESTコントローラー
 * @author kamagata
 * @since 2018/01/17
 */
@Controller
@RequestMapping("/maintenance/common")
public class CommonSelectController {

	@Autowired
	CommonService commonService;

	/**
	 * メソッドの説明：中ジャンル要素取得
	 * @author kamagata
	 * @param model モデル
	 * @param genreLgCd 大ジャンルコード
	 * @param fragment フラグメント名
	 * @since 2018/01/20
	 * @return ModelAndView モデル
	 */
	@GetMapping(value = "/genremd")
	public String getGenreMdList(Model model, String genreLgCd, String fragment) {

		model.addAttribute("genreMdSelectItems", commonService.findGenreMdList(genreLgCd));

		return fragment;

	}

	/**
	 * メソッドの説明：小ジャンル要素取得
	 * @author kamagata
	 * @param model モデル
	 * @param genreMdCd 中ジャンルコード
	 * @param fragment フラグメント名
	 * @since 2018/01/20
	 * @return ModelAndView モデル
	 */
	@GetMapping(value = "/genresm")
	public String getGenreSmList(Model model, String genreMdCd, String fragment) {

		model.addAttribute("genreSmSelectItems", commonService.findGenreSmList(genreMdCd));

		return fragment;

	}

}
