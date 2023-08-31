package sec02;

public class ChildExample {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		Parent parent =child; // 상위 객체의 하위 객체 상속
		
		parent.method1(); // child 의 메소드는 호출 이 불가
		parent.method2(); // parnet 를 상속한 child 클래스에서 오버라이드 한 메소드는 호출 가능
		//parent.method3();// 호출이 불가
		// 호출이 불가한 이유는 Child 클래스의 새로운 객체 new child 가 Parent 클래스를 가지고 있는
		// parent 의 새로운 객체의 상속 되어 기존에 child 가 가지고 있는 method3 은 호출 불가
		

	}

}
