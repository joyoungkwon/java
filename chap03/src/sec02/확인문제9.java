package sec02;

import java.util.Scanner;

public class Ȯ�ι���9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° �Ǽ��� �Է��ϼ���");
		String strf1=s.next();
		System.out.println("�ι�° �Ǽ��� �Է��ϼ���");
		String strf2 = s.next();
		
		float f1 = Float.parseFloat(strf1);
		float f2 = Float.parseFloat(strf2);
		
		
		
		
		
		
		if(f2==0 ) {
			System.out.println("���Ѵ�:��");
			
		}else {
			float f3 = f1/f2;
			System.out.println(f3);
		}
		
		
		
		/*
		double x = Double.parseDouble(strf1);
		double y = Double.parseDouble(strf2);
		double result = x / y;
		
		if(y == 0 || y == 0.0) {
			System.out.println("����� : ���Ѵ�");
		}else {
			System.out.println("����� : " + result);
		}
		*/
		
		
		
		

	}
	// �Ǽ� ���� �ΰ��� �ް�
	// �Էµ� ù��° ���� �ι�° ���� ���� ����� ����� ���
	// �ι�° ���� 0�Ǵ� -.00�� �Է� �Ǿ��� ���, ��� ����� "��� : ���Ѵ�"�� �ǵ��� �ڵ� �ۼ� (scanner next �� ���)
}
