package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("ù��° ���Է�");
		int a=s.nextInt();
		System.out.println("�ι�° ���Է�");
		int b=s.nextInt();
		System.out.println("������ �Է�");
		String c= s.next();
		if(a>b) {
			int temp;
			int result;
			double result2;
		}
		if(c.equals("+")) {
			int p = a+b;
			System.out.println("������"+p);
		}
		if(c.equals("-")) {
			int m = a+b;
			System.out.println("������"+m);
		}
		if(c.equals("*")) {
			int dd = a+b;
			System.out.println("������"+dd);
		}
		if(c.equals("/")) {
			double f = a/b;
			double ff = a%b;
			System.out.printf("�μ��� ��������%s��������%f�Դϴ�.",f,ff);
		}
			 

	}

}
