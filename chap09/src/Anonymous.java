
public class Anonymous {
	
	Worker field= new Worker() { // Worker 에 익명 객체 생성
		// 일회성 

		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
		// Worker 에 메소드 를 익명객체로 오버라이드.
	};
	
	void method1() {
		Worker localVar = new Worker() {

			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
			// 메소드 오버라이드.
			
		};
		localVar.start(); // 오버라이드 호출.
	}
	
	
	void method2(Worker worker) {
		worker.start();
	}
	
	
}
