package sec02;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л���");
		int student = s.nextInt();
		System.out.println("���ٿ� ��� �ɰ��ֳ�");
		int line = s.nextInt();

		int result1 =student/line;
		int result2 =student%line;

		int result3 = (student % line == 0) ? student / line : student / line + 1;
		int result4 = (student % line == 0) ? student % line : line - student % line;
		System.out.printf("�� %d���̰� �����¼�����%d���Դϴ�", result1, result2);
		}

		
	}

//"��%���̰� ���� �¼��� ����0���Դϴ�."