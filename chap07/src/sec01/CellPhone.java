package sec01;

public class CellPhone {
	String model;
	String color;
	// ��ӹ����� private �� ������������
	// private �� ���� �޴� ������ ���� getter 
	// sat
	
	
	void powerOn() {System.out.println("������ŵ�ϴ�.");}
	void powerOff() {System.out.println("���������ϴ�.");}
	void bell() {System.out.println("���̿︳�ϴ�.");}
	void sedVoice(String message) {System.out.println("�ڱ�."+message);}
	void receiveVoice(String message) {System.out.println("����."+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
	//���� ���� �������� �⺻������ ����

}
