package sec02;

import java.util.Scanner;

public class ������2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("x�� �ʱⰪ�� �Է����ּ���");
		int a = s.nextInt();

		System.out.println("y�� �ʱⰪ�� �Է����ּ���");
		int b = s.nextInt();

		System.out.println("������ ��ȣ�� �Է����ּ���");
		String c = s.next();

		if (c.equals("+")) {
			a++;
			System.out.printf("a�ǰ���%d�Դϴ�",a);
		} else {
			b--;
			System.out.printf("b�ǰ���%d�Դϴ�",b);
		}

	}

}
// x �ʱⰪ �Է� 
//y �ʱⰪ �Է�