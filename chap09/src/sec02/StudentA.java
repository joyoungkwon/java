package sec02;

public class StudentA {

	// �͸� ��ü ����.
	Person person = new Person() {
		void work() {
			System.out.println("��մϴ�.");
		} 
		void rotlfgek(){
			System.out.println("��¥ �� �ϱ�÷� �ʹ� ����� �ʹ� �ް����� �ʹ� ���巯");
		}

		@Override
		void Wake() {
			//System.out.println("6�ÿ� �Ͼ�ϴ�"); - ���� �޼ҵ常 ������ ���������.
			work();
			rotlfgek();
		}
	};

	// ��øclass
	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("������ϴ�.");
		}
	}
	
	// �͸� ��ü�� ���Ե� �޼ҵ�
	void method1() {
		Person localVar = new Person() {

			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void Wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.Wake();
	}

	// �Ű������� �͸�ü�� �޾Ƶ��̴� �޼ҵ�
	void method2(Person person) {
		person.Wake();
	}

}
