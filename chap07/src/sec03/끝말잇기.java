package sec03;

import java.util.Scanner;

public class �����ձ� {

	public static void main(String[] args) {
////		// �����ձ�. ��ĳ�� �Է� . ���� �ϴ� �ο��� ����.
////		// ������ �Է� �ϴ� �ſ� ���� . �Է��� �̸���. �� ����. []�迭
////		// �ݺ� �ϰ� �ϱ�
////		// ù ���þ "�ƹ���"
		Scanner s = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�.");
		System.out.print("�ο����� �Է��ϼ���" + ">>");
		int playerNum = s.nextInt();
		String name[] = new String[playerNum]; // ���� ���� �ѹ���.

		// ��Ʈ���� �迭��ŭ �÷��̾��� �̸��� �Է��ϸ� ��.
		for (int i = 0; i < playerNum; i++) { // �÷��̾��� ���� ����ŭ ������ �ݺ�.
			System.out.print("�÷��̾� �̸� �Է�");
			String playerName = s.next();
			name[i] = playerName;
		} // ���� ����

		String word = "�ƹ���";
		System.out.println("���۴ܾ�� �ƹ����Դϴ�.");
		O:while (true) {
			for(int i=0; i<name.length; i++) {
				int lastIndex = word.length() - 1; 			 // �迭�� ���� �ε��� ���ڿ��� 123 �̴ϱ� �迭 �ε��� ���� �������� -1
				char lastChar = word.charAt(lastIndex); 	// ĳ���� Ÿ�� '' �ϳ��� �ε��� ������ ��ȣ�� �̾ƿ��� ���� ��Ų��.
				System.out.print(name[i] +" >> ");
			
			String inputWord = s.next();
			if (inputWord.charAt(0) != lastChar) {
				System.out.println("�����ձ� ����");
				break O;
			}else {
				word=inputWord;
			}
		}
		
	}

	}

}
