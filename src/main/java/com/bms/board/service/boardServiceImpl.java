package com.bms.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bms.board.dao.boardDao;
import com.bms.board.dto.boardDto;

@Service
public class boardServiceImpl implements boardService{
	
 
	@Inject
	boardDao boardDao;
	
	
	@Override
	public List<boardDto> boardlist() throws Exception{
		return boardDao.boardlist();
	
	
	}
	
}