package qhrkd;

import java.util.Scanner;

public class qhrkd3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // ��ĳ�� �Է�
		int[] num1 = new int[10]; // �迭 10��¥�� ���� ���� �� �� ����� Ÿ���� �ܿ��
		System.out.println("����10���Է�"); // ���� 10�� ��±���
		
		for(int i =0; i < num1.length; i++) { // �迭�� ���� ���� ��ŭ i�� ���� ��Ű��.
			num1[i]=s.nextInt(); // �迭�� �ε��� i �ڸ��� ���� ���� ����.
		}
		System.out.println("¦����:"); // ¦����
		for(int i =0; i<num1.length; i++) {// int i ���� �迭�� ���̸�ŭ i ++
			if(num1[i]%2 ==0) { // ���ǹ� num[i]�� ����Ǿ��ִ� ���� ������ ���� �ݺ���(for)�� ���ư��� 10�� �ݺ� �߿� 2�� ���� �������� 0�ΰ� ��.
				System.out.println(num1[i]+ " "); // num[i]���� "" �� ���
			}
		}
	}

}
