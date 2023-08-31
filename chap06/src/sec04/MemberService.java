package sec04;

public class MemberService {
	//멤버변수 아이디 비밀번호 생성
	// 생성자 는 기본 생성자.
	// boolean true , false ,   
	
	String id ;
	String password;
	
	boolean login(String id , String password) {
		if(id.equals("id") && password.equals(password)){
			return true;
		}else {
			return false;
		}
	}
	void logout() {
		System.out.println("로그아웃");
	}
}
