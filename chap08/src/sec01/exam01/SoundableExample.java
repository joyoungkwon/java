package sec01.exam01;

public class SoundableExample {

	public static void main(String[] args) {
		Soundable sd = new Cat(); // 인터페이스 자식 클래스 cat 로 호출.

		System.out.println(sd.sound()); // cat 의 메소드 호출.

		sd = new Dog(); // sd의 인터페이스 자식클래스 dog로 호출

		System.out.println(sd.sound()); // dog 메소드호출
	}
	// 상수필드와 추상메소드만.
	// 상수필드는 타입후 대문자 초기값 세팅 반드시필요
	// 추상메소드는 중괄호가 안들어감
	// 인터페이스는 구현해야함 implements 필요
	// 클래스에서 상속 받으면 오버라이드 해야함
	// 인터페이스 메소드 2개 일시 - 구현 이 하나면 오류남.
	
}
