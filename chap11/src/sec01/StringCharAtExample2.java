package sec01;

import java.util.Scanner;

public class StringCharAtExample2 {

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

		// �����. a �϶��� 20% b �϶��� ���� 10%
		// c�� 5%
		// score *0.2 + score 20
		// score *0.1 + score 10

		String[] names = new String[2];
		int[] scores = new int[2];
		char code = 0;

		for (int i = 0; i <= names.length; i++) {

			Scanner s = new Scanner(System.in);
			System.out.println("�̸� �� �ڵ带 �Է��ϼ���. ");
			names[i] = s.next();

			String a = names[i].substring(4);
			int score = Integer.parseInt(a);

			code = names[i].charAt(3);
		}

		for (int i = 1; i <= names.length; i++) {

			switch (code) {
			case 'A':
				scores[i] *= 1.2;
				break;
			case 'B':
				scores[i] *= 1.1;
				break;
			case 'C':
				scores[i] *= 1.05;
				break;
			}
			names[i] = names[scores[i]];
		}

		for (int i = 0; i <= names.length; i++) {

			if (scores[i] > 90) {
				System.out.println(names[i] + "���� ����� �ֿ���Դϴ�.");
			} else if (scores[i] > 80) {
				System.out.println(names[i] + "���ǿ���Դϴ�.");
			} else {
				System.out.println(names[i] + " �Ϲ��Դϴ�.");
			}
		}
	}

}
