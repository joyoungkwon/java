package sec03.exam07;

import java.util.Scanner;

public class Ȯ�ι���1 {
// �� = �� % < ������
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" ���� �׼��� �Է��ϼ���");
		
		int a = s.nextInt();
		System.out.println("�������� :"+ a/ 50000 + "��");
		a = a% 50000;
		System.out.println("������ :"+ a / 10000 +"��");
		a= a% 10000;
		System.out.println("õ���� :"+a/1000+"��");
		a= a% 1000;
		System.out.println("���¥������ :"+a/100+"��");
		a= a % 100;
		System.out.println("�ʿ�¥�� ���� :"+a/10+"��");
		a= a % 10;
		System.out.println("�Ͽ�¥�� ����:"+a/1+"��");
		a= a % 1;
		
		

	}

}
