package sec06.exam05.packege1;

public class A {
	public int field1;
	int field2;
	private int field3;
	
	
	
	public A() { 											//같은 클래스 내부에서는 모두 허용됨
		field1 =1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
	}
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
