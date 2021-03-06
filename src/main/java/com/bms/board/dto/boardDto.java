package com.bms.board.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class boardDto{
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	public boardDto() {}
	public boardDto (int bno , String title, String content, 
			String writer,Date regdate, int viewcnt ) {
		super();
	this.bno = bno;
	this.title = title;
	this.content=content;
	this.writer=writer;
	this.regdate=regdate;
	this.viewcnt= viewcnt;
		
		
		
		
		
		
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	
	
	
	
	
	
	
	
}











































