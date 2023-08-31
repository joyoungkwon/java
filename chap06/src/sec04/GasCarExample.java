package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar(); //객체생성 불러오기
		
		myCar.setGas(5); // 메소드 호출
		
		
		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas 호출
		// isLeftrGas = gas가 0일때 없습니다 flase 0보다 클때 true
		// 맨처음 가스 값 5 gasState = true 
		
		
		if (gasState) { // true 1
			System.out.println("출발합니다"); // true 2 실행 
			myCar.run(); // Car 의 run 호출 
			// run = gas 가 0이 될때까지 -1
			// run else 0 이면 멈춤 return 
		}
		if(myCar.isLeftGas()) { // isLeftGas 메소드 
		// 위에서 run 메소드를 저장한 값을 불러와서
		// 0 이 되어 멈출 때까지 반복 하다가 내려오면
		// 가스를 주입해라 를 출력
			System.out.println("가스를 주입할 필요가 없습니다.");
		}else {
			System.out.println("가스를 주입하세요");
		}
		// 그러면 0이 되지 않고 가스 주입필요가 없다고 할려면
		// 
	}

}
