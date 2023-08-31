package src01;

public class 로또추첨 {

	public static void main(String[] args) {

		int num = 0; // 번호세팅
		int[] lotto = new int[6];// 로또 번호 배열생성
		boolean[] cheak = new boolean[46]; // 번호가 같은지 판단하는 배열
		// 1~45 필요하지만 배열은 0부터 시작 하므로 총 46개 생성
		for (int i = 0; i < lotto.length; i++) { // (2줄 번호 세팅 값)총 6개의 숫자 추출
			num = (int) (Math.random() * 45) + 1; // 랜덤 숫자 추출

			if (cheak[num] == false) {
				// boolean 은 초기값이 false 로 되어있음 (0)
				// 랜덤 숫자 자리를 뽑은적이 없으면 해당 숫자 추출하고
				// 해당 자리 값을 true로 변경함
				lotto[i] = num;
				cheak[num] = true;
			} else {
				i--;
			}
		}
		for (int j = 0; j < lotto.length; j++) {
			System.out.println(lotto[j] + " "); //뽑아진 숫자 출력
		}

	}

}
