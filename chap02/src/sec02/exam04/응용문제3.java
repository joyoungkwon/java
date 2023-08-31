package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("입력하신 건물은 전체");

		System.out.println("건물은 몇층인가요");
		int a = s.nextInt();

		int y = a * 5;
		int b = y / 3;

		System.out.println("입력하신 건물은 전체" + y + "m이고 " + " 최대인원거주는" + b + "명입니다");
		
	
	}

}
