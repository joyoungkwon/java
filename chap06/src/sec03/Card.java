package sec03;

public class Card {
	
	private String cardName;     // ���� ���� �޼ҵ�
	public Card() {
		this("����");            // ó���� "����" ����  �ƹ��͵� ���� ���� ������ ����� ���
	}
	public Card(String cardName) {      // �޼ҵ�ȿ��� �ʱ�ȭ ��Ŵ
		this.cardName= cardName;        // �޼ҵ� �ȿ��� �ʱ�ȭ ��Ų�� this �� ����
	}
	public void getCard() {
		System.out.println("ī���� "+this.cardName +"�Դϴ�."); // 5~7�� ó�� ���� ������ ������ �ٷ� ���
		// ������ ���� ������ 2�� ������ ���ļ� ���븦 �ʱ�ȭ �ϰ� this �� ���� ���� �Ｚ�� �����
	}
	public static void main(String[] args) {// ���α���
		Card card1 = new Card(); // ���� ������ ���� �ʾ� 1�� ������ �� 3�� �����ڸ� ��ħ
		Card card2 = new Card("�Ｚ"); // ���� ������ �־� 2�� �����ڿ� 3�� ��ħ
		
		card1.getCard();
		card2.getCard();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
