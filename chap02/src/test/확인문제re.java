package test;

import java.util.Scanner;

public class Ȯ�ι���re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name=s.next();
		
		System.out.println("�߰���� ����?");
		double mid = s.nextDouble();
		
		System.out.println("�⸻��� ����?");
		double last = s.nextDouble();
		
		System.out.println("����Ʈ ������?");
		double report = s.nextDouble();
		
		double mlr =(mid+last+report)/3;
		
		System.out.printf("%s���� ��� ������:%5.2f�Դϴ�.",name,mlr);
		
		
		
		// f�Ǽ� �ڸ����� .�� ���� ex) %5.2f= 12.45 
	}

}
//printf ��� �ѹ��� ��� ��� ���� double f
//19�� <���� d ��Ʈ�� Ÿ�� s(���ڿ�)