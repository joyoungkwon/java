package sec02;

public class MovieThread  extends Thread{

	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			if(interrupted()) {
				System.out.println("동영상 재생중 오류가 발생했습니다.");
				break;
			}
		}
		System.out.println("동영상 종료중");
		System.out.println("동영상 종료");
	}
	
}
