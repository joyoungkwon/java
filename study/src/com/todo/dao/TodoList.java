package com.todo.dao;
import com.todo.service.*;
import java.util.*;

public class TodoList { // 투두 리스트
	private List<TodoItem> list; 
	
	public TodoList() { // Todolist를 ArrayList의 <todoitem> 제네릭으로 받음 ( 배열생성)
		this.list = new ArrayList<TodoItem>();
	}
	public void addItem(TodoItem t) {
		list.add(t); // add 아이템 todoItem t받아오기
	}
	public void deleteItem(TodoItem t) {
		list.remove(t); // list 의 메서드 remove로 들어온 파라미터 t객체 지우기
	}
	public void editItem(TodoItem t , TodoItem updated) { // 파라미터 수정 
		int index = list.indexOf(t); // index 값 (ArrayList) index값 받아오기
		list.remove(index);
		list.add(updated);
	}
	public void sortByName() {
		Collections.sort(list,new TodoSortByName()); // Collections .srot - SortByName()으로 정렬
	}
	public void reverseList() {
		Collections.reverse(list);
		// Collections . reverse (list) 리스트를 역차순으로 정렬
	}
	public void sortByDate() {
		Collections.sort(list,new TodoSortByDate());
		// Collections sort - date 타입으로 정렬
	}
	public int indexOf(TodoItem t) {
		return list.indexOf(t);
		// 필요의 따라서 특정한 특정아이템 객체가 몇번째인지 알아오는 indexOf
	}
	
	public Boolean isDuplicate(String title) {
		for(TodoItem item : list) {
			if(title.equals(item.getTitle())) return true;
		}
		return false;
		// 입력됬을때 같은제목이 중복되지 않게 확인하는 메서드
		// boolean 타입 isDuplicate ( 중복 확인)
		// todoItem itme : list ( 향상된 포문) 돌리고
		// if  - 만약 title (제목과) itme. 으로 가져오는
		// get title 의 제목값이 같으면 true ; 를 반환 하고
		// 그렇지 않으면 false; 를 반환한다.
	}
	public ArrayList<TodoItem> getlist(){
		return new ArrayList<TodoItem>(list);
		//ArrayList<TodoItem> 객체를 getlist 타입으로 리턴 시키는 메서드
	}
	

}
