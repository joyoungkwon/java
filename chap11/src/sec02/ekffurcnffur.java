package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ekffurcnffur {

	public static void main(String[] args) {

		// �ʿ��Ѱ� ���� , ���� ��¥, ������ ��¥ .
		// ������ �� �Է� �ޱ� �׾ȿ� ���۳�¥

		Scanner s = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		System.out.println("�����Է��ϼ���");
		int year = s.nextInt();
		System.out.println("���� �Է��ϼ���");
		int month = s.nextInt();
		System.out.println();

		Calendar start = Calendar.getInstance();// ó�� ���� ��¥���� ������
		Calendar end = Calendar.getInstance();// end�� �ε��� ������ ��¥����������
		start.set(year, month - 1, 1); // ������ �� �ð��� ����Դٰ� �츮�� ��ĳ�ʷ�
		//���� �ɷ� �Ķ���͸� �ٲ�ġ����.
		end.set(year, month, 1);
		end.add(Calendar.DATE, -1);// 
		
		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		System.out.println("============"+month+"=============");
		System.out.println("�� �� ȭ �� �� �� ��");
		
		for(int i = 1; i<dayweek; i++) {
			System.out.println("   ");
		}
		
		for(int i =1 ,j =dayweek; i<=end.get(Calendar.DATE); i++,j++) {
			System.out.printf("%3d",i);
			
			if(j%7==0) {
				System.out.println();
			}
		}

	}

}
