package sec02;

import java.util.Scanner;

public class 확인문제11번 {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		
		System.out.println("관리자 접속 코드를 입력하세요");
		String code = s.next();
		
		String admin_id =code.substring(0,3);
		int admin_psw=Integer.parseInt(code.substring(3,7));
		
		
		
		System.out.println("아이디를 입력해주세요");
		String id = s.nextLine();
		
		System.out.println("패스워드");
		String psw =s.nextLine();
		
		int psw2= Integer.parseInt(psw);
		
		if (id.equals(admin_id)) {
			if(psw2==admin_psw) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패");
			}
		}else {
			System.out.println("아이디존재없음");
		}
		
		// 앞글자 3글자와 , 아이디가 같은지 비교.해야함
		// 관리자 코드에서 뒷글자랑 psw가 같은지 비교 
		// 관리자 접속 코드를 입력하세요 (입력받음)
		// 아이디를 입력 하세요
		// 비밀번호를 입력하세요
		// 같으면 로그인 성공 실패시 로그인 실패: 아이디존재 x
		
	}

}
