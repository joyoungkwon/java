package sec03;

public class PhoneExmaple {

	public static void main(String[] args) {
		
		//Phone phone = new Phone("홍길동"); // 추상 클래스라 상속 받은 자식객체 로 호출해야 함
		// 추상 클래스는 직접 객체 생성이 불가.
		
//		SmartPhone ssmartPhone = new SmartPhone("홍길동", 500);
		
		SmartPhone smartphone = new SmartPhone("홍길동", 10000); //물어보기
		
		
		//물려 받은 스마트폰에서 기본생성자 말고 임의 생성자 생성 (String owners,int cost 값)
		
		smartphone.turnOn(); // 추상 클래스 메소드
		smartphone.turnOn(); // 추상 클래스 메소드
		
		System.out.println(smartphone.cost); // 객체 메소드
		
	}

}
