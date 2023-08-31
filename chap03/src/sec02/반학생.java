package sec02;

import java.util.Scanner;

public class 반학생 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("학생수입력");
		int a = s.nextInt();
		System.out.println("연필 개수 입력");
		int b = s.nextInt();
		int c = b / a ;
		int d = b % a;
		System.out.printf("학생한명당%d개씩연필을 가져가고%d개가남아요",c,d);
		
		System.out.println("학생수");
		int e= s.nextInt();
		System.out.println("한줄에 몇명씩 앉고있나");
		int f =s.nextInt();
		
		int g = f/e;
		int h = f % e;
		System.out.printf("총 %d줄이고 남은 좌석의 수는 %d개입니다",g,h);
		

	}

}
