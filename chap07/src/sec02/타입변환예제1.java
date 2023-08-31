package sec02;

public class 타입변환예제1 {

	public static void main(String[] args) {
			Car car = new Car();
			Sedan sedan = new Sedan();
			Sonata sonata = new Sonata();
			
			// 하위 객체가 상위 객체에 상속 되면, 상위 객체의 메소드를 끌어옴
			// 예외적으로 자식메소드에서 오버라이드 한 객체는 오버라이드한 메소드를 끌어옴
			
			
			Car  car2 = sedan;
			
			// sedan 클래스 타입은 Car클래스의 자식 클래스며 
			// sedan 클래스 타입이 Car 클래스 타입으로 자동 변환됨
			
			
			
			Car car3  = sonata; 
			
			// sonata 클래스 는 sedan 의 자식 클래스면서 sedan 의 부모 클래스인 Car의 상속 클래스기 때문에
			// Car 의 자손 클래스로 포함되어 Car 의 클래스 타입으로 자동으로 변한됨
			
			
			
			//Truck  truck  = sonata ; 오류
			// truck 클래스 타입은 sonata 클래스와 연관되지않아 자동으로 변한안됨
	}

}
