package study01;

public class Array {

	public static void main(String[] args) {
		int score [ ] = new int [5]; // 배열을 선언과 생성을 동시에함
		// integer 타입의 score 이름을 가진 배열 을 선언시키고,
		// integer 타입의 새로운 배열의 방을 다섯개를 생성함.
		
		score[3] = 100;
		// 5개로 생성 한 스코어 방의 index번호 3번에,
		// 100 이라는 integer 값을 줌. (주의 사항으로 같은 타입의 변수만 저장 시킴)
		// 안그럴시 컴파일.
		
		// 출력구문
		System.out.println("int score[0]"+score[0]);
		System.out.println("int score[1]"+score[1]);
		System.out.println("int score[2]"+score[2]);
		System.out.println("int score[3]"+score[3]);
		System.out.println("int score[4]"+score[4]);
		
//		integer 타입의 a 변수에 integer 로 선언 시키고 생성 한 score 3번의 방값을 대입 시킴
		// score 3의 방 값은 100;
		int a = score[3];
		System.out.println("a =" + a);
	// 궁금함 그러면 integer a = 방안에 score index 3번을 대입 시키면, 기존의 3번의 있던 
		// 100의 값은 사라질까?
		System.out.println(score[3]);
		// 남아 있는걸 알게됌.
		
		
		
	}

}
