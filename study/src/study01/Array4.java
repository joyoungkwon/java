package study01;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int []  num = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(num)); // 배열자체를 문자열로 리턴시켜
		// 출력 하는 Arrays. to stirng 쓸때 쓸 타입의 파라미터 값을 잘 보고 선택후 출력
		
		for (int i = 0; i<100; i++) {
			int n = (int)(Math.random()*10); // 난수 n
			int temp = num[0]; // temp의 num 배열 0 인덱스 값 저장. (0)
			
			num[0]=num[n];// num[0]값의 num[n]난수 대입.
			num[n]=temp; // 난수값의 제로 인덱스 대입. 
			// 100번 반복.
		}
		System.out.println(Arrays.toString(num));
	}

}
