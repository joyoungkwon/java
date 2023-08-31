package sec01;

public class Student extends Human {
	int studentCode ; // 학번
	String studentDept; // 학과
	
	
	Student(int width,int height,int studentCode){ // 부모 생성자 불러오는 호출
		super(width,height);
		this.studentCode = studentCode;
	}

	
	Student(int studentCode , String gender , int height){
		this.gender = gender;        	//상속
		this.height = height;        	//상속
	}
	void study(String place) {
		System.out.println(place+"에서 공부합니다.");
	}
	void dressOn() {
		System.out.println("교복을 입습니다.");
	}
	void dressOff() {
		System.out.println("교복을 벗습니다.");
	}
	// StudentExamle 생성 (메인구문 ) Student 객체 생성 매게변수 3개 넘겨주기
	// 자기 메소드 1개호출
	// 부모 메소드 2개호출
	
	
	
	@Override // 오버 라이드 source 로 override
	String eat(String food) {
		String result = food+"를 매일 먹어요";
		return result;
	}
	
}
