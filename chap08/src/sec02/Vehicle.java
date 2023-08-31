package sec02;

public interface Vehicle {
	// 인터페이스 필드는 상수 필드만 가능함.
	// 초기값이 무조건 필요함
	// 상수는 대문자 표기
	// public static Final 생략
	// 바뀌지 않음
	//	int WHEELS =4;

	public void run();
	// 인터페이스 추상 메소드 이므로 중괄호 없음
	// static abstract 생략됨 (안써도 저절로 생김)
}
