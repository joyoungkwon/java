package sec01;

import java.util.Scanner;
import java.util.*;

public class qz {
	Scanner s = new Scanner(System.in);//��ĳ��
	
	List<ArrayL> list = new ArrayList<>();// Ŭ���� ��ü �� Array�ѱ�
	int[] qznum = new int[4]; // ������ ���� 4��¥�� ����.

	public qz() { // ArrayL list�� add�� �߰�.
		// �׷��� ArrayL�� ������ �ִ°�.
		list.add(new ArrayL("A", "����")); // ArrayL�� Ŭ������ ������ ��. add�� �߰�
		list.add(new ArrayL("B", "��"));
		list.add(new ArrayL("C", "��"));
		list.add(new ArrayL("D", "��"));
		list.add(new ArrayL("E", "��"));
		list.add(new ArrayL("F", "����"));
		list.add(new ArrayL("G", "��"));
	}

	public void run() { // qz�� run�̶�� �޼ҵ�
		boolean start = true;
		System.out.println("�������� �߸��߱� ������ �����մϴ�. \n" + 
		list.size() + "�� �ܾ ����Ǿ� �ֽ��ϴ�\n -1�� ������ ����˴ϴ�.");
		int num = 0; // ���ᰪ ��� �ʱ�ȭ
		while (start) { 
			randomqz(); // list�� ����Ǿ� �ִ� ����  ���� ����� ������ �ϴ� �޼ҵ�
			// (�ߺ����ŵ�)
			int answeNum = (int) (Math.random() * qznum.length);
			// answeNum �� ���� �� qznum ���� ���̸�ŭ. 
			//���� ���� 1,2,3,4 �߿� ����.

			int answerIndex = qznum[answeNum];
			// ���� ����

			System.out.println(list.get(answerIndex).getEng());

			for (int i = 0; i < qznum.length; i++) { //������ ���̸�ŭ ���ư��� ����
				System.out.println((i + 1) + list.get(qznum[i]).getKor()); 
			}
			System.out.println(">>");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println(num + "����");
				break;
			} else if (input - 1 == answeNum) {
				System.out.println("����");
				num++;
			} else {
				System.out.println("����.");

			}
		}

	}

	public void randomqz() { //������ �̾ƿ��� �޼ҵ�
		for (int i = 0; i < 4; i++) { //�׹��ݺ�
			qznum[i] = (int) (Math.random() * list.size()); // int Ÿ�� qznum�� �迭��
			//i��° �ε��� ���� ������ ArrayList list �� ����Ǿ��ִ� ���� ���̸�ŭ 
			// ������ ����
			for (int j = 0; j < i; j++) { // 2�� ����.
				if (qznum[i] == qznum[j]) { // if qznum[i] ��° ���̶� qzum[j]��° ���� ���� ������
					// i�� ���̳ʽ� �ؼ� ������ ������ �ִ� �� �״�� �ٽ� �������� Ÿ����.
					
					i--;
					continue;
				}
			}
		}
	}
}
