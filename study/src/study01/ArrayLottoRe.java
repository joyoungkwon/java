package study01;

public class ArrayLottoRe {

	public static void main(String[] args) {
		int lotto [ ] = new int [6]; // int 타입 배열 만들고.
		
		for(int i = 0 ; i <lotto.length ;i++) { //for 배열의 요소 뽑을 
			lotto[i] = (int)(Math.random()*45)+1; // 랜덤 함수 를 lotto 배열 i 번쨰 저장시키고,
			for(int j = 0; j<i; j++) { // 이중 포문으로 j가 i 번쨰 까지 멈추는 포문을 생성한다.
				if(lotto[i]== lotto[j]) { // if looto [i] 와 lotto[j] 
					i--; // i-- ? 이거 예린이한테 물어보기.
					break; // 스탑.
				}
			}
		}
		System.out.print("로또 출력 번호는"+" "); 
		for(int i =0; i<lotto.length; i++) { 
			System.out.print(lotto[i]+" ");
		}
	}
}