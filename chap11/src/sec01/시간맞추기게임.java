package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class �ð����߱���� {
	private String Enter; //�ʵ�
	private int time;

	public int Start() { // int return ���� �ִ� �ð����߱������ �޼ҵ�.
		Scanner s = new Scanner(System.in); // Scanner �� ����Ʈ
		Enter = s.nextLine(); // ���ͷ� �ѱ��. // Enter nextline ���� ������ ������ �ǳ� �ٱ�.
		Calendar now = Calendar.getInstance(); // Ķ������ü ���� Api
		time = now.get(Calendar.SECOND); // time ���� �ð�. (Api)�߿� ���� �ð��� Ǯ������ api�� time �� ����
		System.out.println("����ð�:" + time + "���Դϴ�"); // ���� �ð��� �̾ƿ°� time ���� �޾ƿ��� ������� ����ϴ� �޼ҵ�.
		return time;// time �� ���� return;.

	}

	public static void main(String[] args) { // main 
		�ð����߱���� game = new �ð����߱����(); // �ð����߱������ ��ü�� game �� ����.
		String names[] = { "ȫ�浿", "�嵿��" }; // String Ÿ���� names��� �迭�� �����ϰ� "ȫ�浿��""�嵿��"�� ����. 
		int time1, time2; // int time1�� int time2 �� ����.
		int times[] = new int[2]; // time �� ���� �ð��� ������ �迭

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�."); //���α��� �ݺ� �ʿ� x����. (�ݺ��� �ʿ��ϸ� �ݺ��� ������ �ֱ�)
		for (int i = 0; i < 2; i++) { // for 2�� i���� Ŭ������ �ݺ� 
			System.out.println(names[i]+" ����Ű enter");// ȫ�浿�� �ð��� time1�� �������� �ű�.(�������)
			//  line -33 �ð����߱�����̶�� Ŭ���� �ȿ� Start(); �޼ҵ� ȣ�� �ϰ� time1�� ����.
			// Start ��  = ���� Enter�� �ѱ�� (���ٰ���nextLine) Calendar API�� getInstance()�� �޴� �޼ҵ带 �ް�.
			// time �̶�� ������ now.get(Calendar.SECOND); �̶�� ���� �ð��� ���������, ��±������� Ȯ���ϸ�, time �� ������� ���� ��Ű��
			// Start��� �޼ҵ� line -33 end
			 time1 = game.Start();
			 System.out.println(names[i]+"10�� ������ enter");
			 time2 = game.Start(); // line 33 ���� ���� �� ����, 
			if (time1 > time2) { // for���� if ���ǹ�. time1(ȫ�浿)�� ���� �嵿��time2(�嵿��)�� ������ Ŭ��.
				times[i] = (time2 + 60) - time1; // times[i] ��°�� (time2 + 60) - time1 ; �� ���� ����. 
				// 
			} else {
				times[i] = time2 - time1;// (�ƴϸ� times[i] ��°�� time2 - time1;�� ����.
			}

		}
		if( times[0] > times[1] || times[1] >10) { // ���ǹ� time[0]��° ���� times[1]�溸�� ũ�ų� times[1] �� ���� 10 ���� ũ�ų� �ϸ�
			System.out.println("ȫ�浿 �� ���"+ times[0]+"�� �嵿�� �� ���"+times[1]+"���ڴ� ȫ�浿"); 
			
		}else {
			System.out.println("ȫ�浿 �� ���"+ times[0]+"�� �嵿�� �� ���"+times[1]+"���ڴ� �嵿��");
		}
	}
}
