package sec01;

public class Computer2 extends Calculator {

	@Override // 오버라이드 표시
	double areaCircle(double r) {
		System.out.println("Computer2 객체의 areaCircle()실행");
		return Math.PI *r*r;
	}

	

}
