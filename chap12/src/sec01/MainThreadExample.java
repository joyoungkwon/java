package sec01;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); //��ü����
		// Caclculator ���� �ٸ޸𸮷� �̸��� �о���̴� �޼ҵ��
		// �¸޸𸮷� �̸��� ���ý�Ű�� �޼ҵ尡����
		// �� �޸𸮴� �̸��� ���� ��Ű�� try�� ������ ���� �ϰԲ� �����忡�� �������� �ְ� �״����� �������������� 
		//catch �� �������ڸ� ��Ƴ�.

		User1 user1 = new User1(); // user1 ��ü����
		user1.setCalculator(calculator); // user1 �� setCalculator �� �Ķ���ͷ� �޴� ������ ȣ��
		user1.start(); // user1 �� run �޼ҵ� ȣ���� start����. 
		//run �� �ٳ������� �޾ƿ� �޸��� ���� sat���� �ʱ⼼���ϴ� �޼ҵ尡����

		User2 user2 = new User2(); //user2 ��ü
		user2.setCalculator(calculator); // user2 �� setCalculator�� �Ķ���ͷ� ����
		user2.start();//run �� �ٳ������� �޾ƿ� �޸��� ���� sat���� �ʱ⼼���ϴ� �޼ҵ尡����


	}

}
