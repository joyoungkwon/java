package sec03;

public class Car {
	String company;
	String model ;
	String color ;
	int maxSpeaed;
	int speed;
	

	public Car() { // 기본 생성자.

	}

	public Car(String model, int speed, String color) {  
		// 처음에 설정한 변수 타입 대로 대입해서 끌어와야함
		// EX ) 문자면 ("ㅇ,ㅇ,ㅇ" 두번째가 정수형태로 생성하면 int )
		// 모델명과 속도가 들어가는 생성자 만듬
		// 생성자가 하나 있으므로 컴퓨터가 자동으로 만들지는 않음
		this.model = model;
		this.speed = speed;
		this.color = color;
	}
	public Car(String mode2, int speed ) {
		this.model=model;
		this.speed=speed;
		// this 초기화 저장 값.
		// 변수 명을 똑같이 최적화 하지만 햇갈리기 때문에 this 붙힘
		// 오른쪽 변수 보내는값.
	}
}
