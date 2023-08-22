package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;;

public class TodoSortByDate implements Comparator<TodoItem> {
	// comparator 제네릭 <TodoItem>
	// 오버라이드 날짜로 순으로 제목을 받아오는 메소드
	@Override
	public int compare(TodoItem o1, TodoItem o2) {
		return o1.getCurrent_date().compareTo(o2.getCurrent_date());
	}
	
}
