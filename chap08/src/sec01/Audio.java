package sec01;

public class Audio implements RemoteControl {
	private int volume;

	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오볼륨 \t "+ this.volume);
	}

	@Override
	public void tunOn() {
		System.out.println("오디오를 켭니다");

	}

	@Override
	public void tunOff() {
		System.out.println("오디오를끕니다");
	}
}
