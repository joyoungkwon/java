package sec01;

import java.util.*;

public class ArrayListExmaple1 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		boolean code = true;

		for (int i = 0; i < 6; i++) {
			System.out.println("�����Է�");
			char grade = s.next().charAt(0);
			// next String �޴� ���ڿ� ü�ν����� charAt ���� �̾ƿ���
			list.add(grade);
			// ArrayList�� add�޼ҵ�� �߰��ϱ�
		}
		double sum = 0.0; // �� �����ʱ�ȭ
		double average = 0.0; // �Ǽ� ������ �ʱ�ȭ

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			// list�� i��° ���̶� ��
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'E':
				sum += 1.0;
				break;
			case 'F':
				break;
			}
		}
		average = sum / 6;
		System.out.println("�������"+average);

	}

}
