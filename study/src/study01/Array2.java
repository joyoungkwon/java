package study01;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int sum = 0; // int 타입 의 sum 변수 초기화
		float avrg = 0f; // float 실수 타입의 avrg 초기화
		int []score = {100, 88 , 100 , 100 , 90}; // int 타입의 score배열 생성
		
		for(int i =0; i<score.length; i++) { // for 문
			sum +=score[i]; // 초기화와 전역 변수로 사용하기 위해 선언한 sum의 score [i]번째
			// sum 에 누적 저장.
		}
		avrg = sum/(float)score.length; 
		//실수 전역변수 avrg에 캐스팅 시킨 score 를 sum으로 나눠 저장.
		
		System.out.println("총합 : " +sum);
		System.out.println("평균  : " +avrg);
		}
	}


