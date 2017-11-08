//2017-11-08 KST ThreadPriority.java
package threadExam;

public class ThreadPriority implements Runnable {
	public void run() {
		for(int i=1; i<21; i++) {
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	public static void main(String[] args) {
		ThreadPriority tl = new ThreadPriority();
		
		Thread first = new Thread(tl, "first");
		Thread second = new Thread(tl, "second");
		Thread third = new Thread(tl, "third");
		
		// Thread의 우선순위를 출력
		System.out.println("first priority = " + first.getPriority());
		System.out.println("second priority = " + second.getPriority());
		System.out.println("third priority = " + third.getPriority());
	}
}