package com.study.crud.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/")
	String indexPage(Model model) {
		System.out.println("여기 들어왔니??");
		return "index";
	}
	@RequestMapping("/boardList")
	String boardList(Model model) {
		System.out.println("boardList 페이지입니다.");
		return "boardList";
	}
}
