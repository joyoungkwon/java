package qhrkd;

import java.util.Scanner;

public class iLoveyou {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//scanner
		System.out.println("문자열을입력하세요 빈칸이있어도됌 니맘대로하세요");//syso
		String str = s.nextLine();//한줄
		for(int i=0; i<str.length();i++) {//str길이
			String h =str.substring(0,1); // 
			String e =str.substring(1);
			str =e+h;// 문자열 숫자바꾸기 -이거물어보기.
			System.out.println(str);
		}
		s.close();
	}

}
