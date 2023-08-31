package sec02.exam03;

public class SnowTire extends Tire {
	String modelName; // 모델 이름
	int cost; // 가격ㅁ
	String Design ="스노우 타이어!"; // 타이어 디자인
	@Override
	public void run()  {
		System.out.println("눈 덮인 숲속 마을 , 스노우 타이어가 대굴대굴 굴러갑니다!");
	}
	 void stop() {
		 System.out.println("눈덮인 숲속 마을에 스노우타이어 가 멈춰 섰습니다!");
	 }
	
	
	
}
