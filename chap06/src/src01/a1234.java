package src01;

import java.util.Scanner;

public class a1234 {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			String [] name = new String[3];
			for(int i =0; i<name.length ;i++) {
				System.out.println("이름입력");
				name[i]=s.next();
			}
			int [][] n = new int[3][2];
			for (int i=0; i<n.length;i++) {
				int sum =0;
				for(int j=0; j<n[i].length ;j++) {
					if(j==0) {
						System.out.printf("%s의 중간고사 점수는"+name[i]);
					}
				}
			}

	}

}
