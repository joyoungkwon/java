package sec02;

import java.util.Scanner;

public class Ȯ�ι���11�� {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ ���� �ڵ带 �Է��ϼ���");
		String code = s.next();
		
		String admin_id =code.substring(0,3);
		int admin_psw=Integer.parseInt(code.substring(3,7));
		
		
		
		System.out.println("���̵� �Է����ּ���");
		String id = s.nextLine();
		
		System.out.println("�н�����");
		String psw =s.nextLine();
		
		int psw2= Integer.parseInt(psw);
		
		if (id.equals(admin_id)) {
			if(psw2==admin_psw) {
				System.out.println("�α��μ���");
			}else {
				System.out.println("�α��ν���");
			}
		}else {
			System.out.println("���̵��������");
		}
		
		// �ձ��� 3���ڿ� , ���̵� ������ ��.�ؾ���
		// ������ �ڵ忡�� �ޱ��ڶ� psw�� ������ �� 
		// ������ ���� �ڵ带 �Է��ϼ��� (�Է¹���)
		// ���̵� �Է� �ϼ���
		// ��й�ȣ�� �Է��ϼ���
		// ������ �α��� ���� ���н� �α��� ����: ���̵����� x
		
	}

}
