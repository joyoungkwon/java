package sec01;

public class ThreadNameExmaple {

	public static void main(String[] args) {
		
		Thread  mainThread = Thread.currentThread();
		System.out.println("�⺻ �������� �̸� : "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("���� �۾��ϴ� ������ A�� �̸��� :"+ threadA.getName());
		threadA.start();
		ThreadB threadB = new ThreadB();
		System.out.println("���� �۾��ϴ� ������ B�� �̸��� :"+ threadB.getName());
		threadB.start();
		// �������� ���� ���Ŀ� �ε��� ���� �迭�� ���� 0
		
	}

}
