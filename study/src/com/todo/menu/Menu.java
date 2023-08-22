package com.todo.menu;

public class Menu {
	public static void displaymenu() {
		// 출력 구문 (도움말)
		System.out.println();
		System.out.println("<TodoList 관리 명령어 사용법>");
		System.out.println("추가 -항목 추가");
		System.out.println("삭제 - 항목 삭제");
		System.out.println("수정  - 항목 수정");
		System.out.println("전체목록 - 저장된 제목과 내용 확인");
		System.out.println("제목정렬 - 제목순으로 전체목록 을 정렬");
		System.out.println("제목역순정렬 - 제목역순으로 전체목록 을 정렬");
		System.out.println("날짜순정렬 -날짜순으로 전체목록을 정렬");
		System.out.println("도움말 - 도움말 호출");
		System.out.println("종료 - 종료");
	}
	
	
	public static void prompt() {
		System.out.println("\nCommand >");
	}

}
