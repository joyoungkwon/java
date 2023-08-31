package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone st = new SmartPhone();           // 스마트폰의 객체 만들기 
//		Phone stp = new SmartPhone();             // 자식 객체를 부모 객체의 타입변환.(자동변환  부모가 더 크기 때문에)
		Phone p = new SmartPhone();       
		
		System.out.println(p.cost); // 타입변환 함으로 부모 필드값 호출.
		p.powerOn(); // 부모의 메소드 호출
		p.ring(); // 오바라이드 한 자식 메소드 호출
		//		p.videoOn - 은 자식의 메소드며, 상속 받은 부모 객체로 타입 변환 했고, 오버라이드 하지 않았으므로 호출 불가능.
		//		p.phoneCase ="하드케이스" 은 자식의 필드값이며 위 처럼 메소드 호출과 같이 타입 변환이 되면 필드값 호출이 불가능함.
		
		SmartPhone sp =(SmartPhone)p;  // double t = int x/y;
		// 부모 객체를 자식 객체의 강제 타입 변환 시킴 
		// 강제 타입 변환 을 할수 있는 조건은 객체 상속으로 자동 타입변환을 한번이라도 해야 만 함.
		sp.phoneCase="하드하드!케이스"; // 자식 객체 필드나 메소드를 사용 가능함
		sp.powerOn(); // 부모 객체 메소드 사용 가능
		System.out.println(sp.cost); // 같은 이름의 필드는 자식 객체 사용 
		// 객체 생성 instance화
		// instanceof -instance화 가능한지 묻는 연산자
	}

}
