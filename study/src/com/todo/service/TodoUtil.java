package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;
import com.todo.dao.TodoList;

public class TodoUtil {
	public static void crateItem(TodoList list ) {
		String title , desc;
		Scanner s = new Scanner(System.in);
		System.out.println("[항목추가]\n"
			+"제목 >"	);
		
		title = s.next(); // todolist 에 있는 isDuplicate(중복확인 메소드) 의 파라미터값이 title이면.
		// is Duplicate 는 중복된값이면 true 값을 반환 하는 메소드임
		if(list.isDuplicate(title)) { // 제목이 중복되면 true 값이 반환되어 "제목이 중복됩니다 " 출력
			System.out.println("제목이 중복됩니다.");
			return;
		}
		s.nextLine();
		System.out.println("추가하실 내용은 > ");
		desc = s.nextLine().trim(); // trim 왼쪽 오른쪽 화이트 여백 제거 한줄 라인 읽기 line
		
		TodoItem t = new TodoItem(title,desc); // todoItem 새로운 title 이랑 desc 를 가져와서
		list.addItem(t); // ArrayList 의 addItem으로 새로 생성한 t값을 넘겨서 추가시킴
		System.out.println("입력하신 내용이 추가 되었습니다");
	}
	public static void deleteItem(TodoList l) {
		Scanner s = new Scanner(System.in); {
			System.out.println("[항목삭제]\n"
					+ "삭제하실 항목의 제목을 선택 하십쇼");
			String title = s.next();
			
			for (TodoItem item : l.getlist()) {
				if(title.equals(item.getTitle())) {
					l.deleteItem(item);
					System.out.println("입력하신 내용이 삭제되었습니다.");
				}
			}
		}
	}
	public static void updateItem(TodoList l) {
		Scanner s = new Scanner (System.in);
		System.out.println("항목을 수정\n"
				+"수정할 제목을 입력하세요");
		
		String title = s.next().trim();
		if(!l.isDuplicate(title)) {
			System.out.println("없는 제목입니다.");
			return;
		}
		System.out.println("새제목");
		String new_title = s.next().trim();
		if(l.isDuplicate(new_title)) {
			System.out.println("제목이 중복됩니다");
			return;
		}
		s.nextLine();
		System.out.println("새내용 >");
		String new_description =s.nextLine().trim();
		for(TodoItem item : l.getlist()) {
			if(item.getTitle().equals(title)) {
				l.deleteItem(item);
				TodoItem t = new TodoItem(new_title, new_description);
				l.addItem(t);
				System.out.println("수정을 완료했습니다.");
			}
		}
	}
	public static void listAll(TodoList l) {
		System.out.println("[전체 목록]");
		for(TodoItem item : l.getlist()) {
			System.out.println(item.toString());
		}
	}
}
