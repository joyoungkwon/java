package sec02;

public class ImplementationC  implements InterfaceC{ // 인터페이스 a b를 상속 받은 인터페이스 c를 구현하는 클래스 

	@Override
	public void methodB() {
		System.out.println("메소드 b실행");
	}

	@Override
	public void methodA() {
		System.out.println("메소드 a실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("메소드 c실행");
		
	}
	
	public static void main(String[]args) {
		ImplementationC imple = new ImplementationC(); // 인터페이스 a,b를 extends한 c를 인터페이스 c클래스에서 구현한 c클래스 객체 생성
		// 인터페이스 c 객체인 ic 는 a 와 b 의 모든 메소드를 사용가능함
		
		InterfaceC ic = imple;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
