package sec01;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// String str1 = "나는 자바를 싫어해요 ";
		// String newstr = str1.replace("자바", "java");
		// System.out.println(newstr);

		Scanner s = new Scanner(System.in);
		System.out.println("주소입력");
		String my = s.next();

		String newMy = my.replaceFirst("", "");
		System.out.println(newMy);
		
		
		

	}

}
