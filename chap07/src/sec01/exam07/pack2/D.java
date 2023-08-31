package sec01.exam07.pack2;

import sec01.exam07.pack1.*; // import 로 다른 패키지 에 있는 A클래스를 import 함
public class D extends A {
		// 다른패키지라도 import 한 protected 는 상속 받을수 있음
	
	public D() {
		// 상속 받은 자식클래스는 접근됌
		super();
		this.fled ="value";
		this.method();
	}
	public D(String a, String b) {
		super();
		this.fled = "value";
		this.method();
	}
	
}
