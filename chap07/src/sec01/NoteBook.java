package sec01;

public class NoteBook extends Computer{
	String cpu; //Cpu종류
	String nvida;//그래픽 종류
	String wifi;//와이파이
	String bluetooth;//블루투스
	
	
	
	void wifiweb(){
		System.out.println("무선인터넷에 연결합니다.");//무선 인터넷에 연결합니다
	}
	//무선 마우스를 연결합니다
	String mouse(String mouse) {
		String result = mouse+"란 종류의 마우스를 연결합니다";
		return result;
	}
	//에어팟 연결
	String  airPodOn(String airPod) {
		String airPodOn = airPod+("를 연결합니다.");
		return airPodOn;
				
	}
	//에어팟 연결해제
	void airpodOff() {
		System.out.println("에어팟 연결을 해제 합니다.");
	}

}
