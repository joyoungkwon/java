package sec03;

public class 자동차예제2 {

	public static void main(String[] args) {
		Car car = new Car("테슬라3", 350, "빨강"); // 사용자 정의의 메소드 호출
		System.out.println("모델명 : " + car.model);
		System.out.println("속도 : " + car.speed);
		System.out.println("제조회사 : " + car.color); // null 값 (정해지지않음)
		
		
	}

}
