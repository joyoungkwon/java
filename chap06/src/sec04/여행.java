package sec04;

import java.util.Scanner;

// ���� -10 �λ� -5 ȭ�� -5
public class ���� {

	public static void main(String[] args) {
		// �ʱ� ���ð� ����. oil �� 20
		Scanner s = new Scanner(System.in);
		Travel tvr = new Travel();

		tvr.setOil(20);
		tvr.setLocation("����");

		while (true) {
			String tvr2 = s.next();
			if (tvr2.equals("����")) {
				tvr.oilMinus(10);
				tvr.setLocation("����");
				tvr.isoilLeft();
				System.out.println("���� ��ġ��:" +tvr.getLocation() );
				System.out.println("���� ���� �ܿ�����:"+tvr.getOil());
			}

			if (tvr2.equals("�λ�")) {
				System.out.println("�λ�");
				tvr.oilMinus(5);
				tvr.setLocation("�λ�");
				tvr.isoilLeft();
				System.out.println("���� ��ġ�� "+ tvr.getLocation());
				System.out.println("���� ���� �ܿ�����:"+tvr.getOil());
			}

			if (tvr2.equals("ȭ��")) {
				System.out.println("ȭ��");
				tvr.oilMinus(5);
				tvr.setLocation("ȭ��");
				tvr.isoilLeft();
				System.out.println("������ġ��:"+ tvr.getLocation());
				System.out.println("���� ���� �ܿ�����:"+tvr.getOil());
			}

		}
		
	}

}
