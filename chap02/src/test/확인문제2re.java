package test;

import java.util.Scanner;

public class Ȯ�ι���2re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ��:");
		String n1 = s.next();
		System.out.println("�ι�° ��:");
		String n2 = s.next();

		if (n1.equals(n2)) {
			System.out.println("�μ��� ���ƿ�");

		} else {
			System.out.println("�μ����޶��");
		}
	}
}
//ù ��° ���� �ι�° ���� ������ = �μ��� ���ƿ�
// �ι�° ���� �ι�° ���� �ٸ��� = �μ��� �޶��
//if ������ ���� �� == ���� a>b a�� b���� Ŭ��
// ��Ʈ�� Ÿ���� ���ڿ� (����)equals(����) < ���� if���� else>