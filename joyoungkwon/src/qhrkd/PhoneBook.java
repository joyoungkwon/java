package qhrkd;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ο���");
		int num = s.nextInt(); // �ο��� �迭�� ��ĭ¥�� ������ ����.
		Phone phone[] = new Phone[num]; // �迭 ����� �迭 ���� ���ÿ�.
		int i; // ��������
		
		//�迭�� ���̸�ŭ �ݺ��ؼ� �̸��� ��ȣ�� �Է¹޾�
		//�� �迭�� ���� ��ü ���� �� ����.
		
		for (i=0; i<phone.length;i++) {
			System.out.println("�̸���ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�");
			String name = s.next();
			String phonNumber = s.next();
			phone[i]= new Phone(name,phonNumber);
		}
		System.out.println("����Ǿ���");
		while(true) {
			System.out.println("�˻����̸�");
			String name = s.next();
			for(i =0; i<num;i++) {
				if(name.equals(phone[i].getName())) {
					System.out.println(name+"�ǹ�ȣ��"+phone[i].getPhonNumber());
					i--;
					break;
				}
			}
			if(name.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
			if(i==num) {
				System.out.println(name+"�� �����ϴ�.");
			}
		}
	}

}
