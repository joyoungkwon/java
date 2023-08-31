package sec02;

import java.sql.Driver;

public class DirverExample {

	public static void main(String[] args) {
		
		
		Dirver driver = new Dirver(); // dirver 객체 생성 
		Bus bus = new Bus(); //Bus객체 생성
		Taxi taxi = new Taxi(); // taxi 객체 생성
		
		bus.run();
		
		//driver.dirver(); drive 메소드는 파라미터 값이 있어야함 파라미터 값은 클래스임.
		 driver.dirver(taxi); // 파라미터 값을 클래스로 요하는 메소드 값을 메소드로 줌
		 
		 // int x = 3
		 // int y = 5
		 // double t = x/y  안됌
		 // double t = (double)x/y; 와 같이 강제형변환 처럼 메소드도 타입변환이 이루어짐
		 // Vehicle 을 상속 받은 taxi 와 bus 클래스는 Vehicle vehicle = new Taxi();를
		 // Vehicle vehicle = Taxi 라 표기 할수 있음
		 
		 // 상속 되었다가 상속 벗어날때 클래스 강제 타입변환 가능
		 
	}

}
