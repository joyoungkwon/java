package qhrkd;

import java.util.Scanner;

public class qhrkd3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 스캐너 입력
		int[] num1 = new int[10]; // 배열 10개짜리 생성 생성 과 값 만들기 타입좀 외우기
		System.out.println("정수10개입력"); // 정수 10개 출력구문
		
		for(int i =0; i < num1.length; i++) { // 배열의 정수 길이 만큼 i값 증가 시키기.
			num1[i]=s.nextInt(); // 배열의 인덱스 i 자리에 정수 값을 저장.
		}
		System.out.println("짝수는:"); // 짝수는
		for(int i =0; i<num1.length; i++) {// int i 값이 배열의 길이만큼 i ++
			if(num1[i]%2 ==0) { // 조건문 num[i]에 저장되어있는 정수 값들이 위에 반복문(for)로 돌아가서 10번 반복 중에 2로 나눠 나머지가 0인것 만.
				System.out.println(num1[i]+ " "); // num[i]값의 "" 를 출력
			}
		}
	}

}
