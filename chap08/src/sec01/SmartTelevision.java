package sec01;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	// Searchble 의 추상 메소드의 실체 메소드
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

	// RemoteControl 의 추상 메소드 3개의 실체 메소드
	public void tunOn() {
		System.out.println("스마트 티비를 켭니다.");

	}

	public void tunOff() {
		System.out.println("스마트 티비를 끕니다.");
	}

	public void setVolume(int volume) {

	}

	public void setVolume1(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv볼륨 \t " + this.volume);
	}

}
