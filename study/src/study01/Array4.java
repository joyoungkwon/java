package study01;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int []  num = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(num)); // �迭��ü�� ���ڿ��� ���Ͻ���
		// ��� �ϴ� Arrays. to stirng ���� �� Ÿ���� �Ķ���� ���� �� ���� ������ ���
		
		for (int i = 0; i<100; i++) {
			int n = (int)(Math.random()*10); // ���� n
			int temp = num[0]; // temp�� num �迭 0 �ε��� �� ����. (0)
			
			num[0]=num[n];// num[0]���� num[n]���� ����.
			num[n]=temp; // �������� ���� �ε��� ����. 
			// 100�� �ݺ�.
		}
		System.out.println(Arrays.toString(num));
	}

}
