package sec01;

import java.util.Scanner;

public class IndexOfExmaple {

	public static void main(String[] args) {
		
		String str1 = "���� �ڹٸ� �Ⱦ��ؿ� ";
		
		int index =str1.indexOf("�ڵ�"); //fasle;������ ���� ��Ʈ��
		System.out.println(index);
		
		
		String str2 = "����,�ξ�,���,���,";
		int index1 = str2.indexOf("����");
		 str2 = "����,�ξ�,���,���,";
		int index2 = str2.indexOf("�ξ�");
		str2 = "����,�ξ�,���,���,";
		int index3 = str2.indexOf("���");
		str2 = "����,�ξ�,���,���,";
		int index4 = str2.indexOf("���");
		
		
													// �ּҸ� �Է� ����.
													// �ּҿ� ����,�ξ�,���,���,�� ����. �ϱ����ֹ��Դϴ� ���
													// �ƴϸ� �ϱ� ���ֹ��� �ƴմϴ�.
		
		Scanner s = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		String myHome = s.next();
		
		if(str2.indexOf(index1)!=-1 || str2.indexOf(index2) != -1 || str2.indexOf(index3)!=-1||
				str2.indexOf(index4)!=-1) {
			System.out.println("����� �ϱ� �ֹ��Դϴ�.");
		}else {
			System.out.println("����� �ϱ� �ֹ��� �ƴմϴ�.");
		}
		
		
		
		

	}

}
