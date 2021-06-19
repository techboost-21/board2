package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.board.repository.Item;

/**
 * 掲示板のフロントコントローラー.
 */
@Controller
public class BoardController {

	/**
	 * 一覧を表示する。
	 * 
	 * @param item  項目
	 * @param model モデル
	 * @return テンプレート
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") Item item, Model model) {
		return "layout";
	}
}