package study01;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int sum = 0; // int Ÿ�� �� sum ���� �ʱ�ȭ
		float avrg = 0f; // float �Ǽ� Ÿ���� avrg �ʱ�ȭ
		int []score = {100, 88 , 100 , 100 , 90}; // int Ÿ���� score�迭 ����
		
		for(int i =0; i<score.length; i++) { // for ��
			sum +=score[i]; // �ʱ�ȭ�� ���� ������ ����ϱ� ���� ������ sum�� score [i]��°
			// sum �� ���� ����.
		}
		avrg = sum/(float)score.length; 
		//�Ǽ� �������� avrg�� ĳ���� ��Ų score �� sum���� ���� ����.
		
		System.out.println("���� : " +sum);
		System.out.println("���  : " +avrg);
		}
	}


