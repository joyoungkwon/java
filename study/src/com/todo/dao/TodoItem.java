package com.todo.dao;
import java.util.*;

public class TodoItem {
	private String title; // 제목
	private String desc; // 내용
	private Date current_date; // 날짜 date 타입
	
	public TodoItem(String title, String desc) { // 생성자 제목, 내용 받는
		this.title = title;
		this.desc = desc;
		this.current_date = new Date(); // 현재 날짜 시간 세팅이 아니라 (자동으로 받아오게)
	}
 // get sat 메소드 (받아오는값 리턴 메서드)
	public String getTitle() { 
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCurrent_date() {
		return current_date;
	}

	public void setCurrent_date(Date current_date) {
		this.current_date = current_date;
	}

	@Override 
	// 최상위 객체 오브젝트 의 toString 메서드 (출력구문 바꾸기)
	public String toString() { // 출력 구문
		return "[" + title + "]" + desc +" -"+current_date;
	}
	
	
}
