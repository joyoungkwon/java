package sec03.exam03;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		 int a= s.nextInt();
		 System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		 int b= s.nextInt();
		 
		System.out.println("�����ȣ�� �Է��ϼ���");
		String c=s.next();
		char d= c.charAt(0);
		
		if(d=='*'){
			int e = a *b; //if ������ �ٸ� ������ �߰� ���ϱ⿩�� int �� ����.//
			System.out.println("�Է��Ͻ� ������ �����"+ e + "�Դϴ�.");
			
		} else {
			double f= (double) a/b ;// �����⿡�� �Ҽ��� ���� Ÿ�� double ���� ������ �ʿ�//
			System.out.println("�Է��Ͻ� ������ �����"+f+"�Դϴ�.");
		}
		//char a='��'
		//char b =
		
		

	}
	//ù ���� ���ڸ� �Է��ϼ��� // // scanner , if
	//�ι�° ���ڸ� �Է��ϼ���//
	//�����Է±�ȣ�� �Է��ϼ���(*,/) - String ���� �޾Ƽ� chatAt���� ����
	//�Է��Ͻ� ������ ����� //
	

}
