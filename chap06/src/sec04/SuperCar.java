package sec04;

public class SuperCar {
	 int speed;
	 
	 int getSpeed() {
		 return speed;
	 }
	 void keyTurnOn() {
		 System.out.println("Ű�� �����ϴ�.");
	 }
	 void run() {  // ���ϰ� ���� ���̶�� �޼ҵ�
		 for(int i= 10; i<=50; i+=10) { // 10���� 50 ���� �ݺ�  50 �� �������� ���� ���ϰ� ���� ��¸� ����.
			 speed = i; 
			 System.out.println("�޸��ϴ�.(�ü�" + speed +"km/h)");
			 //return �� ���� ��� ���� //
		 }
	 }
}
