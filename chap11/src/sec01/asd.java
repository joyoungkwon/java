package sec01;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// String str1 = "���� �ڹٸ� �Ⱦ��ؿ� ";
		// String newstr = str1.replace("�ڹ�", "java");
		// System.out.println(newstr);

		Scanner s = new Scanner(System.in);
		System.out.println("�ּ��Է�");
		String my = s.next();

		String newMy = my.replaceFirst("", "");
		System.out.println(newMy);
		
		
		

	}

}
