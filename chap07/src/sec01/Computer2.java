package sec01;

public class Computer2 extends Calculator {

	@Override // �������̵� ǥ��
	double areaCircle(double r) {
		System.out.println("Computer2 ��ü�� areaCircle()����");
		return Math.PI *r*r;
	}

	

}
