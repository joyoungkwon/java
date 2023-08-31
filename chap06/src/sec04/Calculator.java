package sec04;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result; // 합계 메소드
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // plus 메소드 내부호출
		
		double result = sum / 2; 
		// double result의 plus 값 섬 /2 를 저장
		return result;// 저장 결과 리턴
	}

	void execute() {
		double result = avg(7, 10);
		// avg(7,10)은 plus 메소드 호출 후 작업 후 결과 값 리턴
		// 후 avg 합계 (sum)/2작업 후 결과값 리턴
		println("실행결과 " + result); 
		// 메소드 안에 execute 안에 불렀을때 프린트 로 호출 하기 
		// 위함.
		
		
	}

	void println(String message) {
		System.out.println(message);
	}

}
