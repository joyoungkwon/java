package sec06;

import sec06.Car;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Scanner s = new Scanner(System.in);
		System.out.println("원하시는 작업을 선택하세요");
		// 1은 색상 변경 String colorR , or String colorB
		// 2는 속도 변경 SpeedUp , SpeedDown
		// 3은 중단 ( 중단 될때까지 무한 반복 큰틀)
		boolean run = true;
		while(run) {
			System.out.println("1은 색상 변경 ,2는 속도변경 , 3은 중단");
			System.out.printf("현재 색상은 %s 현재 속도는 %d 입니다.",car.getColor(),car.getSpeed());
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
			System.out.println("잘못입력");
		}
		}
		
		
		
		
		
		
		
	}

}
