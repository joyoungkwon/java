package sec01.exam07.pack1;

public class B {
	
	public void method() {
		// protected 는 같은 패키지에서는 접근이 가능.
		A a = new A(); 
		// A 의 새로운 객체 생성
		a.fled = "value";
		// protected String 필드에 벨류 저장
		a.method();
		// protected A메소드 호출
	}

}
