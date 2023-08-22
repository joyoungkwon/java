package com.todo.dao;
import java.util.*;

public class TodoItem {
	private String title; // ����
	private String desc; // ����
	private Date current_date; // ��¥ date Ÿ��
	
	public TodoItem(String title, String desc) { // ������ ����, ���� �޴�
		this.title = title;
		this.desc = desc;
		this.current_date = new Date(); // ���� ��¥ �ð� ������ �ƴ϶� (�ڵ����� �޾ƿ���)
	}
 // get sat �޼ҵ� (�޾ƿ��°� ���� �޼���)
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
	// �ֻ��� ��ü ������Ʈ �� toString �޼��� (��±��� �ٲٱ�)
	public String toString() { // ��� ����
		return "[" + title + "]" + desc +" -"+current_date;
	}
	
	
}
