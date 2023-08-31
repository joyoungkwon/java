package sec01;

public class Television implements RemoteControl {
	private int volume;

	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç Tvº¼·ý \t "+ this.volume);
	}

	public void tunOn() {
		System.out.println("Æ¼ºñ¸¦ ÄÕ´Ï´Ù");

	}

	public void tunOff() {
		System.out.println("Æ¼ºñ¸¦²ü´Ï´Ù");
	}
}
