package test;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ��:");
		String n1 = s.next();
		System.out.println("�ι�° ��:");
		String n2 = s.next();

		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		if (num1 > num2) {
			int result2 = num1 - num2;
			System.out.println("���������:" + result2);
		} else {

			int result = num1 + num2;
			System.out.println("���� ���:" + result);
		}

	}
}
// String Ÿ���� ���� int Ÿ������ ��ȯ �ҋ� Integer.parseInt(�ٲٰ��� �ϴ� ����)�� �Է��Ѵ�.
// �μ��� �Է� �޴´�
// ù���� ���� �ι�° ������ �� ũ�� ���� ���� �ϰ� �ι�° ���� �� ũ�� ���� �����Ѵ�