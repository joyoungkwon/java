package sec06;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	// Car Ŭ���� ���� ������� private
	// �ʵ� �� �̸� ����ȸ��� ���� �ӵ� = �ӵ��� �⺻�� 50
	// ���� ���� �޼ҵ�
	// �ӵ� ���� �޼ҵ� (���� , ����)
	// CarExample ����
	// ����� �Է� ���� - ��ĳ��
	// 1= ���� ���� 2�� �ӵ� ���� 3�� �ߴ� (�ߴ��Ҷ����� ���ѹݺ� �ݺ��� ���)
	// 1 ������ ���� ������ ����� �������� �ٲ�
	// 2�ӵ��� Ű������ a ����Ű �ӵ� ���� s= �ӵ� ����(10�� + - �� ����)
	// �� �ӵ��� -�� �ɼ� ���� 0 �̳�  case =3 break;
	// �Ű����� private �� ����
	// ���ǵ� �ʱⰪ 50
	private String name;
	private int speed = 50;
	private String color = "����";
	private int CarSpeed;

	// �⺻ ������ ����.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
		//color sc.next(
	}

	public void setColor() {
		System.out.println("������ �Է��ϼ���");
		String newColor = sc.next();
		color = newColor;
		System.out.println("���� ������" + getColor() + " �Դϴ�.");
	}

	// �ӵ� ���� ���� �޼ҵ�
	//����
//	int speedUp(int x) {
//		speed += x;
//		return speed;
//	}
//// ����
//	int speedDown(int x) {
//		speed -= x;
//		return speed;
//	}

	// ���� ���� �޼ҵ�

	String color(String x) {
		color = x;
		return color;
	}
	// �Ķ�

	
	
	public int getCarSpeed() {
		return CarSpeed;
	}

	public void setCarSpeed(int carSpeed) {
		CarSpeed = carSpeed;
	}

	public void setCarSpeed() {
		
		boolean b = true;
		while(b) {
			System.out.println("a�� �ӵ����� s�� �ӵ�����");
			char a = sc.next().charAt(0);
		switch(a) {
		case 'a':
			speed = getSpeed() + 10;
			b=false;
			break;
		case 's':
			if(getSpeed()<10) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			} else {
				speed -= 10;
				b=false;
				break;
			}
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		}
	}
	
	
	}


