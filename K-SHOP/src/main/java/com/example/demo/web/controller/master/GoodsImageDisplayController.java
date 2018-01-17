package com.example.demo.web.controller.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.master.GoodsImageService;

/**
 * クラスの説明：画像表示用RESTコントローラー
 * @author kamagata
 * @since 2018/01/17
 */
@RestController
@RequestMapping("/maintenance/goodsimage")
public class GoodsImageDisplayController {

	@Autowired
	GoodsImageService goodsImageService;

	/**
	 * メソッドの説明：商品画像表示 リクエストのIDを基に画像を取得しバイナリをレスポンスする
	 * @author kamagata
	 * @param goodsImageCd 商品画像コード
	 * @since 2018/01/17
	 * @return byte[] 画像のバイナリ
	 */
	@RequestMapping(value = "/{goodsImageCd}", method = { RequestMethod.GET })
	@ResponseBody
	public byte[] getImage(@PathVariable Integer goodsImageCd) {

		return goodsImageService.findOne(goodsImageCd).getImage();

	}

}
