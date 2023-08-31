package sec01;

public class ExitExample {

	public static void main(String[] args) {
		// 1부터 100까지 짝수만 출력하되, 만약 숫자가 50이 나오면 중지 해라
		// 순서 업다운 햇갈리지않기.
		// ㅠㅠ 다했는데 진짜루 순서 햇갈려서 망했다..
		// if 순서 햇갈리지않기
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println("종료");
				System.exit(0);
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
