package sec04;

public class 학생 {
	// 성별 , 학과 코드 , 시험성적, 멤버 변수 선언
	// 성성자 만듦
	// 생성자 매게변수 성별 학과코드, 시험 성적
	// 스타트 메소드는 리턴값 없는 void 로
	// end 메소드 는 학점 리턴
	// 시험 성적으로 학점 구함 90이상 A 80점 B 70 C 나머지 F

	// 1번 주석 성별 학과 코드 시험성적 // 멤버 변수 선언
	String gender;
	String code;
	int score;

	// 메소드랑 생성자 헷갈리지않기
	// 2번 주석 조건 생성자 만듦
	// 생성자 만들어서 기본 생성자 말고 값을 준상태로 호출
	public 학생(String gender, String code, int score) {
		super();
		this.gender = gender; // 클래스에서 값을 대입시켜 받아옴.
		this.code = code; // 클래스에서 값을 대입시켜 받아옴.
		this.score = score; // 클래스에서 값을 대입시켜 받아옴.
	}

	// 7번 주석 조건 , 리턴값 없는 void start 메소드 만들기
	void Start() {
		System.out.println(code); // 입력한 학과 를 불러와서 출력시킴
		System.out.println(gender); // 입력한 성별을 불러와서 출력시킴
		System.out.println(score); // 입력한 점수를 불러와 출력시킴
		String result = end(score); // String 으로 끝낸 if문을 String
		//타입 result로 받고 end if에 (score)를 저장
		System.out.println("학점은" + result);
		// (학점은,result)라는 출력 구문 실행
	}
	// 8 번 주석 조건 end 학점의 결과를 리턴값으로 저장
	// 시험 성적 A = 90 B = 80 C= 70점 IF 문 사용
	// result 에 "A,B,C"라고 값 저장 (출력 구문 은 위로 끌어다감)

	String end(int score) { // 숫자를 문자열 A , B ,C 와 비교하기 위해
		// 메소드 앞 String 타입 end 생성 리턴값이 필요하여 void 메소드 
		// 사용 안하고 받을 타입 String 으로 받아옴
		String result; // 스트링으로 result;를 초기화 시키고.
		if (score >= 90) { // score 와 숫자 90을 비교
			result = "A";
		} else if (score <= 80) {// score 와 숫자 80을 비교
			result = "B";
		} else if (score <= 70) {// score 와 숫자 70을 비교
			result = "C";
		} else {// score 와 숫자 69~0까지를 비교
			result = "D";
		}
		return result; // 결과 값을 result 변수에 리턴

	}

}
