package sec04;

public class 계산기 {
	void powerOn() { // 리턴값 없는 보이드 메소드
		System.out.println("전원을켭니다");
	}

	void powerOff() {
		System.out.println("전원을끕니다");
	}

	int plus(int x, int y) { // 값이 필요한 메소드 리턴)
		int result = x + y;
		return result;
	}

	// 객체 생성후 호출 했을때 작은수에서 큰수를 빼도, 양수가 나오게 하기
	// if문 사용가능
	int minus(int x, int y) {
		int result;
		if (y > x) {
			result = y - x;
		} else {
			result = x - y;
		}
		return result;
	}
	// 곱하기 0은 어떤수를 곱해도 0 이나옴
	// 0을 입력 했을때 "0은 입력 할수 없습니다" 출력 
	
	String mul(int x, int y) { // 행동하는 메소드 에 x ,y 를 대입 시켰을때
		if( x==0 || y==0) {	// x나 y가 0이면
			String message = "0 은입력할수 없습니다."; // 0은 입력 할수 없습니다 란 문자열을 String message에 저장
			return message; // 메세지의 저장한 값을 리턴
		}else { // x나y가 0이 아닐떈
			int result = x * y;  // int result 에 x y를 곱한값을 저장
			return  String.valueOf(result); // int 로 받은 리턴값을 문자열로 강제 형변환 한후 result의 저장.
		}
		
	}
	double divide (int x , int y) {
		double result = (double)x / (double) y;
		return result;
	}
}
