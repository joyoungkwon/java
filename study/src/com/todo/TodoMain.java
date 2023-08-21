package com.todo;

import java.util.*;
import com.todo.dao.*;
import com.todo.menu.*;
import com.todo.service.*;

public class TodoMain {

	public static void start() {
		Scanner s = new Scanner(System.in); // 스캐너 임포트
		TodoList l = new TodoList(); // TodoList 객체 l로 설정
		boolean isList = false; // 논리형 타입 boolean 설정 false;초기설정
		boolean quit = false;

		Menu.displaymenu(); // 메뉴를 보여주는 디스플레이 메서드

		do {
			Menu.prompt(); // 메뉴의 프롬포트 메서드
			isList = false;
			String choice = s.next(); // 고른거
			switch (choice) {// 고른값으로 switch 시작.

			case "add":
				TodoUtil.crateItem(l);
				break;
			case "del":
				TodoUtil.deleteItem(l);
				break;
			case "edit":
				TodoUtil.updateItem(l);
				break;
			case "ls":
				TodoUtil.listAll(l);
				break;
			case "ls_name_asc":
				l.sortByName();
				System.out.println("제목순으로 정렬하였습니다");
				isList = true;
				break;
			case "ls_name_desc":
				l.sortByName();
				l.reverseList();
				System.out.println("제목순으로 정렬하였습니다");
				isList = true;
				break;
			case "help":
				Menu.displaymenu();
				break;
			case "ls_date":
				l.sortByDate();
				System.out.println("날짜순 으로 정렬했습니다");
				isList = true;
				break;
			case "exit":
				TodoUtil.listAll(l);
				System.out.println("투두리스트를 종료합니다.");
				quit = true;
				break;
			default:
				System.out.println("정확한 명령어를 입력하세요 (도움말은-help입니다.)");
				break;

			}
			if (isList)
				TodoUtil.listAll(l);
		} while (!quit);

	}

}
