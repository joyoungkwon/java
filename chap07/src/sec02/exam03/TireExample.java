package sec02.exam03;

public class TireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); // 스노우 타이어의 객체 생성
		snowTire.run(); // 스노우 타이어 메소드 호출
		snowTire.stop(); // 스노우 타이어 메소드 호출
		
		Tire tire = snowTire; // 상위 객체의 자식 객체 타입변환
		 // 부모 의 클래스를 갖고, 오버라이딩 한 자신의 메소드를 가지고 옴
		
		System.out.println(tire.company); // 제조회사. 둘다 금호 타이어 (초기값 금호타이어)
		System.out.println(snowTire.company);// 제조회사. 둘다 금호 타이어 (초기값 금호타이어)
		System.out.println(snowTire.Design); // 스노우 타이어의 필드값 출력 (스노우 타이어)
		System.out.println(tire.Design); // 부모는 문자열의 기본값인 null 출력
		
		tire.run(); // 클래스를 타입변환 시켜 스노우 타이어 오버라이딩 값 나옴
		snowTire.run(); // 오버라이딩 한 메소드 출력
		
		
		snowTire.stop(); // 스노우 타이어 오버라이딩 한 값 출력.
//		tire.stop(); //  이거는 호출 불가능 부모는 자식 호출 불가능
		tire.stop2(); // 메소드 이름이 같으면 상속 관계 일때 자동으로 오버 라이딩이 되는거임
		// 햇갈리지 않기 위해서 @Override 라는 주석 식 을 붙힘
										
		
	}

}
