package sec01;

public class Chatting {
	String nickName = null;

	void startChat(String chatId) {
		nickName = chatId;
		// 로컬 클래스가 포함된 메소드의 필드는 기본적으로 final이 붙어서
		// 반드시 초기값. 값을 대입해야함.
		// inputData ="어서오세요";
		// 로컬 클래스의 메소드 안에 속한 필드는 해당범위에서만 사용가능함.
		class Chat {
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
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