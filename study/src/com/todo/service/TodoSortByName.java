package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;;

public class TodoSortByName implements Comparator<TodoItem> {
	// comparator - compare 메소드 오버라이드

	@Override
	public int compare(TodoItem o1, TodoItem o2) {
		return o1.getTitle().compareTo(o2.getTitle());
		// cmpareTo 어느쪽이 더 앞서는지
	}
	
}
