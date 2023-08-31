
public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1(); // 메소드 호출
		anony.method2( // 파라미터 값을 객체로 넘기는 메소드.
				new Worker() { // Worker 에 익명 객체 생성

					@Override
					public void start() {
						System.out.println("테스트합니다."); // 오버라이드
					}
					
				}
				);

	}

}
