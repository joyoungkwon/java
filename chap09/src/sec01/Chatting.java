package sec01;

public class Chatting {
	String nickName = null;

	void startChat(String chatId) {
		nickName = chatId;
		// ���� Ŭ������ ���Ե� �޼ҵ��� �ʵ�� �⺻������ final�� �پ
		// �ݵ�� �ʱⰪ. ���� �����ؾ���.
		// inputData ="�������";
		// ���� Ŭ������ �޼ҵ� �ȿ� ���� �ʵ�� �ش���������� ��밡����.
		class Chat {
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sednMessage(message);
				}

			}

			void sednMessage(String message) {

			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}