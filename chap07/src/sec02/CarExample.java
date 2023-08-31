package sec02;

public class CarExample {

	public static void main(String[] args) {
		   Car car = new Car(); //car 객체
		   //car 객체는 Car 클래스의 필드 메소드 사용가능 
		   
		   for(int i =1; i<=5; i++) { // 1부터 5까지 5번반복
			   int problemLocation =car.run();
			   switch(problemLocation) {
			   case 1:
				   System.out.println("앞왼쪽 한국 타이어로 교체");
				   car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				   break;
			   case 2:
				   System.out.println("앞오른쪽 금호 타이어로 교체");
				   car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				   break;
			   case 3:
				   System.out.println("뒤 왼쪽 한국타이어로 교체");
				   car.backRightTire = new HankookTire("뒤왼쪽", 14);
				   break;
			   case 4:
				   System.out.println("뒤 오른쪽 금호타이어로 교체");
				   car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				   break;
			   }
			   System.out.println("----------------------------");
		   }
		   
	}

}
