package sec02;

public class StudentA {

	// 익명 객체 생성.
	Person person = new Person() {
		void work() {
			System.out.println("등교합니다.");
		} 
		void rotlfgek(){
			System.out.println("진짜 나 하기시러 너무 힘들어 너무 햇갈리고 너무 힘드러");
		}

		@Override
		void Wake() {
			//System.out.println("6시에 일어납니다"); - 나의 메소드만 가지고 오고싶을때.
			work();
			rotlfgek();
		}
	};

	// 중첩class
	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("잠을잡니다.");
		}
	}
	
	// 익명 개체가 포함된 메소드
	void method1() {
		Person localVar = new Person() {

			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void Wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.Wake();
	}

	// 매개변수로 익명개체를 받아들이는 메소드
	void method2(Person person) {
		person.Wake();
	}

}
