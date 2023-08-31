package sec01;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();

	}

}
