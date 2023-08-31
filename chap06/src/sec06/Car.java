package sec06;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	// Car 클래스 생성 멤버변수 private
	// 필드 값 이름 제조회사명 색상 속도 = 속도의 기본값 50
	// 색상 변경 메소드
	// 속도 변경 메소드 (증가 , 감소)
	// CarExample 생성
	// 사용자 입력 받음 - 스캐너
	// 1= 색상 변경 2는 속도 변경 3은 중단 (중단할때까지 무한반복 반복문 사용)
	// 1 색상을 변경 했을때 출력은 빨강으로 바꿈
	// 2속도는 키보드의 a 방향키 속도 증가 s= 속도 감소(10씩 + - 로 변경)
	// 단 속도는 -가 될수 없음 0 이끝  case =3 break;
	// 매개변수 private 로 설정
	// 스피드 초기값 50
	private String name;
	private int speed = 50;
	private String color = "빨강";
	private int CarSpeed;

	// 기본 생성자 생성.

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
		System.out.println("색상을 입력하세요");
		String newColor = sc.next();
		color = newColor;
		System.out.println("현재 색상은" + getColor() + " 입니다.");
	}

	// 속도 증가 감소 메소드
	//증가
//	int speedUp(int x) {
//		speed += x;
//		return speed;
//	}
//// 감소
//	int speedDown(int x) {
//		speed -= x;
//		return speed;
//	}

	// 색상 변경 메소드

	String color(String x) {
		color = x;
		return color;
	}
	// 파랑

	
	
	public int getCarSpeed() {
		return CarSpeed;
	}

	public void setCarSpeed(int carSpeed) {
		CarSpeed = carSpeed;
	}

	public void setCarSpeed() {
		
		boolean b = true;
		while(b) {
			System.out.println("a는 속도증가 s는 속도감소");
			char a = sc.next().charAt(0);
		switch(a) {
		case 'a':
			speed = getSpeed() + 10;
			b=false;
			break;
		case 's':
			if(getSpeed()<10) {
				System.out.println("잘못입력하셨습니다.");
				break;
			} else {
				speed -= 10;
				b=false;
				break;
			}
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		}
	}
	
	
	}


