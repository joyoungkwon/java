package com.todo;

import java.util.*;
import com.todo.dao.*;
import com.todo.menu.*;
import com.todo.service.*;

public class TodoMain {
	
	// 클래스 메소드로 구현되어있음
	public static void start() {
		Scanner s = new Scanner(System.in); // 스캐너 임포트
		TodoList l = new TodoList(); // TodoList 객체 l로 설정
		boolean isList = false; // 논리형 타입 boolean 설정 false;초기설정
		boolean quit = false;

		Menu.displaymenu(); // 메뉴를 보여주는 디스플레이 메서드

		do {
			Menu.prompt(); // 메뉴의 프롬포트 메서드
			isList = false; // isList false 세팅 이유 -line 68
			String choice = s.next(); // 고른거
			switch (choice) {// 고른값으로 switch 시작.
			// 입력한 키값 별 불러오는 메서드
			case "추가":
				TodoUtil.crateItem(l); // 추가메서드
				break;
			case "삭제":
				TodoUtil.deleteItem(l);//삭제메서드
				break;
			case "수정":
				TodoUtil.updateItem(l);//수정메서드
				break;
			case "전체목록":
				TodoUtil.listAll(l);//list 의 저장되어있는 리스트 출력메서드
				break;
			case "제목정렬": // asc(제목)순 정렬일때
				l.sortByName(); // Comparator 오버라이드 한 메서드 호출
				System.out.println("제목순으로 정렬하였습니다");
				isList = true;
				break;
			case "제목역순정렬": // 내용순일떄 (역순)
				l.sortByName(); // 먼저 호출하고
				l.reverseList(); // 뒤집어버리기
				System.out.println("제목의 역순으로 정렬하였습니다");
				isList = true;
				break;
			case "도움말": // 도움말 호출
				Menu.displaymenu(); // 그냥 디스플레이메뉴 호출 (출력메서드)
				break;
			case "날짜정렬": // 날짜 순 정렬 메서드
				l.sortByDate(); // Comparator 오버라이드해서 날짜로 받아온 date메서드
				System.out.println("날짜순 으로 정렬했습니다"); 
				isList = true;
				break;
			case "종료": // 끝내는 키
				System.out.println("저장내용"); // 저장내용을 보여주겠다
				TodoUtil.listAll(l); // list의 들어가있는 list를 all
				System.out.println("투두리스트를 종료합니다."); // 종료
				quit = true;
				break;
			default:
				System.out.println("정확한 명령어를 입력하세요 (도움이필요하면"
						+ "도움말을 입력하세요)");
				break;

			}
			if (isList) 
				TodoUtil.listAll(l); // isList 가 true 이면 저장된값을 출력해라.
		} while (!quit); // while문 닫기

	}

}
