package sec01;

public class NoteBook extends Computer{
	String cpu; //Cpu����
	String nvida;//�׷��� ����
	String wifi;//��������
	String bluetooth;//�������
	
	
	
	void wifiweb(){
		System.out.println("�������ͳݿ� �����մϴ�.");//���� ���ͳݿ� �����մϴ�
	}
	//���� ���콺�� �����մϴ�
	String mouse(String mouse) {
		String result = mouse+"�� ������ ���콺�� �����մϴ�";
		return result;
	}
	//������ ����
	String  airPodOn(String airPod) {
		String airPodOn = airPod+("�� �����մϴ�.");
		return airPodOn;
				
	}
	//������ ��������
	void airpodOff() {
		System.out.println("������ ������ ���� �մϴ�.");
	}

}
