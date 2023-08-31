package sec01;

public class JSum implements Runnable{

	@Override
	public void run() {
		int i;
		for(i=0; i<=10; i++) {
			if(i%3==0) {
				try {Thread.sleep(600);}catch(Exception e) {}
				System.out.println(i);
			}
		}
		
	}

}
