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
		// boolean Ÿ�� isDuplicate ( �ߺ� Ȯ��)
		// todoItem itme : list ( ���� ����) ������
		// if  - ���� title (�����) itme. ���� ��������
		// get title �� ������ ������ true ; �� ��ȯ �ϰ�
		// �׷��� ������ false; �� ��ȯ�Ѵ�.
	}
	public ArrayList<TodoItem> getlist(){
		return new ArrayList<TodoItem>(list);
	}
	

}
