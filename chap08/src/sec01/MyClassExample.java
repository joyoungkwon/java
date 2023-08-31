package sec01;

public class MyClassExample {

	public static void main(String[] args) {
		MyClass my1 = new MyClass();
		
		my1.rc.tunOn();
		my1.rc.setVolume(7);
		
		MyClass  my2 = new MyClass(new Television());
		// 매개변수 1개 생성자 호출
		my2.rc.tunOn();
		my2.rc.setVolume(7);
		
		
		MyClass  my3 = new MyClass(new Audio());
		// 매개변수 1개 생성자 호출
		my3.rc.tunOn();
		my3.rc.setVolume(7);
		
		MyClass my4 = new MyClass();
		my4.methodA();
		// 매개 변수가 없는 메소드 호출
		
		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		// 파라미터 값이 있는 메소드를 호출.
	}

}
