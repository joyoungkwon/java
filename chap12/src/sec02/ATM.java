package sec02;

public class ATM  implements Runnable {
	
	int Money=10000;
	int howMuch=1000;

	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i<10; i++) {
				//������Ʈ �޼ҵ�
				//������ �޼ҵ��� �ϳ��� ����
				notify();
				try {
					wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				if(getMoney()<=0)
					break;
				withDraw(1000);
			}
		}
	}

	public void withDraw(int Money) {
		if(getMoney()>0) {
			Money-=howMuch;
			System.out.print(Thread.currentThread().getName());
			System.out.println(" ���ذ��Ȱ� �ӻ���");
		}else {
			System.out.println(Thread.currentThread().getName());
			System.out.println("�ʵ� ¥����? ���� ¥����");
		}
	}
	public int getMoney() {
		return Money;
	}
	
	
	

	
	
}
