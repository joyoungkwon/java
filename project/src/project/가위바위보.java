package project;

import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		// ��ǻ�Ϳ� ������������ �մϴ�.
		// ����ڰ� ���� ���� ���� �Է��մϴ�. // Scanner �Է�
		// ��ǻ�ʹ� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����մϴ� // ���� �޼ҵ� �̾ƿ���
		// ����� �Է°� ��ǻ�� ������ �� �ؼ� ���� �̰���� ��� // ���� �޼ҵ带 ��
		// ����ڰ� "�׸�"�Է½� ���� �� // �׸��Է½� ����.
		// �ݺ� ���� �迭. // while �� switch ��

//		(Math.random() ) ���� ���� �Է�.
		Scanner s = new Scanner(System.in);
		String game[] = { "����", "����", "��" };
		while (true) {
			System.out.println("���������� ����");
			System.out.println("�׸��Է½� ����");
			String userd = s.next();
			if (userd.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			System.out.println("���� ������" + userd);
			int let = game.length;
			String com = game[(int) (Math.random() * let)];
			System.out.println("��ǻ�Ͱ� ���� �� " + com);
			if (userd.equals(com)) {
				System.out.println("�����ϴ�.");
			} else if (userd.equals(game[0]) && com.equals(game[2]) || userd.equals(game[1]) && com.equals(game[0])
					|| userd.equals(game[2]) && com.equals(game[2])) {
				System.out.println("�̰���ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
		}

	}

}
