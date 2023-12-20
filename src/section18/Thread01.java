package section18;

/*
 * 스레드 (Thread)
 * 	프로그램 내에서 실행되는 프로그램의 제어 흐름 실행 단위
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업 단위
 * 	병렬 프로그래밍
 * 	비동기 프로그래밍
 * 	동시다발적 프로그래밍
 * 	구현은 run() 메서드, 실행은 start() 메서드
 * 	
 * 스레드 실행 방법
 * 	1. Thread 클래스 상속
 * 	2. run() 메서드 상속 후 오버라이드 구현
 * 	3. 1번에서 상속받은 클래스 객체 생성
 * 	4. start() 메서드로 병렬 실행
 * 
 */

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		new MyThread().start();
//		new MyThread().start(); 순차적으로 진행, 메인 시작 - 마이스레드 시작 - 마이스레드 종료 - 메인 종료
		try {
			Thread.sleep(1000); //2초 일시 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}
}
