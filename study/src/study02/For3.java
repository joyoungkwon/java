package study02;

public class For3 {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) { // 줄바꿈 for 몇번쨰 뽑을껀지 i 가 0일때
//			for (int j = 4; j > i; j--) { // 1행에서 공백을 네게로 새팅 하고 그뒤로 줄어드는
//				// 공백 출력하는 j 를 선언 후 j가 i보다 작을때 까지 공백을 찍게 하고, i랑 같으면 멈추는 for
//				System.out.print("s"); // 공백 출력
//				// 2중포문 끝.
//			}
//			for (int c = 0; c <= i; c++) { // 첫번 째 포문안에 있는 포문. 아직 i 는 0
//				// 새로운 c 변수 선언및 초기화 0, i랑 같을 때 별 하나 찍음.
//				System.out.print("*"); 
//			}
//			System.out.println();
//		}

		
		for(int i =0 ; i<5; i++) {
			for(int j =4 ; j>i; j--) {
				System.out.print(" ");
			}
			for(int c = 0; c<=i; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
