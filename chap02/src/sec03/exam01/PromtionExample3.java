package sec03.exam01;

import java.util.Scanner;

public class PromtionExample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��� �б��� �Է��ϼ���");
		String a = s.next();
		char b = a.charAt(2);
		System.out.println("���� ���г��ΰ���?");
		int x = s.nextInt();

		if (b == '��') {
			System.out.println("����� ���б�" + x + "�г��Դϴ�.");
		} else {
			System.out.println("����� ����б�" + x + "�г��Դϴ�.");
		}
	}

}
