//2017-11-08 KST ThreadJoin.java
package threadExam;

public class ThreadJoin implements Runnable {
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		ThreadJoin ts = new ThreadJoin();
		
		// 두 개의 Thread 생성
		Thread first = new Thread(ts, "first");
		Thread second = new Thread(ts, "second");
		
		first.start();
		second.start();
		
		// first thread join() 호출
		// main 쓰레드는 first쓰레드의 실행이 끝날 때 까지 block 됨
		try {
			first.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		//main thread의 마지막 명령문
		//first 쓰레드의 실행이 끝난 후에 출력됨
		System.out.println("main thread end");
	}
}