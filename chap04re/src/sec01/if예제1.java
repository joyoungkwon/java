package sec01;

import java.util.Scanner;

public class if����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�����̸�");
		String name = s.next();
		System.out.println("��������");
		int point = s.nextInt(); // 1������ 10������
		// ������ 8�� �̻��̸� "�ֻ��"
		// 5�� �̻��̸� "�߱�"
		// ������ �ϱ�
		
		
		String grade; // if �� �ȿ��� ������ �����Ͽ� ���� ��Ű�� ������ ����� ����
		// �ۿ��� ����.
		if (point >= 8) {
			grade = "�ֻ��";
		} else if (point >= 5) {
			grade = "�߱�";
		} else {
			grade = "�ϱ�";
		}
		
		System.out.println(name + "���� ����� " + grade + "�Դϴ�.");
	}

}
