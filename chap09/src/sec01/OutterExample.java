package sec01;

public class OutterExample {

	public static void main(String[] args) {
		
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested(); // 일반 인스턴스 호출.
		nested.print();
		// static 일땐, Outter.Nested nested = new Outter.Nested();
		// 인스턴스 A.B b = aa.new B();
		// static 일땐 A.B b = new.A.B
		// 중첩 클래스 , 정적 클래스  , 로컬 클래스
		// 중첩 클래스 클래스 안에 하나가 더있는거
		// 정적 클래스 Static 이 붙은클래스 
	}

}
