package study02;

public class For4 {

	public static void main(String[] args) {
		for(int i = 0 ; i<5; i++) {
			for(int j = 0; j>=i; j++) {
				System.out.print("s ");
			}
			for(int c = 4; c>=i; c-- ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
