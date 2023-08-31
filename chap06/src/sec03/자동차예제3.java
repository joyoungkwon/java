package sec03;

public class 자동차예제3 {

	public static void main(String[] args) {
		// 생성자 new 로 호출
		Car2 car2 = new Car2("자가용");      // 기본 생성자에서 매게 생성자 불러오기
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeaed);
		
		
	}

}
