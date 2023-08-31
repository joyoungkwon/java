package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.println("가나다"); // 리턴 값 없음 내부호출 없음

		int result1 = myCalc.plus(6, 4); // 리턴값을 받을때는 받을 타입의 새로운 객체 생성
		// 리턴값 있음 내부호출 없음
		System.out.println(result1);

		double result2 = myCalc.avg(10, 15);
		System.out.println(result2);
		// 리턴값 있음 내부호출 있음 int result1 은 메소드 합계 내부호출 후 작업

		myCalc.execute(); // 리턴값 x 내부호출 3번
		
		
	}

}
