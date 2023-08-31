package sec02;

public class Child extends Parent{

	@Override
	public void method2() {
		System.out.println("Child-method()2");
		// 상속 받은 Parent 의 메소드 의 출력 값을 
		//Parent 2에서 Child 2로 바꿈.
	}
	public void method3() {
		System.out.println("Child-method()3");
	}

}
