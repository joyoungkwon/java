package project;

import java.util.Scanner;

public class �ݺ�����2 {
	// ��ǻ��, �� ������ ���� (��,��,��,��,��)
	// ù ��� 1- ���� ���� 2-��������.
	// 1�� ������ ���� ��ǻ�Ͱ� �������� ���ڸ� �̾Ƴ� 1�� 2�� 3�� 4�� 5��
	// �̾Ƴ� ����� ���. ex) �� : �� ��ǻ�� : ��
	// ������̰���ϴ�. ����� �����ϴ�. �����ϴ�.
	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //��ĳ��
		playGame gg = new playGame();	 // 

		int computer; // ��ǻ�� �ȿ� ���� ����
		int my; // ���� ���� ����

		boolean game = true; // while �� �������� ���� true 
		while (game) { // game true 
			System.out.println("������ ������ �����մϴ�.");  // �ݺ�
			System.out.println("1�� ���� ���� 2�� ���� ���� �Դϴ�."); // �ݺ�
			int start = s.nextInt(); // while �� �ݺ� 

			if (start == 1) { // 1�� �Է��ؼ� �Ѿ���� ����
				computer = (int) (Math.random() * 5) + 1; // computer ���� �� int �� Ÿ�Ժ�ȯ�� math.random�޼ҵ� (0~5����)+1= 1���� 5���� 
				System.out.println("��ǻ���� ����" + computer); // �̾ƿ� ���� ����ؼ� �����ֱ�
				
				my = (int) (Math.random() * 5) + 1; // my ������ ���� ���� 1���� 5���� �̾ƿ���
				System.out.println("���� ����" + my); // ���� �̾ƿ� ���� ����ؼ� ��� ����
				
				gg.play("computer", computer); // switch ���� 1-�� 2-�� 3-�� 4-�� 5-�� ���� 1���� 5���� case �� ��,��,�� , ��, �� �ٲ�
				gg.play("my", my); // switch ���� 1-�� 2-�� 3-�� 4-�� 5-�� ���� 1���� 5���� case �� ��,��,�� , ��, �� �ٲ�
				
				if(my==computer) { // while �� �ȿ� if
					System.out.println("�����ϴ�."); // ������
				}else if(my>computer) {
					System.out.println("����� �̰���ϴ�"); // my�� ��ǻ�ͺ��� Ŭ��
				}else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�"); // my���� ��ǻ�Ͱ� Ŭ��
				}
			}else {
				System.out.println("������ �����մϴ�");
				game =false; // if �� �������ͼ� while ������ boolean game ���� (true) �� false; �� �ٲ㼭 ����
			}
		}
	}
}