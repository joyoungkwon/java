package sec01;

import java.util.Scanner;

public class if����2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�����̸�");
		String name = s.next();

		// ���� �̸� 3���� �幮��, �̻��̸� ����������
		// ���� �̸� �α��� �� �ι��� ���� �̻� - ��.
		// ������°��� ���

		if (name.length() == 3) { // ���ڿ� ���� ���� �ȿ����� if������ ��밡��
			
				System.out.println(name.charAt(2)); // 0,1,2 �̾� �� �ڸ���
			} else {
				System.out.println(name.charAt(1)); // 0,1
			}
			
			
			
		}

}
