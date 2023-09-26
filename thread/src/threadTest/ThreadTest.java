package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable t1 = new Thread2();
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1, "★");
		Thread thread2 = new Thread(t2, "♥");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
		
//		t1.run();
//		t2.run();
		
//		t1.start();
//		t2.start();
	}
}
