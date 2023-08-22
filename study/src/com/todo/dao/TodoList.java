package com.todo.dao;
import com.todo.service.*;
import java.util.*;

public class TodoList { // ���� ����Ʈ
	private List<TodoItem> list; 
	
	public TodoList() { // Todolist�� ArrayList�� <todoitem> ���׸����� ���� ( �迭����)
		this.list = new ArrayList<TodoItem>();
	}
	public void addItem(TodoItem t) {
		list.add(t); // add ������ todoItem t�޾ƿ���
	}
	public void deleteItem(TodoItem t) {
		list.remove(t); // list �� �޼��� remove�� ���� �Ķ���� t��ü �����
	}
	public void editItem(TodoItem t , TodoItem updated) { // �Ķ���� ���� 
		int index = list.indexOf(t); // index �� (ArrayList) index�� �޾ƿ���
		list.remove(index);
		list.add(updated);
	}
	public void sortByName() {
		Collections.sort(list,new TodoSortByName()); // Collections .srot - SortByName()���� ����
	}
	public void reverseList() {
		Collections.reverse(list);
		// Collections . reverse (list) ����Ʈ�� ���������� ����
	}
	public void sortByDate() {
		Collections.sort(list,new TodoSortByDate());
		// Collections sort - date Ÿ������ ����
	}
	public int indexOf(TodoItem t) {
		return list.indexOf(t);
		// �ʿ��� ���� Ư���� Ư�������� ��ü�� ���°���� �˾ƿ��� indexOf
	}
	
	public Boolean isDuplicate(String title) {
		for(TodoItem item : list) {
			if(title.equals(item.getTitle())) return true;
		}
		return false;
		// �Է����� ���������� �ߺ����� �ʰ� Ȯ���ϴ� �޼���
		// boolean Ÿ�� isDuplicate ( �ߺ� Ȯ��)
		// todoItem itme : list ( ���� ����) ������
		// if  - ���� title (�����) itme. ���� ��������
		// get title �� ������ ������ true ; �� ��ȯ �ϰ�
		// �׷��� ������ false; �� ��ȯ�Ѵ�.
	}
	public ArrayList<TodoItem> getlist(){
		return new ArrayList<TodoItem>(list);
		//ArrayList<TodoItem> ��ü�� getlist Ÿ������ ���� ��Ű�� �޼���
	}
	

}
