package sec03;

public class SmartPhone extends Phone {
	
	// Phone 에는 없는 Smart phone 매게변수
	int cost;// 가격
	
	//생성자
	
	public SmartPhone(String owenr, int cost) {
		super(owenr); // Phone 클래스에서 default 생성자 말고 임의 생성자 생성 . 부모꺼 불러와야함.
		this.cost= cost;
	}
	
	
	
//	SmartPhone 만의 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	
	
}
