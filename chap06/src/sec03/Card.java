package sec03;

public class Card {
	
	private String cardName;     // 접근 제한 메소드
	public Card() {
		this("현대");            // 처음에 "현대" 값줌  아무것도 적혀 있지 않으면 현대로 출력
	}
	public Card(String cardName) {      // 메소드안에서 초기화 시킴
		this.cardName= cardName;        // 메소드 안에서 초기화 시킨걸 this 로 받음
	}
	public void getCard() {
		System.out.println("카드사는 "+this.cardName +"입니다."); // 5~7번 처럼 값이 정해져 있을땐 바로 출력
		// 정해져 있지 않으면 2번 생성자 거쳐서 현대를 초기화 하고 this 로 값을 받은 삼성을 출력함
	}
	public static void main(String[] args) {// 메인구문
		Card card1 = new Card(); // 값이 정해져 있지 않아 1번 생성자 와 3번 생성자를 거침
		Card card2 = new Card("삼성"); // 값이 정해져 있어 2번 생성자와 3번 거침
		
		card1.getCard();
		card2.getCard();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
