package sec06;

import sec06.Car;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Scanner s = new Scanner(System.in);
		System.out.println("���Ͻô� �۾��� �����ϼ���");
		// 1�� ���� ���� String colorR , or String colorB
		// 2�� �ӵ� ���� SpeedUp , SpeedDown
		// 3�� �ߴ� ( �ߴ� �ɶ����� ���� �ݺ� ūƲ)
		boolean run = true;
		while(run) {
			System.out.println("1�� ���� ���� ,2�� �ӵ����� , 3�� �ߴ�");
			System.out.printf("���� ������ %s ���� �ӵ��� %d �Դϴ�.",car.getColor(),car.getSpeed());
			int choice = s.nextInt();
		switch(choice) {
		case 1:
			car.setColor();
			break;
		case 2:
			car.setCarSpeed();
			break;
		case 3:
			run = false;
			break;
		default:
			System.out.println("�߸��Է�");
		}
		}
		
		
		
		
		
		
		
	}

}
