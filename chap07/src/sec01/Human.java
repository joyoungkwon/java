package sec01;

public class Human {
	int weight; // ������
	int height; // Ű
	String gender; // ����
	Human(){
		
	}
	
	Human(int weight , int heigt){
		this.weight = weight;
		this.height = heigt ;
	}
	
	
	void sleep() {
		System.out.println("������ϴ�.");
	}

	void awake() {
		System.out.println("�Ͼ�ϴ�");
	}

	String eat(String food) {
		String result = food + "�� �Խ��ϴ�";
		return result;
		// ���ϰ��� �ִ� �޼ҵ�� ���� Ÿ������
		// ���� ���� �ϰ� �޾Ƶ��̰�
		// ���� ������ ���.
		
		
	}

	String run(int speed) {
		String result = speed + "�ӵ��� �޸��ϴ�.";
		return result;
	}

}
