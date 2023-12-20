package section18;

public class MyThread extends Thread {

	@Override
	public void run() {
	
		System.out.println("My Thread 시작");
		
		try {
			Thread.sleep(2000); //2초 일시 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("My Thread 종료");
	}
}
