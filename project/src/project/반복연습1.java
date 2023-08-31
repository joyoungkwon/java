package project;

public class 반복연습1 {

	public static void main(String[] args) {

		// 반복문 for 반복의 횟수를 알고 있을때 .
		// while 반복횟수를 모르고 특정 조건에서 종료 하기를 원할때.-break; or false;

		int sum = 0;// 밖에서 , 사용하려고
		for (int i = 1; i <= 100; i++) { // 시작점 1부터 100이하까지 100번 반복
			sum += i;
		}
		System.out.println(sum); // sum 선언, 초기화이유
		
		
		
		
		int i = 1; 
		sum = 0;
		while (i <= 100) {

			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
