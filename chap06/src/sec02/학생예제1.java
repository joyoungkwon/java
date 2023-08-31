package sec02;

public class 학생예제1 {

	public static void main(String[] args) {

		Student s = new Student(); // 스캐너처럼 객채 생성
		System.out.println(s.name);

		s.dept = "법학과";     // 불러다가 변경도 가능

		System.out.println(s.dept);
	}

}
