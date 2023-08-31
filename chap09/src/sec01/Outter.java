package sec01;

public class Outter {
	String name ="홍길동";
	
	void reName() {
		System.out.println("홍길동으로이름변경");
	}
	
	class Nested{
		String name ="장동건";
		void reName() {
			System.out.println("장동건으로이름변경");
		}
		void print() {
			System.out.println(this.name); // Nested 클래스 name 호출
			System.out.println(Outter.this.name); // Outter 클래스 name 호출
		}
		
	}
	
	
	}

