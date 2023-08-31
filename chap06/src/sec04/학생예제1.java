package sec04;

public class 학생예제1 {

	public static void main(String[] args) {
		// 생성자를 기본 생성자 말고 임의로 만들었기 때문에
		// 호출할때 생성자 식 에 맞춰 객체생성 값을 줘야 실행
		
		학생 stu = new 학생("A123", "남", 90);
		stu.Start();
		
		
		
		
						// void 라는 Start 메소드 호출시 
						// 성별 학과 시험성적 코드 값 코드 읽음
						// 생성자로 코드 get받아옴.
						//end if문 실행(90 A 80 B 70 C 나머지 결과 D )
						// Start 에서 result 에 end 값을 저장시킴 end 값안에
						// score 저장
						// 출력 구문 후 ("학점은" +result) 값 실행
		
		
		

	}

}
