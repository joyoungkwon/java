package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;;

public class TodoSortByName implements Comparator<TodoItem> {
	// comparator - compare �޼ҵ� �������̵�

	@Override
	public int compare(TodoItem o1, TodoItem o2) {
		return o1.getTitle().compareTo(o2.getTitle());
		// cmpareTo ������� �� �ռ�����
	}
	
}
