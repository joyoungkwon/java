package sec01.exam01;

public interface Car {
	// 인터페이스는 상수 필드와 추상메소드 만 사용가능

	int MIN_SPEED = 0;
	int MAX_SPEED = 200;
	//추상 메소드
	// 상수 필드는 public static final 이 자동으로 붙음.
	
	
	void speedUp(int speed);
	void speedDown(int speed);
	// 추상 메소드 public abstract 가 자동으로 붙음.
	// 이걸 구현하는 클래스에서는 추상 메소드 는 반드시 구현해야함.
	//멤버변수 스피드 
	
	
}
