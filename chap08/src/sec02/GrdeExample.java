package sec02;

import java.util.Scanner;

public class GrdeExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("����,����,����, ������ �Է��ϼ���.");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math,science,english);
		
		System.out.println("�����"+me.average());
		
	}

}
