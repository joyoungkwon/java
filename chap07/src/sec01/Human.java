package sec01;

public class Human {
	int weight; // 몸무게
	int height; // 키
	String gender; // 성별
	Human(){
		
	}
	
	Human(int weight , int heigt){
		this.weight = weight;
		this.height = heigt ;
	}
	
	
	void sleep() {
		System.out.println("잠을잡니다.");
	}

	void awake() {
		System.out.println("일어납니다");
	}

	String eat(String food) {
		String result = food + "를 먹습니다";
		return result;
		// 리턴값이 있는 메소드는 받은 타입으로
		// 변수 생성 하고 받아들이고
		// 받은 변수를 출력.
		
		
	}

	String run(int speed) {
		String result = speed + "속도로 달립니다.";
		return result;
	}

}
