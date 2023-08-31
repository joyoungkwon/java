package sec01;

public class NotBookExample {

	public static void main(String[] args) {
		
		
		
		NoteBook notbook = new NoteBook();
		
		String game = notbook.playGame("BattleGround");
		System.out.println(game); //부모
		String gameoff = notbook.offGame("BattleGround");
		System.out.println(gameoff);
		
		String mouse = notbook.mouse("로지텍 지슈라");// 자식 return 값 있는 메소드
		System.out.println(mouse);
		
		String result = notbook.airPodOn("에어팟3");
		System.out.println(result);
		notbook.airpodOff();// 자식
		
		notbook.web();// 부모
		notbook.webx();//부모
		
		
		
		

	}

}
