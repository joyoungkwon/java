package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class hair {

	public static void main(String[] args) {
		// ����� �̸��Է�
		// �̿�� �̿��׸� �Է�
		// ĿƮ -8000 �ĸ� 20000 ���� 25000 ���� 60000
		// if �湮 �ð��� �����̸� 30%���� ���ĸ� 10% ���ο��� 0 ���� 1
		// �������� ���� x
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �Է� ");
		String name = s.next();
		System.out.println("�̿��ϴ� ��Ÿ���Է�");
		String hair = s.next();
		Calendar now = Calendar.getInstance();
		int sum = 0;
		int total =0;
		
		switch(hair) {
		case "ĿƮ":
			sum+=8000;
			break;
		case "�ĸ�":
			sum+=20000;
			break;
		case "����":
			sum+=25000;
			break;
		case "����":
			sum+=60000;
			break;
		}
		int hour = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);
		if(hour<12 && ampm==0) {
			sum *=0.7;
		}else if(hour<6 && ampm==1) {
			sum *=0.9;
		}
		System.out.println(name+"���� �����ݾ���"+sum+"���Դϴ�.");
	}

}
