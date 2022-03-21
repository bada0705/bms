package com.bms.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bms.board.dto.boardDto;

@Repository
public class boardDaoImpl implements boardDao{
 
	@Inject
	SqlSession sqlsession;
	@Override
	public List<boardDto> boardlist() throws Exception{
		return sqlsession.selectList("board.boardlist");
	
	
	}
	
}