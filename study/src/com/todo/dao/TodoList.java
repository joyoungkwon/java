package com.todo.dao;
import com.todo.service.*;
import java.util.*;

public class TodoList {
	private List<TodoItem> list;
	
	public TodoList() {
		this.list = new ArrayList<TodoItem>();
	}
	public void addItem(TodoItem t) {
		list.add(t);
	}
	public void deleteItem(TodoItem t) {
		list.remove(t);
	}
	public void editItem(TodoItem t , TodoItem updated) {
		int index = list.indexOf(t);
		list.remove(index);
		list.add(updated);
	}
	public void sortByName() {
		Collections.sort(list,new TodoSortByName());
	}
	public void reverseList() {
		Collections.reverse(list);
	}
	public void sortByDate() {
		Collections.sort(list,new TodoSortByDate());
	}
	public int indexOf(TodoItem t) {
		return list.indexOf(t);
	}
	
	public Boolean isDuplicate(String title) {
		for(TodoItem item : list) {
			if(title.equals(item.getTitle())) return true;
		}
		return false;
		// boolean 타입 isDuplicate ( 중복 확인)
		// todoItem itme : list ( 향상된 포문) 돌리고
		// if  - 만약 title (제목과) itme. 으로 가져오는
		// get title 의 제목값이 같으면 true ; 를 반환 하고
		// 그렇지 않으면 false; 를 반환한다.
	}
	public ArrayList<TodoItem> getlist(){
		return new ArrayList<TodoItem>(list);
	}
	

}
