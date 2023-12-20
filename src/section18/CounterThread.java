package section18;

public class CounterThread extends Thread {
	//수정필요
	@Override
	public void run() {
		System.out.println("CounterThread 시작");

		CounterThread ct = new CounterThread();
		ct.start();
		CounterThread ct2 = new CounterThread();
		ct2.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() + "-");

			System.out.println(i);
		}
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("CounterThread 종료");
	}
}
