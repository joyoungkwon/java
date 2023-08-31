package sec01;

public class StudentExample {

	public static void main(String[] args) {

		Student stu = new Student(1123, "남", 173);

		stu.study("학교"); // 자기
		String eat = stu.eat("밥"); // 부모
		System.out.println(eat);
		// String 타입의 return값이 있는 메소드는,
		// 받는 타입의 따라 변수를 생성 하고 result 를 리턴 시키고
		// 받은 변수를 출력
		stu.sleep(); // 부모
		// void return 값이 없음
		String run = stu.run(4);
		System.out.println(run);
		// String 타입의 return값이 있는 메소드는,
		// 받는 타입의 따라 변수를 생성 하고 result 를 리턴 시키고
		// 받은 변수를 출력
	}

}
