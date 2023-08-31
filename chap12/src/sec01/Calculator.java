package sec01;

public class Calculator {
	private int memory; // 인트타입 메모리
	
	public int getMemory() {// getMemory를 받아오는이름
		return memory;
	}
	public synchronized void setMeomry(int memory) { // synchronized 잠금장치 
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
		}
	}

