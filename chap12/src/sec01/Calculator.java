package sec01;

public class Calculator {
	private int memory; // ��ƮŸ�� �޸�
	
	public int getMemory() {// getMemory�� �޾ƿ����̸�
		return memory;
	}
	public synchronized void setMeomry(int memory) { // synchronized �����ġ 
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
		}
	}

