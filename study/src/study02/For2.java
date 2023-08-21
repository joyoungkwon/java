package study02;

public class For2 {

	public static void main(String[] args) {
		for(int i =0; i<5; i++) { // i 가  5 까지 반복 하는 for 문 위해 행 몇번째 까지 찍겠다. (몇줄)
			for(int j = 5; j> i ;j--) {// (그 줄 안에 별을 몇개를 찍을 지, 어떻게 찍을지 
				// j 가 첫줄에 5개, 로 설정, 
				System.out.print("*"); 
			}
			System.out.println(" ");
		}

	}

}
