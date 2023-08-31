package sec06;

import java.util.Scanner;

public class 학생예제1 {

	public static void main(String[] args) {
			
		Student student = new Student();
		Scanner s = new Scanner (System.in);
		boolean run = true;
		
		
		while(run) {
			boolean check = student.checkLogin(); // 로그인점검메소드
			if(check) {
				System.out.println("작업을 선택해주세요");
				System.out.println("1번은 로그아웃 2번은 성적 입력");
				int choice =s.nextInt();
				
				if(choice==1) { 
					run=false;
				}else if(choice==2) {
					student.inputExam(); // 성적 입력 메소드 작성
					run=false;
				}
	
			} else {
				System.out.println("로그인실패");
			}
		}

	}
}
