package sec01;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) { // �������̽� Ÿ�� ��ü �Ķ����.
		this.listener = listener;
	}
	void touch() {
		listener.onclick();
	}
	static interface OnClickListener{ //�߻� �޼ҵ� , ����ʵ� �� ���� ���� interface 
		// Ŭ���� �ȿ� �� �ʿ��� ����� �־�� �Ҷ�. �����ؾ� �ҋ�. ��ø interface ���
		void onclick();
	}
}
