package sec03;

public class Student {
	// 멤버 변수 이름 나이 학번 성별 연락처
	// 기본생성자
	// 사용자 정의 생성자2개
	// 사용자 1번 식: 이름 나이
	// 사용자 2번 식: 이름 학번 연락처

	String name; // 이름
	int age; // 나이
	String numb; // 학번
	String gender;// 성별
	String phone; // 연락처
	// 숫자변수의 연산 작업이 필요하지 않다고 판단 하면 String 을 주로 사용함
	
	
	
	public Student() { // 기본생성자

	}

	public Student(String name, int age) { // 사용자 정의1 생성자 1번식: 이름 , 나이
		this.name = name; // 이름 매개 변수라함
		this.age = age; // 나이
	}

	public Student(String name, String numb, String phone) { // 사용자 정의 2 : 생성자 이름 학번 연락처
		this.name = name; // 이름
		this.numb = numb; // 학번
		this.phone = phone; // 연락처
		
		// 기존 생성자에 다른 생성자 추가를 오버로딩이라함
		// 소스에서 using Filed 간편하게만듬
	}

	}
