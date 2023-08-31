package sec03;

public class 학생예제1 {

	public static void main(String[] args) {
		// 기본 생성자 객체 생성후 기본 생성자에서 이름과, 나이 출력
		// 매게변수 2개 생성자 1번객채 생성 (사용자정의1)
		// 매게변수 1번 객체엔 이름은 홍수아, 나이는 30살 설정.
		// 메게변수 3개 생성자 2번 객체 생성 (사용자 정의2)
		// 2번 객체 엔 이름은 홍길동 학번은20231111 연락처 010-5555-7777

		// 기본 생성자 1번조건
		Student stu = new Student();
		System.out.println(stu.name);         // 아무값도 안줌 문자열 자리엔 null 출력
		System.out.println(stu.age);        // 숫자 는 0

		// 매게변수2개 사용자 정의 1번 설정
		// 조건 1홍수아, 조건 2 나이 30
		Student stu2 = new Student("홍수아",30);
		System.out.println(stu2.name); //조건1
		System.out.println(stu2.age); //조건 2
		
		
		// 메게변수 3개 사용자 정의 2번 설정
		// 조건 이름 조건 1 홍길동 조건 2학번은20231111 조건3 핸드폰번호 010-5555-7777
		Student stu3 = new Student("홍길동", "20231111", "010-5555-7777");
		System.out.println(stu3.name); //조건1
		System.out.println(stu3.numb); //조건2
		System.out.println(stu3.phone); //조건3
		
		//************ 뽑아오는 변수이름 햇갈림 확인하기.***********//
		//************ 새로운 객체 괄호 안에 , 로 추가하기************* //
	}

}
