package com.bms.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.bms.board.dto.boardDto;
import com.bms.board.service.boardService;

@Controller
@RequestMapping("/board/*")
public class boardController{
	@Inject
	boardService boardService;
	
	
	@RequestMapping("list.do")
	public String boardlist(Model model) throws Exception{
		
		List<boardDto> list= boardService.boardlist();
		model.addAttribute("list", list);
		return "board/board_list";
		
	
	}
}