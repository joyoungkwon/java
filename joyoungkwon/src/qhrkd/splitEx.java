package qhrkd;

import java.util.Scanner;

public class splitEx {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //��ĳ���Է�
		
		while(true) {
			System.out.println("������ �����մϴ� >>");
			String str =s.nextLine();// �����о���� ����.�Է�
			if(str.equals("�׸�")) {//�׸�����
				System.out.println("����");
				break;
			}else {
				System.out.println("���������� :"+str.split("").length);
//				����������γ���.
			}
		}

	}

}
