package sec01;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸����� �Է����ּ���");
		String email = s.next();
		int intdex = email.indexOf("@"); // 
		
		String str = email.substring(0,intdex);
		System.out.println(str);
		
		
		int start = email.indexOf("@");
		int leng = email.length();
		String domain = email.substring(start+1, leng);
		
		
		//ex) email �� 12dk545@hanmail.net -> ���̵� �����غ���.

	}

}
