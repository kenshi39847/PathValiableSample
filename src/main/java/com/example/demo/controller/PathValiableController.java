package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathValiableController {
	//入力画面を表示する
	@GetMapping("show")
	public String showView() {
		//戻り値はビュー名を返す
		return "show";
	}
	
	//リンク処理
	@GetMapping("/function/{no}")
	public String selectFunction(@PathVariable Integer no) {
		//ビュー名の初期化
		String view = null;
		switch(no) {
		case 1:
			view = "pathvaliable/function1";
			break;
		case 2:
			view = "pathvaliable/function2";
			break;
		case 3:
			view = "pathvaliable/function3";
			break;
		}
		//戻り値はビュー名を返す
		return view;
	}

}