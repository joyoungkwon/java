package sec01;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); //객체생성
		// Caclculator 에는 겟메모리로 이름을 읽어들이는 메소드와
		// 셋메모리로 이름을 세팅시키는 메소드가있음
		// 셋 메모리는 이름을 리턴 시키고 try로 무조건 실행 하게끔 스레드에서 딜리리를 주고 그다음에 문제가있을때는 
		//catch 로 오류문자를 잡아냄.

		User1 user1 = new User1(); // user1 객체생성
		user1.setCalculator(calculator); // user1 의 setCalculator 를 파라미터로 받는 생성자 호출
		user1.start(); // user1 의 run 메소드 호출을 start로함. 
		//run 은 겟네임으로 받아온 메모리의 값을 sat으로 초기세팅하는 메소드가있음

		User2 user2 = new User2(); //user2 객체
		user2.setCalculator(calculator); // user2 의 setCalculator를 파라미터로 생성
		user2.start();//run 은 겟네임으로 받아온 메모리의 값을 sat으로 초기세팅하는 메소드가있음


	}

}
