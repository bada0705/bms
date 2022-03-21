package com.bms.board.dao;

import java.util.List;

import com.bms.board.dto.boardDto;


public interface boardDao {
	
//게시판 리스트
public List<boardDto>boardlist()throws Exception;
}