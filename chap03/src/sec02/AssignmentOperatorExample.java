package sec02;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		int num1 =100;
		System.out.println("���� �Է� �ϼ���");
		int a = s.nextInt();
		System.out.println("������ �Է��ϼ���");
		String b =s.next();
		if(b.equals("+")) {num1+=a;}
		if(b.equals("-")) {num1-=a;}
		if(b.equals("*")) {num1*=a;}
		if(b.equals("/")) {num1/=a;}
		if(b.equals("%")) {num1%=a;}
		
		System.out.println(num1);

		
	}

}
// ��ĳ�� �̿��ؼ� ���� �Է¹ޱ�
// ���� ������ ��� num1�� ���
// ������ ��ĳ�� �Է¹ޱ�
// ��Ʈ�� Ÿ���� ������ �����ϱ� next
// if���� �� ���� �����ϱ� and or xor
// if �� �ۼ� �ϱ� , +,-,*,/,%
