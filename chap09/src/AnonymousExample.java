
public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1(); // �޼ҵ� ȣ��
		anony.method2( // �Ķ���� ���� ��ü�� �ѱ�� �޼ҵ�.
				new Worker() { // Worker �� �͸� ��ü ����

					@Override
					public void start() {
						System.out.println("�׽�Ʈ�մϴ�."); // �������̵�
					}
					
				}
				);

	}

}
