package sec04;

public class SuperCar {
	 int speed;
	 
	 int getSpeed() {
		 return speed;
	 }
	 void keyTurnOn() {
		 System.out.println("키를 돌립니다.");
	 }
	 void run() {  // 리턴값 없는 런이라는 메소드
		 for(int i= 10; i<=50; i+=10) { // 10부터 50 까지 반복  50 과 같아지면 종료 리턴값 없음 출력만 있음.
			 speed = i; 
			 System.out.println("달립니다.(시속" + speed +"km/h)");
			 //return 값 없이 출력 구문 //
		 }
	 }
}
