package sec02;

import java.util.Scanner;

public class ���л� {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("�л����Է�");
		int a = s.nextInt();
		System.out.println("���� ���� �Է�");
		int b = s.nextInt();
		int c = b / a ;
		int d = b % a;
		System.out.printf("�л��Ѹ��%d���������� ��������%d�������ƿ�",c,d);
		
		System.out.println("�л���");
		int e= s.nextInt();
		System.out.println("���ٿ� ��� �ɰ��ֳ�");
		int f =s.nextInt();
		
		int g = f/e;
		int h = f % e;
		System.out.printf("�� %d���̰� ���� �¼��� ���� %d���Դϴ�",g,h);
		

	}

}
