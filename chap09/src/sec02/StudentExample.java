package sec02;

public class StudentExample {

	public static void main(String[] args) {
		// Student B 객체 생성.
		StudentA stu = new StudentA();
		StudentA.StudentB stb = stu.new StudentB();
		// 중첩클래스 바깥클래스, 안쪽클래스
		// 안쪽 클래스 객체 생성이 바로 X
		// 바깥클래스 객체를 먼저 생성한 후 안쪽클래스 객체를 생성할 수 있음
		// 단 클래스가 static으로 선언되어 있으면 바로 생성 가능함

		stb.age = 17;
		stb.name = "김철수";
		stb.sleep();

		stu.person.Wake();
		stu.method1();
		// method2 는 매개 변수로 Person 클래스 타입을 넘겨줘야함
		// 매개변수는 마지막에 ; 사용안함.
		stu.method2(new Person() {
			void study() {
				System.out.println("공부를합니다.");
			}

			@Override
			void Wake() {
				System.out.println("8시에 일어납니다.");
				// 오버라이드 안된 메소드를 바로 호출안되기 때문에
				// 이중으로 메소드를 호출함.
				study();
			}

		}

		);

	}

}
