package sec02;

public class ATM  implements Runnable {
	
	int Money=10000;
	int howMuch=1000;

	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i<10; i++) {
				//오브젝트 메소드
				//쓰레드 메소드중 하나를 개움
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
			System.out.println(" 이해가안가 속상해");
		}else {
			System.out.println(Thread.currentThread().getName());
			System.out.println("너도 짜증나? 나도 짜증나");
		}
	}
	public int getMoney() {
		return Money;
	}
	
	
	

	
	
}
