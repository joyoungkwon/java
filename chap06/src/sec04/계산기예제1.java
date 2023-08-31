package sec04;

public class 계산기예제1 {

	public static void main(String[] args) {
		계산기 myCalc = new 계산기();  // 계산기 생성자 호출 객체 생성
		myCalc.powerOn();
		
		int result1= myCalc.plus(5, 3); // 리턴값이 있는 메소드 호출
		System.out.println(result1); // int 로 설정하여  int 로 받고 저장해야함
		
		int result2 = myCalc.minus(5, 3); // 값이 있는 건 return
		System.out.println(result2); 
		
		String result3 = myCalc.mul(3, 0);
		System.out.println(result3);
		
		double result4 = myCalc.divide(5, 2);
		System.out.println(result4);
		
		byte x = 10; 		// 바이트
		byte y = 4;
		double result5 = myCalc.divide(x, y);
		System.out.println(result5);
	}

}
