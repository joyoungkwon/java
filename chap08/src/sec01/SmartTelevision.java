package sec01;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	// Searchble �� �߻� �޼ҵ��� ��ü �޼ҵ�
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	// RemoteControl �� �߻� �޼ҵ� 3���� ��ü �޼ҵ�
	public void tunOn() {
		System.out.println("����Ʈ Ƽ�� �մϴ�.");

	}

	public void tunOff() {
		System.out.println("����Ʈ Ƽ�� ���ϴ�.");
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
		System.out.println("���� Tv���� \t " + this.volume);
	}

}
