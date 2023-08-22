package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;
import com.todo.dao.TodoList;

public class TodoUtil {
	// 클래스 메서드로 만들기
	//정적(static) 클래스는 인스턴스화하지 않고 직접 클래스 이름을 통해 접근할 수 있는 클래스
	
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
	public static void deleteItem(TodoList l) { // 
		Scanner s = new Scanner(System.in); { //스캐너
			System.out.println("[항목삭제]\n" // 출력
					+ "삭제하실 항목의 제목을 선택 하십쇼");
			String title = s.next(); // 받아서.
			
			for (TodoItem item : l.getlist()) {
				if(title.equals(item.getTitle())) { // 들어있는 항목 // 입력받은 항목 이 같을시
					l.deleteItem(item); // 제거
					System.out.println("입력하신 내용이 삭제되었습니다.");
				}
			}
		}
	}
	public static void updateItem(TodoList l) {// 업데이트
		Scanner s = new Scanner (System.in);
		System.out.println("항목을 수정\n"
				+"수정할 제목을 입력하세요");
		
		String title = s.next().trim(); // 제목 - 받아오는 것 trim으로 화이트 여백 제거
		if(!l.isDuplicate(title)) { // isDuplicate (title) 제목과 같지 않으면 없는 제목이라고 출력하고 결과를 리턴.
			System.out.println("존재하지않는 제목입니다.");
			return;
		}
		System.out.println("기존의 있던 제목을 수정합니다 세제목을 입력하세요"); // 아니면 세재목 
		String new_title = s.next().trim(); // 받아오는거 enter 키 인식 후 화이트여백 trim으로 제거
		if(l.isDuplicate(new_title)) { // 이미 있던 거랑 이번에 생긴 제목을 비교해서 제목이 저장되어있는경우에
			System.out.println("제목이 중복됩니다"); // 제목중복 출력 구문후 리턴
			return;
		}
		s.nextLine(); // 아니면 enter 키로 받기
		System.out.println("새내용 >"); // 새내용
		String new_description =s.nextLine().trim();// 새로운 내용 을 s.nextLine으로 받고 trim 으로 공간 제거
		for(TodoItem item : l.getlist()) { // 향상된 포문 item 을 l.getList 객체로 만들어서
			if(item.getTitle().equals(title)) { //가져오는 타이틀이랑 기존 타이틀 같을수
				l.deleteItem(item); // l의 저장되어있는 item을 삭제시키고
				TodoItem t = new TodoItem(new_title, new_description);
				//TodoItem 의 새로운 제목과 내용을 
				l.addItem(t);
				//추가시킴
				System.out.println("수정을 완료했습니다.");
				// 수정했다 출력문
			}
		}
	}
	public static void listAll(TodoList l) { // 저장되어 있는 리스트 들을 출력하자
		// (전체목록을)
		System.out.println("[전체 목록]");
		// TodoItem item - l.getList 객체로 만들어서
		for(TodoItem item : l.getlist()) {
			// toStirng을 오버라이드한 형식으로 출력
			System.out.println(item.toString());
		}
	}
}
