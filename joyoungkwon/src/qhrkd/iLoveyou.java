package qhrkd;

import java.util.Scanner;

public class iLoveyou {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//scanner
		System.out.println("���ڿ����Է��ϼ��� ��ĭ���־�� �ϸ�����ϼ���");//syso
		String str = s.nextLine();//����
		for(int i=0; i<str.length();i++) {//str����
			String h =str.substring(0,1); // 
			String e =str.substring(1);
			str =e+h;// ���ڿ� ���ڹٲٱ� -�̰Ź����.
			System.out.println(str);
		}
		s.close();
	}

}
