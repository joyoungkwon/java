
public class Anonymous {
	
	Worker field= new Worker() { // Worker �� �͸� ��ü ����
		// ��ȸ�� 

		@Override
		public void start() {
			System.out.println("�������� �մϴ�.");
		}
		// Worker �� �޼ҵ� �� �͸�ü�� �������̵�.
	};
	
	void method1() {
		Worker localVar = new Worker() {

			@Override
			public void start() {
				System.out.println("������ �մϴ�.");
			}
			// �޼ҵ� �������̵�.
			
		};
		localVar.start(); // �������̵� ȣ��.
	}
	
	
	void method2(Worker worker) {
		worker.start();
	}
	
	
}
