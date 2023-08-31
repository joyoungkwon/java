package sec06.exam05.packege1;

public class B {
	public B() {
		A a = new A();
		a.field1=1;
		a.field2=1;
//		a.field3 =1; private 접근 제한자로 접근 불가
		
		
		a.method1();  //public 모두 허용
		a.method2();	//default 는 같는 패키지라 접근 가능
//		a.method3();  private 접근 제한자로 접근 불가
		

	}
}
