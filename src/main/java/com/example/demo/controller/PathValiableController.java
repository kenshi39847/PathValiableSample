package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	//ボタンAの押下処理
	@PostMapping(value = "send", params = "a")
	public String showAView()  {
		//戻り値はビュー名を返す
		return "submit/a";
	}
	
	//ボタンBの押下処理
	@PostMapping(value = "send", params = "b")
	public String showBView()  {
		//戻り値はビュー名を返す
		return "submit/b";
	}
	
	//ボタンCの押下処理
	@PostMapping(value = "send", params = "c")
	public String showCView()  {
		//戻り値はビュー名を返す
		return "submit/c";
	}

}