package qhrkd;

import java.util.Scanner;

public class qhrkd2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("정수입력");
		num = s.nextInt();
		
		for(int i =0; i<num;i++) { 
			for(int j =0; j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
