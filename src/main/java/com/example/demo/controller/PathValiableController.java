package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PathValiableController {
	//入力画面を表示する
	@GetMapping("show")
	public String showView() {
		//戻り値はビュー名を返す
		return "show";
	}

}