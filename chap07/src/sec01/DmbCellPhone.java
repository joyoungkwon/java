package sec01;
 // extends - 상속 ,+ 클래스 이름
 // 자식 에서 부모의 요소중 물려받을걸 정함 상속
public class DmbCellPhone extends CellPhone {
	int channel;

	// 객체 생성때 model color channel 입력
	DmbCellPhone(String model, String color, int channel) {
		this.channel = channel;
		this.color = color; // 상속받은 필드
		this.model = model; // 상속 받은 필드
	}

	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("방송수신을 멈춥니다.");
	}
}
