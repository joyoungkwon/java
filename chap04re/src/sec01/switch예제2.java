package sec01;

import java.util.Scanner;

public class switch����2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�а��ڵ带 �Է��ϼ���");
		String code =s.next();
																					//�а� �ڵ�� A123, B123 ��.
																					// �а� �ڵ��� ù�ڸ��� A�� ���а� B�� �濵�а� C�����а�
																					// ����ڰ� A123 -> �Է��ϸ� ���а� �л��Դϴ�.
																					// char �� �̾ƿ� ĳ���� �� case�� ''���� ����ǥ�� ����//
		char code2 = code.charAt(0);
		
		switch(code2) {
			case 'A' :
				System.out.println("���а�");
				break;
			case 'B' :
				System.out.println("�濵�а�");
				break;
			case 'C':
				System.out.println("�����а�");
				break;
		}
	}

}
