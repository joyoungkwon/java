package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 2���� �̸��� ó���ڵ带 �Է� �������� // �̸�
		// ��> ȫ�浿 c88 �嵿�� b70
		// �Ǿ� ���ڴ� ��� ������ 2���ڴ� �����Դϴ�.
		// ����� a~d ��� ���� �����ϰ�
		// A����� ������ 20% ���� , b����� ������ 10% ����
		// c����� ������ 5 % ����
		// ���������� 90�̸� �ֿ�� 80 �̸� ���
		// ������ �Ϲ�
		// ���� ��� ȫ�浿���� �ֿ�� ����Դϴ�.
		Scanner s = new Scanner(System.in);
		System.out.println("ù��°�̸� �� �ڵ带 �Է��ϼ���. ");
		String name = s.next();
		System.out.println("�ι�°�̸� �� �ڵ带 �Է��ϼ���. ");
		String name2 = s.next();

		// �����. a �϶��� 20% b �϶��� ���� 10%
		// c�� 5%
		// score *0.2 + score 20
		// score *0.1 + score 10

		String a = name.substring(4);
		int score = Integer.parseInt(a);

		a = name.substring(4);
		int score1 = Integer.parseInt(a);

		char code = name.charAt(3);
		char code2 = name.charAt(3);

		switch (code) {
		case 'A':
			score *= 1.2;
			break;
		case 'B':
			score *= 1.1;
			break;
		case 'C':
			score *= 1.05;
			break;
		}
		switch (code2) {
		case 'A':
			score *= 1.2;
			break;
		case 'B':
			score *= 1.1;
			break;
		case 'C':
			score *= 1.05;
			break;
		}

		if (score > 90) {
			System.out.println("ȫ�浿���� ����� �ֿ���Դϴ�.");
		} else if (score > 80) {
			System.out.println("ȫ�浿���� ����Դϴ�.");
		} else {
			System.out.println("ȫ�浿���� �Ϲ��Դϴ�.");
		}
		if (score1 > 90) {
			System.out.println("�嵿�Ǵ��� ����� �ֿ���Դϴ�.");
		} else if (score1 > 80) {
			System.out.println("�嵿�Ǵ��ǿ���Դϴ�.");
		} else {
			System.out.println("�嵿�� �Ϲ��Դϴ�.");
		}
	}

}
