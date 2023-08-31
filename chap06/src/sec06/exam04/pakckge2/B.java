package sec06.exam04.pakckge2;
import sec06.exam04.pakckge1.*;  // 상위 폴더 . 하위 폴더. 패키지 1 . 클래스 이름 or * 
// import 하고 클래스 명 입력하면 그 클래스를 끌어옴
// *이면 (import 한 패키지)모든 메소드 클래스 다 끌어옴

public class B {
	A a1 = new A(true); 
	// public 패키지가 달라도 생성가능
//	A a2 = new A(1);
	// default 패키지가 다르면 생성 불가능
//	A a3 = new A("문자열");
	// private 같은 클래스에서만 생성가능
	
	//extneds - 상속
}
