package sec01;

public class NotBookExample {

	public static void main(String[] args) {
		
		
		
		NoteBook notbook = new NoteBook();
		
		String game = notbook.playGame("BattleGround");
		System.out.println(game); //�θ�
		String gameoff = notbook.offGame("BattleGround");
		System.out.println(gameoff);
		
		String mouse = notbook.mouse("������ ������");// �ڽ� return �� �ִ� �޼ҵ�
		System.out.println(mouse);
		
		String result = notbook.airPodOn("������3");
		System.out.println(result);
		notbook.airpodOff();// �ڽ�
		
		notbook.web();// �θ�
		notbook.webx();//�θ�
		
		
		
		

	}

}
