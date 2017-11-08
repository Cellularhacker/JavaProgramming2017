//2017-11-08 KST ThreadJoin2.java
package threadExam;

public class ThreadJoin2 implements Runnable {
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		ThreadJoin2 ts = new ThreadJoin2();
		
		// 두 개의 Thread 생성
		Thread first = new Thread(ts, "first");
		Thread second = new Thread(ts, "second");
		
		first.start();
		
		// first thread join() 호출
		// main 쓰레드는 first쓰레드의 실행이 끝날 때 까지 block 됨
		try {
			first.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		// main쓰레드가 block되어 여기서부터는 first가 끝날때 까지 절대로 실행될 수 없음.
		second.start();
		// main thread으 마지막 명령문
		System.out.println("main thread end");
	}
}